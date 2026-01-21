package Tag12;

public class TestRechner {
    public static void main(String[] args) {
        Rechner r = new Rechner();

        System.out.println(r.add(3, 5));
        System.out.println(r.add(2, 5, 7));
        System.out.println(r.add(3, r.add(5, 7)));
        System.out.println(r.add(3, 5));
    }
}
