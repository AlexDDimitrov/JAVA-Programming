package MasteringMoreJavaTypesAndArrays;

import java.util.LinkedList;
import java.util.Scanner;

record Place(String name, int distance) {
    @Override
    public String toString() {
        return String.format("%s (%d)", name, distance);
    }
}

public class LinkedListChallenge {

    static void main(String[] args) {
        LinkedList<Place> places = new LinkedList<>();

        addPlace(places, new Place("Adelaide", 1374));
        addPlace(places, new Place("Brisbane", 917));
        addPlace(places, new Place("Perth", 3923));
        addPlace(places, new Place("Alice Springs", 2771));
        addPlace(places, new Place("Darwin", 3972));
        addPlace(places, new Place("Melbourne", 877));

        places.addFirst(new Place("Sydney", 0));
        System.out.println(places);

        var iterator = places.listIterator();
        Scanner scanner = new Scanner(System.in);
        boolean quitLoop = false;
        boolean forward = true;

        printMenu();

        while (!quitLoop) {
            if (!iterator.hasPrevious()) {
                System.out.println("Originating: " + iterator.next());
                forward = true;
            }

            if (!iterator.hasNext()) {
                System.out.println("Final: " + iterator.previous());
                forward = false;
            }

            System.out.print("Enter Value: ");
            String menuItem = scanner.nextLine().trim().toUpperCase().substring(0,1);
            switch (menuItem) {
                case "F" -> {
                    System.out.println("Forward");
                    if(!forward) {
                        forward = true;
                        if (iterator.hasNext()) {
                            iterator.next();
                        }
                    }

                    if (iterator.hasNext()) {
                        System.out.println(iterator.next());
                    }
                }
                case "B" -> {
                    System.out.println("Backward");
                    if(forward) {
                        forward = false;
                        if (iterator.hasPrevious()) {
                            iterator.previous();
                        }
                    }

                    if (iterator.hasPrevious()) {
                        System.out.println(iterator.previous());
                    }
                }
                case "M" -> printMenu();
                case "L" -> System.out.println(places);
                default -> {
                    System.out.println("Quiting... ");
                    quitLoop = true;
                }
            }
        }
    }

    private static void addPlace(LinkedList<Place> list, Place place) {
        if(list.contains(place)) {
            System.out.println("Error it exists");
            return;
        }

        for (Place p : list) {
            if(p.name().equalsIgnoreCase(place.name())) {
                System.out.println("Error it exists");
                return;
            }
        }

        int matchedIndex = 0;
        for (var listPlace : list) {
            matchedIndex++;
            if (place.distance() < listPlace.distance()) {
                list.add(matchedIndex, place);
                return;
            }
        }

        list.add(place);
    }

    private static void printMenu() {
        System.out.println("""
                Available actions(select word or letter): 
                (F)orward
                (B)ackward
                (L)istPlaces
                (M)enu
                (Q)uit""");
    }
}
