package Tag13;

/*
Erstelle eine Klasse "GetraenkeAutomat".
Diese Klasse soll zwei Methoden haben:
- zeigeMenue() das die Auswahl und die Preise darstellt
  (1, Wasser, 1,-; 2, Cola, 1,50; 3, Kaffee, 2,-; 4, Tee, 1,80)
- waehleGetraenk(int auswahl), das die Auswahl als int entgegennimmt,
  die gewählte Option und den Preis ausgibt
  und den Preis als double zurückgibt.

Das aufrufende Programm soll eine Instanz des Automaten erstellen und anschließend solange das Menue
anzeigen, bis eine 0 als Eingabe erfolgt.

Ergänzung für die "runaways" (Fortgeschrittenen): Jedes Getränk ist nur 10 mal vorhanden.
Baut einen Zähler ein, der mitzählt und entsprechend
reagiert, wenn die Auswahl nicht mehr zur Verfügung steht.

Ergänzung für die "pros" (Abk. für Prosecco): Ergänzt die Klasse um eine Funktion, so dass ihr
das Menue anpassen könnt, wenn etwas nicht mehr
zur Verfügung steht.

 */
import java.util.ArrayList;
import java.util.Arrays;

public class GetraenkeAutomat {

    private static ArrayList<String> produktName = new ArrayList<String>(Arrays.asList("Wasser", "Cola", "Kaffe", "Tee"));
    private static ArrayList<Double> produktPreis = new ArrayList<Double>(Arrays.asList(1.00, 1.50, 2.00, 1.20));
    private static ArrayList<Integer> produktMenge = new ArrayList<Integer>(Arrays.asList(10, 10, 10, 10));

    public GetraenkeAutomat(){

    }

    public void zeigeMenue(){
        System.out.println("Es stehen folgende Produkte zur Auswahl ");
        for (int i = 0; i < produktName.size(); i++){
            System.out.print(" | ["+ (i+1) +"] "+ produktName.get(i));
            System.out.printf(" Preis: %.2f %s", produktPreis.get(i), " Euro");
        }
        System.out.println(" | [0] Automaten herunterfahren");
    }

    public double waehleGetraenk(int auswahl){

        if (produktName.isEmpty()){
            System.out.println("Alles ausverkauft");
            return 0.00;
        } else if (auswahl <= produktName.size()){
            auswahl--;
            System.out.println("Sie haben "+ produktName.get(auswahl) +" für "+ produktPreis.get(auswahl)+ " Euro ausgewählt.");
            int menge = produktMenge.get(auswahl);
            menge--;
            produktMenge.set(auswahl, menge);
            double preis = produktPreis.get(auswahl);

            if (produktMenge.get(auswahl) <= 0){
                produktName.remove(auswahl);
                produktPreis.remove(auswahl);
                produktMenge.remove(auswahl);
            }
            return preis;
        } else if (auswahl == 0) {
            System.out.println("Wird beendet...");
            return 0.00;
        } else {
            System.out.println("Ungültige Eingabe\n");
            return 0.00;
        }
    }
}
