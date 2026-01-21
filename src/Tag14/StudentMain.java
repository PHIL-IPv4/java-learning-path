package Tag14;

import java.util.Scanner;

public class StudentMain {

    public static int MAX_STUDENTS = 3;
    public static Student[] students = new Student[MAX_STUDENTS];
    public static int currentStudents = 0;

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int option;

        do {
            System.out.println("\n[0] Programm beenden | [1] Student hinzufügen | [2] Liste zeigen | [3] Besten Studenten anzeigen | [4] Notendurchschnitt aller Studenten anzeigen\n");
            option = input.nextInt();

            switch (option){
                case 0:
                    System.out.println("Programm wird beendet...");
                    break;
                case 1:
                    addStudent();
                    break;
                case 2:
                    showStudents();
                    break;
                case 3:
                    bestStudent();
                    break;
                case 4:
                    gradeAverageAll();
                    break;
                default:
                    System.out.println("Ungültige Eingabe");
                    break;
            }


        } while (option != 0);


        input.close();
    }

    public static void addStudent(){
        String name;
        int age;
        double gradeAverage;

        if (currentStudents < MAX_STUDENTS){

            System.out.print("Name des Studenten: ");
            name = input.next();

            System.out.print("Alter des Studenten: ");
            age = input.nextInt();
            input.nextLine();

            System.out.print("Notendurchschnitt: ");
            gradeAverage = input.nextDouble();


            students[currentStudents] = new Student(name, age, gradeAverage);
            currentStudents++;
        } else {
            System.out.println("Plätze voll, kein Hinzufügen neuer Studenten möglich");
        }


    }

    public static void showStudents(){
        for (int i = 0; i < currentStudents; i++){
            System.out.println((i+1) + ". " + students[i]);
        }
    }

    public static void bestStudent(){
        Student best = students[0];

        if (currentStudents > 0){
            for (int i = 1; i < currentStudents; i++){
                if (students[i].getGradeAverage() < best.getGradeAverage()){
                    best = students[i];
                }
            }
            System.out.println("Bester Student: " + best);

        }
    }

    public static void gradeAverageAll(){
        if (currentStudents > 0){
            double gradeAll = 0;
            for (int i = 0; i < currentStudents; i++){
                gradeAll += students[i].getGradeAverage();
            }
            gradeAll /= currentStudents;
            System.out.println("Der Notendurschnitt aller Studenten lautet: " + String.format("%.2f", gradeAll));
        } else {
            System.out.println("Die Liste ist Leer");
        }
    }

}
