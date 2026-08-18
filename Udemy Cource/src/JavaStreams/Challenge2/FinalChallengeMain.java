package JavaStreams.Challenge2;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FinalChallengeMain {
    static void main(String[] args) {
        Course pymc= new Course("PYMC", "Python Masterclass", 50);
        Course jmc= new Course("JMC", "Java Masterclass", 100);
        Course ccj= new Course("CCJ", "Creating Games in Java");

        int currentYear = LocalDate.now().getYear();
        List<Student> studentList = Stream
                .generate(() -> Student.getRandomStudent(jmc, pymc, ccj))
                .filter(s -> s.getYearEnrolled() >= (currentYear - 4))
                .limit(10_000)
                .toList();

        System.out.println(studentList
                .stream()
                .mapToInt(Student::getYearEnrolled)
                .summaryStatistics());

        studentList.subList(0,10).forEach(System.out::println);

        System.out.println(studentList
                .stream()
                .mapToInt(s -> s.getEngagementMap().size())
                .summaryStatistics());

        var mappedActivity = studentList.stream()
                .flatMap(s -> s.getEngagementMap().values().stream())
                .collect(Collectors.groupingBy(CourseEngagement::getCourseCode,
                        Collectors.counting()));
        mappedActivity.forEach((k, v) -> System.out.println(k + " " + v));

        var classCounts = studentList.stream()
                .collect(Collectors.groupingBy(s -> s.getEngagementMap().size(),
                        Collectors.counting()));
        classCounts.forEach((k, v) -> System.out.println(k + " " + v));

        var avrCompleted = studentList.stream()
                .flatMap(s -> s.getEngagementMap().values().stream())
                .collect(Collectors.groupingBy(CourseEngagement::getCourseCode,
                        Collectors.averagingDouble(CourseEngagement::getPercentComplete)));
        avrCompleted.forEach((k, v) -> System.out.println(k + " " + v));

        var yearMap = studentList.stream()
                .flatMap(s -> s.getEngagementMap().values().stream())
                .collect(Collectors.groupingBy(CourseEngagement::getCourseCode,
                        Collectors.groupingBy(CourseEngagement::getLastActivityYear,
                                Collectors.counting())));

        yearMap.forEach((k, v) -> System.out.println(k + " " + v));

        studentList.stream()
                .flatMap(s -> s.getEngagementMap().values().stream())
                .collect(Collectors.groupingBy(CourseEngagement::getEnrollmentYear,
                        Collectors.groupingBy(CourseEngagement::getCourseCode,
                        Collectors.counting())))
                .forEach((k, v) -> System.out.println(k + " " + v));
    }
}
