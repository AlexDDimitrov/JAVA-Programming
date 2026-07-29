package JavaOOP;

import java.util.SplittableRandom;

public class Worker {
    final int CURRENT_YEAR = 2026;

    private String name;
    private String birthDate;
    protected String endDay;

    public Worker() {

    }

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge() {
        int birthYear = Integer.parseInt(birthDate.substring(6));

        return CURRENT_YEAR - birthYear;
    }

    public double collectPay() {
        return 0.0;
    }

    public void terminate(String endDate) {
        this.endDay = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "CURRENT_YEAR=" + CURRENT_YEAR +
                ", name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDay='" + endDay + '\'' +
                '}';
    }
}
