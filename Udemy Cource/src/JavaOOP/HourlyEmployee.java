package JavaOOP;

public class HourlyEmployee extends Employee{
    private double hourlyRayRate;

    public HourlyEmployee(String name, String birthDate, String hireDate, double hourlyRayRate) {
        super(name, birthDate, hireDate);
        this.hourlyRayRate = hourlyRayRate;
    }

    @Override
    public double collectPay() {
        return 40 * hourlyRayRate;
    }

    public double getDoublePay() {
        return 2 * collectPay();
    }
}
