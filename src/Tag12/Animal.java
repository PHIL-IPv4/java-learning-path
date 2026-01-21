package Tag12;

public class Animal {

    private String name;

    public Animal() {

    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void makeSound() {
        System.out.println("Das Tier macht ein Geräusch");
    }
}
