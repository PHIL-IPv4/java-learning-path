package Tag10;

public class MethodenProzentwert {
    public static void main(String[] args) {
        float berechnung = berechneProzent(36f, 25f);

        System.out.printf("25%% von 36 sind %.2f", berechnung);
    }
    /**
     * berechneProzent()
     *
     *
     * @param basisWert         Wert für den der Prozentwert berechnet wird (100%)
     * @param prozWert          Wert für den Prozentanteil, der berechnet werden soll (x%)
     * @return ergebnis         Liefert ausgerechneten Prozentwert zurück
     */

    static float berechneProzent(float basisWert, float prozWert) {
        float ergebnis;

        ergebnis = basisWert / 100f * prozWert;
        return  ergebnis;
    }
}
