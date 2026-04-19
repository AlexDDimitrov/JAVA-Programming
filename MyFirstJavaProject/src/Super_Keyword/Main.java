package Super_Keyword;

public class Main {
    public static void main(String[] args){
        //super == parent class; calls the parent constructor
        Person person = new Person("Alex", "Dimitrov");
        person.showName();

        Student student = new Student("Alex", "Dimitrov", 3.5);
        student.showName();
        student.showGpa();

        Employee employ = new Employee("Alex", "Dimitrov", 138042);
        employ.showSalary();
    }
}
