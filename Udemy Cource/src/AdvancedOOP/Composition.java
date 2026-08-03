package AdvancedOOP;

import java.awt.*;

public class Composition {
    static void main(String[] args) {

        ComputerCase computerCase = new ComputerCase("2208", "DELL", "240");

        Monitor monitor = new Monitor("27inch Beast", "Acer", 27, "2540 x 1440");

        Motherboard motherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PersonalComputer personalComputer = new PersonalComputer("2208", "DELL", computerCase, monitor, motherboard);

        personalComputer.powerUp();
    }
}
