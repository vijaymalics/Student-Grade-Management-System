import java.util.Scanner;

class Student {
    String name;
    int[] marks;
    int total;
    double percentage;
    char grade;

    // Constructor
    Student(String name, int subjectCount) {
        this.name = name;
        marks = new int[subjectCount];
    }

    void inputMarks(Scanner sc) {
        System.out.println("Enter marks of " + marks.length + " subjects:");
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
    }

    void calculateResult() {
        total = 0;
        for (int mark : marks) {
            total += mark;
        }
        percentage = total / (double) marks.length;

        if (percentage >= 90)
            grade = 'A';
        else if (percentage >= 75)
            grade = 'B';
        else if (percentage >= 60)
            grade = 'C';
        else
            grade = 'D';
    }

    void displayReport() {
        System.out.println("\n----- Student Report -----");
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage);
        System.out.println("Grade: " + grade);
    }
}

public class StudentMarksCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        Student s = new Student(name, 5);

        s.inputMarks(sc);
        s.calculateResult();
        s.displayReport();

        sc.close();
    }
}