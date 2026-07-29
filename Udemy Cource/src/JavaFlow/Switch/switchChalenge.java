public class switchChalenge {

    public static void main(String[] args) {

        char charValue = 'X';
        System.out.println(
            switch (charValue) {
                case 'A' -> "A is able";
                case 'B' -> "B is baker";
                case 'C' -> "C is charlie";
                case 'D' -> "D is dog";
                case 'E' -> "E is easy";
                default -> "Letter " + charValue + " was not found in the switch";
            }
        );
    }
}
