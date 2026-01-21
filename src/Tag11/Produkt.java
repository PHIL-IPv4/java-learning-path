package Tag11;
/* Level 1
 Schreiben Sie bitte ein Java-Programm, in dem ...
 - eine Klasse 'Produkt' definiert wird
   + Klassenmember sind:
     - name (String, private)
        + normaler Getter und Setter
     - mindestpreis (Integer, private)
        + kein Getter, normaler Setter
     - verkaufspreis (Integer, private)
        + normaler Getter; Setter: nur FALLS value>=mindestpreis SONST verkaufspreis=mindestpreis
 - im Main alle obigen "Feature" getestet werden
 */
public class Produkt {
    private String name;
    private int mindestpreis;
    private int verkaufspreis;

    public Produkt(String name, int mindestpreis, int verkaufspreis) {
        this.name = name;
        this.mindestpreis = mindestpreis;
        this.verkaufspreis = verkaufspreis;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMindestPreis(int mindestPreis) {
        this.mindestpreis = mindestPreis;
    }

    public int getVerkaufspreis() {
        return verkaufspreis;
    }

    public void setVerkaufspreis(int verkaufspreis) {
        if (verkaufspreis >= mindestpreis) {
            this.verkaufspreis = verkaufspreis;
        } else {
            this.verkaufspreis = mindestpreis;
        }

    }
}
