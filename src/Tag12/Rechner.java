package Tag12;

public class Rechner {

    int add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
    double add(double a, double b) {
        return a + b;
    }
    double add(int a, double b) {
        return (double) (a + b);
    }
    int add(double a, int b){
        return (int) (a + b);
    }
}
