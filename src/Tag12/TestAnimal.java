package Tag12;

public class TestAnimal {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        a1.setName("Nick");
        Animal a2 = new Cat("Luna");
        Cat a3 = new Cat("Garfield", "Maine-Coon");

        System.out.println("Tier 1 heißt: "+ a1.getName());
        a1.makeSound();
        System.out.println("Tier 2 heißt: "+ a2.getName());
        a2.makeSound();
        System.out.println("Tier 3 heißt: "+ a3.getName() + " Rasse: " + a3.getRasse());
        a3.makeSound();
    }
}
