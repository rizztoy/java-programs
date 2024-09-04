// Develop a program to manage student grades. The program should have the following features: 
//  Create a Student class with properties for name, student ID, and grades (in an array). 
//  Implement methods to: 
//  Add a new student 
//  Update a student's grades 
//  Calculate the average grade for a student 
//  Find the student with the highest average grade 
// Prompt the user to perform various operations, such as adding a new student, updating a 
// student's grades, and displaying the student with the highest average grade.
import Student.Student; // Corrected import statement

public class casestudy_3 {
    public static void main(String[] args) {
        Student s = new Student();
        s.get("ritika", 1);  // Corrected method calls
        s.display();
        s.updateName("neha");
        s.updateId(3);
        s.display();
    }
}
// output:
// Enter appropriate grade for math (A, A+, B, B+, C, D, O, O+, S+, F) ::  a
// Enter appropriate grade for science (A, A+, B, B+, C, D, O, O+, S+, F) ::  r
// Enter appropriate grade for science (A, A+, B, B+, C, D, O, O+, S+, F) ::  b
// Enter appropriate grade for english (A, A+, B, B+, C, D, O, O+, S+, F) ::  f
// 1   ritika   A   B   F
// 3   neha   A   B   F