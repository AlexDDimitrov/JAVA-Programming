package Anonymous_Class;

public class AnonymousClass {
    //anonymous - class that does not have a name. Cannot be reused.
    public static void main(String[] args) {
        Dog dog = new Dog();
        Dog speakingDog = new Dog(){
            @Override
            void speak() {
                System.out.println("Hello");
            }
        };

        dog.speak();
        speakingDog.speak();
    }
}
