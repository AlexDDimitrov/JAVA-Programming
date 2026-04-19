package Overloaded_Constructors;

public class Overloaded_Constructors {
    public static void main(String[] args){
        User user1 = new User("Alex");

        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);

        System.out.println();

        User user2 = new User("Eli", "something@email.com");

        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);

        System.out.println();

        User user3 = new User();

        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);
    }
}
