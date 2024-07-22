// 1. Create a Person class with the following properties: name, age, and gender. Implement
// methods to set and get these properties.
import java.util.Scanner;
class person{
    String name;
    int age;
    char gender;
    public void set()
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("enter name :: ");
        this.name=scan.next();
        System.out.print("enter age :: ");
        this.age=scan.nextInt();
        System.out.print("enter gender :: ");
        this.gender=scan.next().charAt(0);
    }
    public void get()
    {
        System.out.println("name :: "+name);
        System.out.println("age :: "+age);
        System.out.println("gender :: "+gender);
    }
}
class implimentation{
    public static void main(String args[])
    {
        
        // Scanner scan=new Scanner(System.in);
        person p1= new person();
        p1.set();
        p1.get();       
    }
}
// output::
// PS C:\ritika\sem 5\java> javac p2_1.java
// PS C:\ritika\sem 5\java> java implimentation
// enter name :: ritika
// enter age :: 19
// enter gender :: f
// name :: ritika
// age :: 19
// gender :: f