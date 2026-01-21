package Tag12;

public class Fussballfeld {
    private int breite;
    private int laenge;
    private boolean dfbTauglich;

    public Fussballfeld(int laenge, int breite){
        this.laenge = laenge;
        this.breite = breite;
        if (45 <= breite && breite <= 55 && 90 <= laenge && laenge <= 110){
            dfbTauglich = true;
        } else {
            dfbTauglich = false;
        }
    }

    public void zeigeAlle(){
        System.out.println("Breite: "+ breite);
        System.out.println("Länge"+ laenge);
        System.out.println("DFB-Tauglich: "+ dfbTauglich);
    }
}
