package Tag16;

public class Song {
    private String titel;
    private int dauerSekunden;
    private String interpret;

    public Song(String titel, int laufzeit, String interpret){
        this.titel = titel;
        dauerSekunden = laufzeit;
        this.interpret = interpret;
    }

    @Override
    public String toString() {
        int minute, sekunde;
        minute = dauerSekunden / 60;
        sekunde = dauerSekunden % 60;
        return "Song{" +
                "titel='" + titel + '\'' +
                ", Laufzeit=" + minute + ":" + sekunde +
                ", interpret='" + interpret + '\'' +
                '}';
    }
}
