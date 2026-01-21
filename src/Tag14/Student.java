package Tag14;

public class Student {
    private String name;
    private int age;
    private double gradeAverage;

    public Student(String name, int age, double gradeAverage){
        this.name = name;
        this.age = age;
        this.gradeAverage = gradeAverage;
    }

    public double getGradeAverage() {
        return gradeAverage;
    }

    @Override
    public String toString(){
        return String.format("Name: %-20s | Alter: %2d | Notenschnitt: %.2f", name, age, gradeAverage);
    }
}
