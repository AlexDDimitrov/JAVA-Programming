package MasteringJavaCollections;

import java.util.ArrayList;
import java.util.*;

// Queue - designed for holding elements prior to processing
//      - FIFO
//      - LIFO (Stack)

// Set - conceptually based off of a mathematical sey, t has no duplicate elements

// Map - stores key and value pairs: keys are a set, values are a collection
//      - Keys are unique, values aren't

// Polymorphic algorithm - reusable functionality


public class JavaCollections {
    static void main(String[] args) {
        Collection<String> list = new HashSet<>();
        //HashSet - unordered
        //TreeSet - ordered
        //no sort method available for collection interface


        String[] names = {"Anna", "Bob", "Carol"};
        list.addAll(Arrays.asList(names));
        System.out.println(list);

        System.out.println(list.contains("Bob"));

        list.removeIf(s-> s.charAt(0) == 'C');
        System.out.println(list);


    }
}
