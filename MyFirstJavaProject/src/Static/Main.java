package Static;

public class Main {
    public static void main(String[] args){
        Friend friend1 = new Friend("Teo");
        System.out.println(friend1.name);
        System.out.println(friend1.numberOfFriends);

        Friend friend2 = new Friend("Eli");
        System.out.println(friend2.name);
        System.out.println(friend2.numberOfFriends);

        Friend friend3 = new Friend("Alex");
        System.out.println(friend3.name);
        System.out.println(friend3.numberOfFriends);

        Friend friend4 = new Friend("Bro");
        System.out.println(friend4.name);
        System.out.println(friend4.numberOfFriends);

        Friend friend5 = new Friend("Matt");
        System.out.println(friend5.name);
        System.out.println(friend5.numberOfFriends);

        Friend.showFriends();
    }
}
