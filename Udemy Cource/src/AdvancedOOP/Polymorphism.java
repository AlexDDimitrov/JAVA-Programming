package AdvancedOOP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

public class Polymorphism {

    static Scanner scanner;

    static void main(String[] args) {
        Movie movie = new Adventure("Star Wars");
        movie.watchMovie();

        System.out.println();

        movie = new Comedy("Alo alo");
        movie.watchMovie();

        System.out.println();
        Movie movie1 = Movie.getMovie("Science", "Star Wars");
        movie1.watchMovie();

        scanner = new Scanner(System.in);

        //List list = new ArrayList<String>();

        String type;
        String name;

        while (true) {
            System.out.println("Enter movie genre: ");
            type = scanner.nextLine();
            if (!(type.isEmpty())) {
                break;
            }
        }

        while (true) {
            System.out.println("Enter movie name: ");
            name = scanner.nextLine();
            if (!(name.isEmpty())) {
                break;
            }
        }

        Movie movie2 = Movie.getMovie(type, name);
        movie2.watchMovie();
    }
}

class Movie {

    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie() {

        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instanceType + " film");
    }

    public static Movie getMovie(String type, String title) {

        return switch (type.toUpperCase().charAt(0)) {
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new ScienceFiction(title);
            default -> new Movie(title);
        };
    }
}

class Adventure extends Movie {

    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Pleasant Scene",
                "Scary Music",
                "Something Bad Happens");
    }

    public void watchAdventure() {
        System.out.println("Watching an Adventure!");
    }
}

class Comedy extends Movie {

    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Something funny happens",
                "Something even funnier happens",
                "Happy Ending");
    }

    public void watchComedy() {
        System.out.println("Watching a Comedy!");
    }
}

class ScienceFiction extends Movie {

    public ScienceFiction(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Bad Aliens do Bad Stuff",
                "Space Guys Chase Aliens",
                "Planet Blows Up");
    }

    public void watchScienceFiction() {
        System.out.println("Watching a Science Fiction Thriller!");
    }
}