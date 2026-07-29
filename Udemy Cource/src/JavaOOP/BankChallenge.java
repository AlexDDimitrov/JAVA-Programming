import JavaOOP.AccountChallenge;

public class BankChallenge {

    public static void main(String[] args) {

        //AccountChallenge bobsAccountChallenge = new AccountChallenge("12345", 1000.00, "Bob Brown", "myemail@bob.com", "(087) 123-4567");

        AccountChallenge bobsAccountChallenge = new AccountChallenge();
        System.out.println(bobsAccountChallenge.getCustomerName());

        //bobsAccountChallenge.setNumber("12345");
        //bobsAccountChallenge.setBalance(1000.00);
        //bobsAccountChallenge.setCustomerName("Bob Brown");
        //bobsAccountChallenge.setCustomerEmail("myemail@bob.com");
        //bobsAccountChallenge.setCustomerPhone("(087) 123-4567");
        
        bobsAccountChallenge.withdrawFunds(100.0);
        bobsAccountChallenge.depositFunds(250);
        bobsAccountChallenge.withdrawFunds(50);

        bobsAccountChallenge.withdrawFunds(200);

        bobsAccountChallenge.depositFunds(100);
        bobsAccountChallenge.withdrawFunds(45.55);
        bobsAccountChallenge.withdrawFunds(54.46);

        bobsAccountChallenge.withdrawFunds(54.45);
    }
}
