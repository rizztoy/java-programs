// 4. Write a program that uses a while loop to calculate the factorial of a given number.
import java.util.Scanner;
class whileloop{
    public static void main (String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("enter the number you wanna find factorial of :: ");
        int numb=scan.nextInt();
        int i=numb;
        int factorial=1;
            while(i > 1)
            {               
            factorial=factorial*i;
            i--;
            }
        System.out.println(numb+"'s factorial :: "+ factorial);
    }
}
// output ::
// PS C:\ritika\sem 5\java> javac p3_4.java
// PS C:\ritika\sem 5\java> java whileloop 
// enter the number you wanna find factorial of :: 5
// 5's factorial :: 120