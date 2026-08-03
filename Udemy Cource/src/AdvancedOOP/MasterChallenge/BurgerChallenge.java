package AdvancedOOP.MasterChallenge;

public class BurgerChallenge {
    static void main(String[] args) {
//        Item coke = new Item("drink", "coke", 1.50);
//        coke.printItem();
//        coke.setSize("Large");
//        coke.printItem();
//
//        Item avocado = new Item("Topping", "avocado", 1.50);
//        avocado.printItem();

//        Burger burger = new Burger("regular", 4.0);
//        burger.addToppings("BACON", "CHEESE", "MAYO");
//        burger.printItem();

//        MealOrder mealOrder = new MealOrder();
//        mealOrder.addBurgerToppings("BACON", "CHEESE", "MAYO");
//        mealOrder.setDrinkSize("Large");
//        mealOrder.printItemizedList();

//        MealOrder mealOrder = new MealOrder("turkey", "7-up", "chili");
//        mealOrder.addBurgerToppings("Lettuce", "CHEESE", "MAYO");
//        mealOrder.setDrinkSize("SMALL");
//        mealOrder.printItemizedList();

        MealOrder deluxeMeal = new MealOrder("deluxe", "7-up", "chili");
        deluxeMeal.addBurgerToppings("AVOCADO", "BACON", "LETTUCE", "CHEESE", "MAYO");
        deluxeMeal.setDrinkSize("SMALL");
        deluxeMeal.printItemizedList();
    }
}
