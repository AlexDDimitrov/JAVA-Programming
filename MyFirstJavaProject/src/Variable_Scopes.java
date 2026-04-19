public class Variable_Scopes {
    static int x = 3;//class
    public static void main(String[] args){
        int x = 2; // local
        System.out.println(x); //local variable is preferred if it has the same name as a class variable
        printVar();
    }
    static void printVar() {
        System.out.println(x);
    }

}
