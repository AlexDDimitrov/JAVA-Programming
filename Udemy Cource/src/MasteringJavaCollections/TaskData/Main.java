package MasteringJavaCollections.TaskData;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Set<Task> tasks = TaskData.getTasks("all");
        sortAndPrint("All Tasks", tasks);

        Comparator<Task> sortByPriority = Comparator.comparing(Task::getPriority);
        Set<Task> annsTasks = TaskData.getTasks("Ann");
        sortAndPrint("Ann's Tasks", annsTasks, sortByPriority);

        Set<Task> bobsTask = TaskData.getTasks("Bob");
        Set<Task> carolsTask = TaskData.getTasks("Carol");
        List<Set<Task>> sets = List.of(annsTasks, bobsTask, carolsTask);

        Set<Task> tasks1 = getUnion(sets);
        sortAndPrint("Assigned tasks", tasks1);

        Set<Task> tasks2 = getUnion(List.of(tasks1, tasks));
        sortAndPrint("All tasks", tasks2);

        Set<Task> missing = getDiff(tasks2, tasks);
        sortAndPrint("All tasks", missing);

        Set<Task> unassigned = getDiff(tasks, tasks1);
        sortAndPrint("Unassogned: ", unassigned, sortByPriority);

        Set<Task> overlap = getUnion(List.of(getIntersect(annsTasks, bobsTask),
                    getIntersect(carolsTask, bobsTask),
                    getIntersect(annsTasks, carolsTask)
                ));
        sortAndPrint("Overlapped: ", overlap, sortByPriority);


    }

    private static void sortAndPrint(String header, Collection<Task> collection) {
        sortAndPrint(header, collection, null);
    }

    private static void sortAndPrint(String header, Collection<Task> collection,
                                     Comparator<Task> sorter) {

        String lineSeparator = "_".repeat(90);
        System.out.println(lineSeparator);
        System.out.println(header);
        System.out.println(lineSeparator);

        List<Task> list = new ArrayList<>(collection);
        list.sort(sorter);
        list.forEach(System.out::println);
    }

    private static Set<Task> getUnion(List<Set<Task>> sets) {
        Set<Task> union = new HashSet<>();
        for (var teaksSet : sets) {
            union.addAll(teaksSet);
        }
        return union;
    }

    private static Set<Task> getIntersect(Set <Task> a, Set <Task> b) {
        Set<Task> intersect = new HashSet<>(a);
        intersect.retainAll(b);
        return intersect;
    }

    private static Set<Task> getDiff(Set<Task> a, Set<Task> b) {
        Set<Task> diff = new HashSet<>(a);
        diff.removeAll(b);
        return diff;
    }
}
