package JavaTypeSizes;

public class Float_Double {
    public void main(String[] args) {
        float a = 34.43f;

        //double - faster, better, many library functions return double
        double b = 3.2E-23d;

        System.out.println(a);
        System.out.println(b);

        System.out.printf("%-3e\n", b);

        double pounds = 200.0;

        double kilograms = pounds * 0.45359237;

        System.out.printf("%.1f pounds is equal to %.2f kilograms\n", pounds, kilograms);

    }
}
