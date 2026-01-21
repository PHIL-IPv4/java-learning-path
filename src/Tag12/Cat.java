package Tag12;

public class Cat extends Animal{

    private String rasse;

    public Cat(String name){
        super(name);
    }
    public Cat(String name, String rasse){
        super(name);
        this.rasse = rasse;
    }

    @Override
    void makeSound(){
        System.out.println("Miau");
    }

    public String getRasse() {
        return rasse;
    }

    public void setRasse(String rasse) {
        this.rasse = rasse;
    }
}
