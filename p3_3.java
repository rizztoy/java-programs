// 3. Create a program that uses a for loop to print the first 10 multiples of a given number.
import java.util.Scanner;
class forloop{
    public static void main (String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("enter the number you wanna find multiple of :: ");
        int numb=scan.nextInt();
      
            for (int i=1;i<11;i++)
            {
                System.out.println(numb+" x "+i+" = "+(int)(numb*i));
            }
    }
}

//output::   
// PS C:\ritika\sem 5\java> javac p3_3.java
// PS C:\ritika\sem 5\java> java forloop   
// enter the number you wanna find multiple of :: 5
// 5 x 1 = 5
// 5 x 2 = 10
// 5 x 3 = 15
// 5 x 4 = 20
// 5 x 5 = 25
// 5 x 6 = 30
// 5 x 7 = 35
// 5 x 8 = 40
// 5 x 9 = 45
// 5 x 10 = 50