// Develop a program to manage student grades. The program should
//  have the following features: 
//  Create a Student class with properties for name, student ID, 
// and grades (in an array). 
//  Implement methods to:   Add a new student   Update a student's grades 
//  Calculate the average grade for a student 
//  Find the student with the highest average grade 
// Prompt the user to perform various operations, such as adding 
// a new student, updating a cd..
// student's grades, and displaying the student with the highest average grade.
// 
package Student;
import java.util.Scanner;

public class Student {
    private String name;
    private int id;
    private String[] grade;

    public Student() {
        grade = new String[3];  // Fix: Initialize instance variable `grade`
    }

    public void get(String name, int id) {
        Scanner scan = new Scanner(System.in);
        this.name = name;
        this.id = id;
        String[] subject = {"math", "science", "english"};
        
        for (int i = 0; i < 3; i++) {
            String inputGrade = "";
            while (!(inputGrade.equals("A") || inputGrade.equals("A+") || inputGrade.equals("B") || inputGrade.equals("B+") || inputGrade.equals("C") || inputGrade.equals("D") || inputGrade.equals("O") || inputGrade.equals("O+") || inputGrade.equals("S+") || inputGrade.equals("F"))) {
                System.out.print("Enter appropriate grade for " + subject[i] + " (A, A+, B, B+, C, D, O, O+, S+, F) ::  ");
                inputGrade = scan.next().toUpperCase();
            }
            this.grade[i] = inputGrade;
        }
    }
    public void updateName(String name)
    {
        this.name=name;
    }
    public void updateId(int Id)
    {
        this.id=Id;
    }
    public void updateGrade()
    {
        Scanner scan = new Scanner(System.in);
    String[] subject = {"math", "science", "english"};
        
        for (int i = 0; i < 3; i++) {
            String inputGrade = "";
            while (!(inputGrade.equals("A") || inputGrade.equals("A+") || inputGrade.equals("B") || inputGrade.equals("B+") || inputGrade.equals("C") || inputGrade.equals("D") || inputGrade.equals("O") || inputGrade.equals("O+") || inputGrade.equals("S+") || inputGrade.equals("F"))) {
                System.out.print("Enter appropriate grade for " + subject[i] + " (A, A+, B, B+, C, D, O, O+, S+, F) ::  ");
                inputGrade = scan.next().toUpperCase();
            }
            this.grade[i] = inputGrade;
        }
    }
    
    public void display() {
        System.out.println(id + "   " + name + "   " + grade[0] + "   " + grade[1] + "   " + grade[2]);
    }
}
