package Tag11;

public class Song {

    //Attribute
    public String titel;
    public int dauerSekunden;
    public String interpret;

    //Konstruktor
    public Song(String titel, int laufzeit, String interpret) {
        this.interpret = interpret;
        dauerSekunden = laufzeit;
        this.titel = titel;
    }

    public void spielen() {
        String spielzeit;
        int minute, sekunde;

        minute = this.dauerSekunden / 60;
        sekunde = this.dauerSekunden % 60;
        System.out.printf("\n%s von %s läuft... Restpielzeit %d:%d", this.titel, this.interpret, minute, sekunde);
    }
}
