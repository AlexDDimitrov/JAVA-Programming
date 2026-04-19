public class Substring {
    public static void main(String[] args) {
        //.substring
        String email = "Alex@email.com";
        String username = email.substring(0, email.indexOf('@'));
        System.out.println(username);
        String domain = email.substring(email.indexOf('@') + 1);
        System.out.println(domain);

    }
}
