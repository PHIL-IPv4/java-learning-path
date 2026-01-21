package Tag16;

public class Rabbit extends Animal implements IHerbivore, IPet{
    public Rabbit(String name, int age){
        super(name, age);
    }

    @Override
    public void graze() {
        System.out.println("Der Hase isst Gras...");
    }

    @Override
    public void rest() {
        System.out.println("Der Hase ruht...");
    }

    @Override
    public void caress() {
        System.out.println("Der Hase wird gestreichelt...");
    }
}
