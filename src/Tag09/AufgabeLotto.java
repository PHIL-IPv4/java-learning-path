package Tag09;
/*
Zunächst gibt der Benutzer 6 Lottozahlen ein.
Dabei wird darauf geachtet, dass die Zahlen im Bereich von 1 49 liegen und keine Dopplungen vorkommen.
Im Anschluss zieht der Computer in einer Schleife immer wieder 6 Lottozahlen. Auch hier wird auf Dopplungen geachtet.
Jetzt werden die Zahlen vom Benutzer mit den Zahlen vom Computer verglichen. Hat der Benutzer 6 Richtige, endet die Schleife und es wird ausgegeben, wie viele Computer-Ziehungen dafür nötig waren. und

Zusatzaufgabe:
Ein einzelner Lotto-Tipp kostet 2,10 Euro.
Wie viel hätte der Benutzer ausgeben müssen, um 6 Richtige zu haben?

Pseudocode Übung
START
    DECLARE userTips[6], lotteryDraw[6]
    DECLARE matches = 0
    DECLARE iterations = 0
    DECLARE pricePerTicket = 2.10

    DO
        matches = 0

        FOR each index i in userTips
            DO
                isDuplicate = false
                newTip = random(1-49)
                FOR each index k in userTips (up to i)
                    IF userTips[k] == newTip
                        isDuplicate = true
                END FOR
            WHILE isDuplicate == true
            userTips[i] = newTip
        END FOR

        FOR each index i in lotteryDraw
            DO
                isDuplicate = false
                newDraw = random(1-49)
                FOR each index k in lotteryDraw (up to i)
                    IF lotteryDraw[k] == newDraw
                        isDuplicate = true
                END FOR
            WHILE isDuplicate == true
            lotteryDraw[i] = newDraw
        END FOR

        FOR each value in lotteryDraw
            FOR each value in userTips
                IF lotteryDraw value == userTips value
                    matches++
        END FOR

        iterations++
    WHILE matches < 6

    totalCost = iterations * pricePerTicket
    PRINT iterations, totalCost
END
*/

import java.util.Random;

public class AufgabeLotto {

    public static void main(String[] args) {
        int[] userTips = new int[6];
        int currentTip;
        int[] lotteryDraw = new int[6];
        int currentDraw;
        int duplicates = 0;
        int matches = 0;
        int iterations = 0;

        Random rand = new Random();

        do {
            matches = 0;

            // 1. Generate unique user tips
            for (int i = 0; i < userTips.length; i++) {
                do {
                    duplicates = 0;
                    currentTip = rand.nextInt(1, 50);
                    for (int k = 0; k < userTips.length; k++) {
                        if (userTips[k] == currentTip) {
                            duplicates++;
                        }
                    }
                } while (duplicates > 0);
                userTips[i] = currentTip;
            }
            // System.out.println("User Tips: " + Arrays.toString(userTips));

            // 2. Generate unique Lottery draw
            for (int i = 0; i < lotteryDraw.length; i++) {
                do {
                    duplicates = 0;
                    currentDraw = rand.nextInt(1, 50);
                    for (int k = 0; k < lotteryDraw.length; k++) {
                        if (lotteryDraw[k] == currentDraw) {
                            duplicates++;
                        }
                    }
                } while (duplicates > 0);
                lotteryDraw[i] = currentDraw;
            }
            // System.out.println("Draw: " + Arrays.toString(lotteryDraw));

            // 3. Compare tips with draw
            for (int i = 0; i < lotteryDraw.length; i++) {
                for (int j = 0; j < userTips.length; j++) {
                    if (lotteryDraw[i] == userTips[j]) {
                        matches++;
                    }
                }
            }

            iterations++;

            // progress output every 1 million iterations
            if (iterations % 1000000 == 0) {
                System.out.println("Iterations: " + iterations + " | Current matches: " + matches);
            }

        } while (matches != 6);

        // Results
        double pricePerTicket = 2.10;
        double totalCost = iterations * pricePerTicket;

        System.out.println("\n--- Result ---");
        System.out.println("It took " + iterations + " iterations to get 6 matches.");
        System.out.println("Total cost: " + String.format("%.2f", totalCost) + " EUR");
    }
}
