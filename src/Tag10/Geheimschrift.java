package Tag10;

/*
Zuerst gibt der User einen beliebigen Text ein.
Jetzt verschlüsselt der Computer diesen Text. Dabei werden
die Buchstaben des Users durch Elemente aus dem String-Array "codiert" ersetzt.
Beispiel: Aus der Eingabe "abc" wird der Geheimtext "dsasdsdasd"
Der verschlüsselte Text wird auf dem Bildschirm ausgegeben.
Anschließend wird der verschlüsselte Text vom Computer wieder entschlüsselt und ausgegeben

START

    static char[] buchstaben()
    static String[] codiert()

    main
        String eingabeText
        String codierterText
        String decodierterText

        Scanner input

        eingabeText = input
        codierterText = codieren(eingabeText)
        print(codierterText)
        codierterText = decodieren(codierterText)
        print(decodierterText)



    static String codieren(String text)
        String geheimtext = ""
        for int i = 0, i < text.length, i++
            for int j = 0, j < buchstaben.length, j++
                if text.charAt(i) == buchstaben[j]
                    geheimtext += codiert[j]
        return geheimtext

    static String decodieren(String geheimtext)
        String text = ""
        for int i = 0, i < geheimtext.length, i + 4
            for int j = 0, j < codiert.length, j++
                if geheimtext.substring(i, i + 4) == codiert[j]
                    text += buchstaben[j]
        return text

END

 */

import javax.script.ScriptContext;
import java.util.Scanner;

public class Geheimschrift {

    static char buchstaben[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',
            'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',
            '0','1','2','3','4','5','6','7','8','9',':',';','<','=','>','?','!','"','#','$','%','&','\'','(',')','*','+',',','-','.','/',' ','\\'};


    static String codiert[] = {"dsad","dsas","dsaw","dsda","dsdd","dsds","dsdw","dssa","dssd","dsss","dssw","dswa","dswd","dsws","dsww","dwaa","dwad","dwas","dwaw","dwda",
            "dwdd","dwds","dwdw","dwsa","dwsd","dwss","daad","daas","daaw","dada","dadd","dads","dadw","dasa","dasd","dass","dasw","dawa","dawd","daws",
            "daww","ddaa","ddad","ddas","ddaw","ddda","dddd","ddds","dddw","ddsa","ddsd","ddss","awaa","awad","awas","awaw","awda","awdd","awds","awdw",
            "awsa","awsd","awss","awsw","awwa","awwd","awws","awww","asad","asas","asaw","asda","asdd","asds","asdw","assa","assd","asss","assw","aswa",
            "aswd","asws","asww","asaa","AAAA"};

    public static void main(String[] args) {

        String eingabeText;
        String codierterText;
        String decodierterText;
        Scanner input = new Scanner(System.in);

        System.out.println("Geben Sie einen beliebigen Text ein: ");
        eingabeText = input.nextLine();
        codierterText = codieren(eingabeText);
        System.out.println("\n codiert: " + codierterText);
        decodierterText = decodieren(codierterText);
        System.out.println("\n decodiert: " + decodierterText);

    }

    static String codieren(String text) {
        String geheimtext = "";
        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < buchstaben.length; j++) {
                if (text.charAt(i) == buchstaben[j]) {          //Jeder Buchstabe aus dem String "text" wird
                    geheimtext += codiert[j];                   //mit jedem Buchstaben aus dem Array buchstaben verglichen,
                }                                               //sobald es übereinstimmt wird der index genutzt um die Codierung zu bestimmen
            }
        }
        return geheimtext;
    }

    static String decodieren(String geheimtext) {
        String text = "";
        for (int i = 0; i < geheimtext.length(); i += 4) {      // += 4 weil 4 Codebuchstaben zusammen einen echten Buchstaben darstellen
            for (int j = 0; j < codiert.length; j++) {
                if (geheimtext.substring(i, i + 4).equals(codiert[j])) {
                    text += buchstaben[j];
                }
            }
        }
        return text;
    }

}
