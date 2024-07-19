// 2. Write a program that calculates the area and perimeter of a rectangle, given the length and 
// width as input.
import java.util.Scanner;
class calculation{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("enter length :: ");
        double length=scan.nextDouble();
        
        System.out.print("enter width :: ");
        double width=scan.nextDouble();
        
        System.out.println("area :: "+(double)(length*width));

        System.out.println("perimeter :: "+(double)(2*(double)(length+width)));
    }
}
// output::
// PS Z:\java> javac p1_2.java 
// PS Z:\java> java calculation
// enter length :: 2
// enter width :: 4
// area :: 8.0
// perimeter :: 12.0