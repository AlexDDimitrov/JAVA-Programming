public class String_Methods {
    public static void main(String[] args) {
        String name = "   Alexxe   ";

        int length = name.length();
        System.out.println(length);

        char letter = name.charAt(6);
        System.out.println(letter);

        int index = name.indexOf('e');
        System.out.println(index);

        int lastIndex = name.lastIndexOf("x");
        System.out.println(lastIndex);

        name = name.toUpperCase();
        System.out.println(name);

        name = name.toLowerCase();
        System.out.println(name);

        name = name.trim();
        System.out.println(name);

        name = name.replace('a', 'A' );
        System.out.println(name);

        //name.isEmpty() -> returns a boolean: true if empty, false if containing characters
        //name.contains('char') -> if a char is in String name -> true, else -> false
        //name.equals("string") -> if name == string -> true, else -> false
        //name.equalsIgnoreCase("string") -> ignore case of equal strings
    }
}
