import java.util.Scanner;
import java.util.Arrays;

public class Enter_values_in_Arrays {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Enter number of foods: ");
        n = scanner.nextInt();
        scanner.nextLine();
        String[] foods = new String[n];

        for (int i = 0; i < foods.length; i++) {
            System.out.print("Enter food " + (i+1) + "(type q for escape): ");
            String input = scanner.nextLine();
            if (input.equals("q")) {
                break;
            } else {
                foods[i] = input;
            }
        }

        for (String food: foods) {
            if (food != null) {
                System.out.println(food);
            }
        }

    }
}
