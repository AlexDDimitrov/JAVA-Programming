package AdvancedOOP.CompositionChallenge;

public class CompostionChallenge {
    static void main(String[] args) {
        SmartKitchen kitchen = new SmartKitchen();

        kitchen.getCoffeeMaker().setHasWorkToDo(true);
        kitchen.getRefrigerator().setHasWorkToDo(true);
        kitchen.getDishWasher().setHasWorkToDo(true);

        kitchen.getCoffeeMaker().brewCoffee();
        kitchen.getRefrigerator().orderFood();
        kitchen.getDishWasher().doDishes();

        System.out.println();

        kitchen.setKitchenState(true, false, true);
        kitchen.doKitchenWork();
    }

}
