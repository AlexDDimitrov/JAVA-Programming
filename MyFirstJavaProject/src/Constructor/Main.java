package Constructor;

public class Main {
    public static void main(String[] args) {
        Students Student1 = new Students("Alex", 15, 3.5);
        Students Student2 = new Students("Eli", 15, 1.2);
        System.out.println(Student1.name);
        System.out.println(Student1.age);
        System.out.println(Student1.gpa);
        System.out.println(Student1.isEnrolled);
        System.out.println();
        System.out.println(Student2.name);
        System.out.println(Student2.age);
        System.out.println(Student2.gpa);
        System.out.println(Student2.isEnrolled);

        System.out.println();
        Student1.study();
        Student2.study();

    }
}
