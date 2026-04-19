package HashMaps;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        //HashMap - a data structure that stores key-value pairs
        //keys are unique but Values can be duplicated
        //does not maintain any order, but is memory efficient
        //HashMap<key,Value>

        HashMap<String, Double> map = new HashMap<>();
        map.put("apple", 0.50);
        map.put("orange", 0.75);
        map.put("banana", 0.25);
        System.out.println(map);

        map.put("orange", 1.00);
        map.put("coconut", 1.00);
        map.remove("apple");
        System.out.println(map);

        System.out.println(map.get("banana"));

        System.out.println(map.containsKey("banana"));//containValue()
        /*
            if(map.containsKey("apple") {----} else {----}
        */
        //map.size()
        for(String key: map.keySet()) {
            System.out.println(key + ": $" + map.get(key));
        }
    }
}
