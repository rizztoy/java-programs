
// Create a Student class with the following properties: name, grade, and age. Implement the following 
// methods:
// setName(String name): Sets the student's name.
// getGrade(): Returns the student's grade.
// incrementAge(): Increments the student's age by 1.
// printStudentInfo(): Prints the student's name, grade, and age.
// In the main method, create an array of Student objects and perform the following tasks:
// Prompt the user to enter the number of students.
// Create the Student objects and populate their information.
// Use a for loop to iterate through the array and call the printStudentInfo() method for each 
// student.

// Find the student with the highest grade and print their information.
// Note: Remember to include appropriate comments and documentation throughout your code to 
// make it more readable and maintainable.
import java.util.Scanner;
class Student{
    private String name;
    private int age;
    private String grade;
    
        public Student(String name , int age , String grade){
            this.name = name;
            this.age = age;
            this.grade=grade;
        }

        public void setName(String name)
        {
            this.name = name;
        }
        public String getGrade(){
                return grade;
        }
        public void incrementAge()
        {
            System.out.println("age :: "+this.age);
            this.age++;
            System.out.println("incremented age :: "+this.age);
        }
        public void printStudentInfo()
        {
            System.out.println("name :: "+this.name);
            // System.out.println("age :: "+this.age);
            incrementAge();
            System.out.println("grade :: "+this.grade);
        }

}
    class implimentation{
        public static void main(String args[]){
            //dynamic size allocation to student object.
            System.out.print("enter how many students you want to enter :: ");
                
            Scanner scan = new Scanner(System.in);
            String name;
            int age;
            String grade;
            //array of student
            int num = scan.nextInt();
            Student[] student = new Student[num];
            //getting user input 
            for (int i=0; i<num ;i++){
                
                System.out.println("\nenter student info for index "+(int)(i+1));
                System.out.print("enter name:: ");
                name= scan.next();
                System.out.print("enter age:: ");
                age= scan.nextInt(); 
                grade="";   
               while(!(grade.equals("A")|| grade.equals("A+")|| grade.equals("B")|| grade.equals("B+")|| grade.equals("C")|| grade.equals("D")|| grade.equals("O")|| grade.equals("O+")|| grade.equals("S+")|| grade.equals("F")))
               {
                System.out.print("Enter appropriate grade (A, A+, B, B+, C, D, O, O+, S+, F) ::  "); 
                grade=scan.next();
                grade=grade.toUpperCase();
               }
                student[i]= new Student(name,age,grade);

            }
            //printing student info

             for (int i=0; i<num ;i++){
                System.out.println("\n student "+(int)(i+1));
                student[i].printStudentInfo();
                }
            // printing student with highest grade
            System.out.println("\nStudent with highest grades :: ");
            
             for (int i=0; i<num ;i++){
                    grade=student[i].getGrade();
                    if(grade.equals("S+"))
                        {
                            System.out.println("\n student "+(int)(i+1));
                            student[i].printStudentInfo();
                            
                        }
                }
            
        }

    }


//output ::
// PS Z:\java> javac p4_1.java    
// PS Z:\java> java implimentation
// enter how many students you want to enter :: 3

// enter student info for index 1
// enter name:: yashvi
// enter age:: 20
// Enter appropriate grade (A, A+, B, B+, C, D, O, O+, S+, F) ::  s+

// enter student info for index 2
// enter name:: saloni
// enter age:: 20
// Enter appropriate grade (A, A+, B, B+, C, D, O, O+, S+, F) ::  s+

// enter student info for index 3
// enter name:: mahi
// enter age:: 12
// Enter appropriate grade (A, A+, B, B+, C, D, O, O+, S+, F) ::  o+

//  student 1
// name :: yashvi
// age :: 20
// incremented age :: 21
// grade :: S+

//  student 2
// name :: saloni
// age :: 20
// incremented age :: 21
// grade :: S+

//  student 3
// name :: mahi
// age :: 12
// incremented age :: 13
// grade :: O+

// Student with highest grades ::

//  student 1
// name :: yashvi
// age :: 21
// incremented age :: 22
// grade :: S+

//  student 2
// name :: saloni
// age :: 21
// incremented age :: 22
// grade :: S+