import java.util.Scanner;

public class Break_Continue {
    public static void main(String[] args) {

        for (int i = 0; i<10; i++) {
            if (i == 5) {
                break;
            }
            if (i == 3) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
