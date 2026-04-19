package Overloaded_Constructors;

public class User {
    String username;
    String email;
    int age;

    User() {
        this.username = "Not Provided";
        this.email = "Not Provided";
        this.age = -1;
    }

    User(String username) {
        this.username = username;
        this.email = "Not Provided";
        this.age = -1;
    }
    User(String username, String email) {
        this.username = username;
        this.email = email;
        this.age = -1;
    }
}
