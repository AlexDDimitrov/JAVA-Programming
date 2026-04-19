public class logical_Operators {

    public static void main(String[] args) {
        //&& - and
        //|| - or
        //! - not

        double temp = 26;

        if (temp <= 30 && temp >= 0) {
            System.out.println("Good weather");
        }

        boolean isSunny = false;

        if (temp <= 30 || isSunny) {
            System.out.println("Either its sunny or its good weather");
        }

        if (!isSunny) {
            System.out.println("Its not sunny");
        }
    }
}
