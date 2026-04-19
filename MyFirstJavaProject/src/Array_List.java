import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Array_List {
    public static  void main(String[] args) {
        //array list - resizable array that stores objects

        /*ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        System.out.println(fruits);

        fruits.remove(0);
        System.out.println(fruits);

        fruits.set(0, "Pineapple");
        System.out.println(fruits);

        System.out.println(fruits.get(0));
        System.out.println(fruits.size());
        Collections.sort(fruits);
        System.out.println(fruits);

        for(String fruit: fruits) {
            System.out.println(fruit);
        }*/

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> foods = new ArrayList();
        System.out.print("Number of food: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        for (int i = 1; i <= number; i++){
            System.out.print("Enter food" + i + ": ");
            String food = scanner.nextLine();
            foods.add(food);
        }
        System.out.println(foods);
        scanner.close();

    }
}
