package JavaOOP.Inheretance;

public class Inheretance {
    static void main(String[] args) {
        Animal animal = new Animal("Generic Animal", "Huge", 400);
        doAnimalStuff(animal, "slow");

        //Dog dog = new Dog();
        Dog dog = new Dog("Yorkie", 3);
        doAnimalStuff(dog, "fast");

        Dog dog2 = new Dog("Labrador Retriever", 65, "Floppy", "Swimmer");
        doAnimalStuff(dog2, "slow");

        Dog wolf = new Dog("Wolf", 40);
        doAnimalStuff(wolf, "fast");

        Fish goldie = new Fish("Goldfish", 0.25, 2, 3);
        doAnimalStuff(goldie, "fast");
    }

    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _");
    }
}
