public class Printf {
    public static void main(String[] args) {
        String name = "Alex";
        char firstLetter = 'A';
        int age = 15;
        double height = -170.5305860;
        boolean isStudent = true;
        //souf + tab -> System.out.printf("");
        System.out.printf("Hello %s\n", name);
        System.out.printf("First letter %c\n", firstLetter);
        System.out.printf("Age of %s is %d\n",name ,age);
        System.out.printf("Height is %.2f\n", height);
        System.out.printf("Height is %+.2f\n", height);
        System.out.printf("Height is %(.2f\n", height);
        System.out.printf("Height is % .2f\n", height);

        height = 170.5305860;
        System.out.printf("Height is %.2f\n", height);
        System.out.printf("Height is %+.2f\n", height);
        System.out.printf("Height is %(.2f\n", height);
        System.out.printf("Height is % .2f\n", height);

        height = 220302537365.;
        System.out.printf("Height is %,.2f\n", height);
        System.out.printf("Is he a student - %b\n", isStudent);

        //+ - output + or -
        //, - comma grouping separator
        // ( - negative numbers are enclosed
        //space - display a minus if negative, space if positive


        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%d\n", id1);
        System.out.printf("%d\n", id2);
        System.out.printf("%d\n", id3);
        System.out.printf("%d\n", id4);

        System.out.printf("%4d\n", id1);
        System.out.printf("%4d\n", id2);
        System.out.printf("%4d\n", id3);
        System.out.printf("%4d\n", id4);

        System.out.printf("%-4d\n", id1);
        System.out.printf("%-4d\n", id2);
        System.out.printf("%-4d\n", id3);
        System.out.printf("%-4d\n", id4);

        System.out.printf("%04d\n", id1);
        System.out.printf("%04d\n", id2);
        System.out.printf("%04d\n", id3);
        System.out.printf("%04d\n", id4);
    }
}
