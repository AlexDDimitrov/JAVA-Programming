package Inheritance;

public class Main {
    public static void main(String[] args){
        Dog dog = new Dog();                            //Grandparent(organism) -> parent(animal) -> child(dog)
        Cat cat = new Cat();                            //dog & plant are siblings but not related

        System.out.println(cat.isAlive);
        System.out.println(dog.isAlive);

        cat.eat();
        dog.eat();

        System.out.println(cat.lives);
        System.out.println(dog.lives);

        cat.speak();
        dog.speak();

        Plant plant = new Plant();
        System.out.println(plant.isAlive);
        plant.photosynthesize();
    }
}
