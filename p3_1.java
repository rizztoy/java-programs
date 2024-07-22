// Part 3: Conditional Statements and Loops
// 1. Write a program that takes a number as input and determines whether it is even or odd 
// using an if-else statement.
import java.util.Scanner;
class oddeven{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("enter the num you wanna check is even or not :: ");
        int numb=scan.nextInt();
        if(numb%2==0)
            System.out.println(numb+" is even.");
        else
            System.out.println(numb+" is odd.");
    }
}

// output :: 
// enter the num yopu wanna check is even or not :: 2
// 2 is even.
// PS C:\ritika\sem 5\java> java oddeven
// enter the num yopu wanna check is even or not :: 5
// 5 is odd.