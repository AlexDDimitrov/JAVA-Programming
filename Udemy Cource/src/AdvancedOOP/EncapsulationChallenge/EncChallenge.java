package AdvancedOOP.EncapsulationChallenge;

public class EncChallenge {
    public static void main(String[] args) {

        Printer printer = new Printer(2, false);
        System.out.println(printer.getPagesPrinted());

        int pagesPrinted = printer.printPages(4);
        System.out.println(pagesPrinted + " " + printer.getPagesPrinted());

        pagesPrinted = printer.printPages(3);
        System.out.println(pagesPrinted + " " + printer.getPagesPrinted());
    }
}
