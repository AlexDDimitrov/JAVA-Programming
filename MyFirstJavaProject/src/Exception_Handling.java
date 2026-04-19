import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Handling {
    public static  void main(String[] args) {
        //exception - event that interrupts the normal flow of a program
        //examples - division by 0, file not found, mismatch type, dangerous code
        //try{}, catch{}, finally{}


        try(Scanner scanner = new Scanner(System.in)){
            //System.out.println(1/0);
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            scanner.nextLine();
            System.out.println(number);
        }
        catch(ArithmeticException e) {
            System.out.println("Error: "+ e);
        }
        catch(InputMismatchException e) {
            System.out.println("Error: " + e);
        }
        catch (Exception e) {
            System.out.println("Error" + e);
        }
        finally {//executes no matter if there is a exception
            System.out.println("This always executes");
        }

    }
}
