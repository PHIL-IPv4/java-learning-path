package Tag11;

public class TestRoboter {
    public static void main(String[] args) {
        Roboter r1 = new Roboter();

        r1.arbeiten();
        r1.aufgabe = "Kuchen backen";
        r1.arbeiten();
        System.out.println("Batterielaufzeit: "+ r1.getBatterieLaufzeit());
        r1.arbeiten();
        System.out.println("Batterielaufzeit: "+ r1.getBatterieLaufzeit());
        r1.arbeiten();
        System.out.println("Batterielaufzeit: "+ r1.getBatterieLaufzeit());
        r1.arbeiten();
        System.out.println("Batterielaufzeit: "+ r1.getBatterieLaufzeit());
        r1.arbeiten();
        System.out.println("Batterielaufzeit: "+ r1.getBatterieLaufzeit());
        r1.arbeiten();
        System.out.println("Batterielaufzeit: "+ r1.getBatterieLaufzeit());
        r1.batterieLaden(10);
        System.out.println("Batterielaufzeit: "+ r1.getBatterieLaufzeit());
        r1.arbeiten();
        System.out.println("Batterielaufzeit: "+ r1.getBatterieLaufzeit());
        r1.arbeiten();
        System.out.println("Batterielaufzeit: "+ r1.getBatterieLaufzeit());
        r1.arbeiten();
        System.out.println("Batterielaufzeit: "+ r1.getBatterieLaufzeit());
    }
}
