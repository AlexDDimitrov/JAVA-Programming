package JavaStreams.Challenge2;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class MainChallenge {
    static void main(String[] args) {
        Course pymc= new Course("PYMC", "Python Masterclass", 50);
        Course jmc= new Course("JMC", "Java Masterclass", 100);
        Course ccj= new Course("CCJ", "Creating Games in Java");

        List<Student> students =
                Stream.generate(() -> Student.getRandomStudent(jmc, pymc))
                        .limit(5000)
                        .toList();

        double percentComplete = (students.stream()
                .mapToDouble(s -> s.getPercentComplete("JMC"))
                .reduce(0, Double::sum)) / students.size();

        System.out.printf("AVR pc = %.2f%% %n", percentComplete);

        System.out.printf("Best pc = %d%% %n", (int) (percentComplete * 1.25));

        Comparator<Student> longTermStudent
                = Comparator.comparing(Student::getYearEnrolled);

        List<Student> studentToAward = students.stream()
                .filter(s -> s.getMonthsSinceActive("JMC") == 0)
                .filter(s -> s.getPercentComplete("JMC") >= (int) (percentComplete * 1.25))
                .sorted(longTermStudent)
                .limit(10)
                .toList();

        studentToAward.forEach(s -> {
            s.addCourse(ccj);
            System.out.print(s.getStudentId() + " ");
        });
    }
}
