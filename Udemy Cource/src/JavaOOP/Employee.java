package JavaOOP;

public class Employee extends Worker{
    private  long id;
    private String hireDate;

    private static int employeeNo = 1;

    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        this.id = Employee.employeeNo++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", hireDate='" + hireDate + '\'' +
                '}';
    }
}
