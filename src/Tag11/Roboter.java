package Tag11;

public class Roboter {
    private int batterieLaufzeit;
    public String aufgabe;

    public Roboter() {
        batterieLaufzeit = 5;
        aufgabe = "nicht zugewiesen";
    }

    public void arbeiten() {
        if (aufgabe.equals("nicht zugewiesen")) {
            System.out.println("Was soll ich tun?");
        }
        else if (batterieLaufzeit > 0) {
            System.out.println(aufgabe + " wird ausgeführt...");
            batterieLaufzeit--;
        }
        else {
            System.out.println("Ich muss geladen werden");
        }
    }

    public int getBatterieLaufzeit() {
        return batterieLaufzeit;
    }

    public void batterieLaden(int ladezeit) {
        while (batterieLaufzeit < 5 && ladezeit > 0) {
            this.batterieLaufzeit++;
            ladezeit++;
        }
    }
}
