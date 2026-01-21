package Tag04;
import java.util.Scanner;

/*
START
    int maxScore
    int score
    double percentage
    bool passed

    Output "Bitte geben Sie die maximale Punktzahl ein:"
    maxScore = Input
    Output "Bitte geben Sie die erreichte Punktzahl ein:"
    score = Input

    if score > maxScore/2
        passed = true
    else
        passed = false

    percentage = score * 100 / maxScore

    if passed
        Output "Sie haben mit ...percentage... bestanden!"
    else
        Output "Sie sind mit ...percentage... durchgefallen."
END

 */

public class Aufgabe2 {
    public static void main(String[] args){
        int maxScore;
        int score;
        double percentage;
        boolean passed;
        Scanner input = new Scanner(System.in);

        System.out.println("Bitte geben Sie die maximale Punktzahl ein: ");
        maxScore = input.nextInt();
        System.out.println("Bitte geben Sie die erreichte Punktzahl ein: ");
        score = input.nextInt();

        if (score > maxScore/2){
            passed = true;
        }
        else {
            passed = false;
        }

        percentage = (double)score * 100 / maxScore;
        percentage = Math.round(percentage * 100.0) / 100.0;

        if (passed){
            System.out.println("Sie haben mit "+ percentage +"% bestanden.");
        }
        else{
            System.out.println("Sie sind mit "+ percentage +"% durchgefallen.");
        }

    }
}
