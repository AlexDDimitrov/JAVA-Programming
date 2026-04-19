package Generics;

import javax.naming.InsufficientResourcesException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Generics - a concept where you can write a class, interface or method
        //possible with different data types
        //<T> - type parameter
        //<String> - type argument

        /*ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");*/

        Box<Integer> box = new Box<>();
        box.setItem(3);
        System.out.println(box.getItem());

        Product<String, Double> product = new Product<>("apple", 0.50);
        System.out.println(product.getItem());
        System.out.println(product.getPrice());

        Product<String, Integer> product2 = new Product<>("Ticket", 15);
        System.out.println(product2.getItem());
        System.out.println(product2.getPrice());
    }
}
