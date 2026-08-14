package Generics.Challenge2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

record Employee(String name) implements QueryItem {

    @Override
    public boolean matchFieldValue(String fieldName, String value) {
        return false;
    }
}

public class Main {
    static void main(String[] args) {
        QueryList<LPAStudent> queryList = new QueryList<>();
        for (int i = 0; i < 25; i++) {
            queryList.add(new LPAStudent());
        }

        System.out.println("Ordered");
        queryList.sort(Comparator.naturalOrder());
        printList(queryList);

        System.out.println("Matches");
        var matches = queryList.getMatches("PercentComplete", "50").getMatches("Course", "Java");
        matches.sort(new LPAStdComparator());
        printList(matches);


        System.out.println("Ordered");
        matches.sort(null);
        printList(matches);

    }

    static void printList(List<?> students) {
        for(var s : students) {
            System.out.println(s);
        }
    }
}
