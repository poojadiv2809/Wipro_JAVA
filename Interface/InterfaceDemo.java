import java.util.Scanner;

interface Student {
    void getDetails();    
    void displayDetails(); 
}
class Marks implements Student {
    String name;
    int rollNo;
    int[] marks = new int[3]; 

    public void getDetails() {
        name = "John";
        rollNo = 101;
        marks[0] = 85;
        marks[1] = 78;
        marks[2] = 92;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks[0] + ", " + marks[1] + ", " + marks[2]);
    }

    public int totalMarks() {
        return marks[0] + marks[1] + marks[2];
    }

    public float averageMarks() {
        return totalMarks()/3.0f;
    }
}
class Result extends Marks {
    public void displayResult() {
        float avg = averageMarks();
        System.out.println("Average: " + avg);
        if (avg >= 40) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }
    }
}

public class InterfaceDemo {
        public static void main(String[] args) {
        Result student1 = new Result();
        student1.getDetails();
        student1.displayDetails();
        student1.displayResult();
    }
    
}
