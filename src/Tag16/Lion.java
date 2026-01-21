package Tag16;

public class Lion extends Animal implements ICarnivore{
    public Lion(String name, int age){
        super(name, age);
    }

    @Override
    public void hunt() {
        System.out.println("Der Löwe jagt...");
    }

    @Override
    public void eat() {
        System.out.println("Der Löwe frisst...");
    }
}
