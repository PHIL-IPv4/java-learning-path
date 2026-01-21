package Tag11;

public class PlaySongs {
    public static void main(String[] args) {
        Song s1 = new Song("Africa", 295, "Toto");
        Song s2 = new Song("Victory Leap", 165, "Fred again..");

        s1.spielen();
        s2.spielen();
        s2.dauerSekunden = 145;
        s2.spielen();
    }
}
