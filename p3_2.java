// 2. Implement a program that uses a switch-case statement to determine the day 
// of the week based on a numeric input (1 for Monday, 2 for Tuesday, etc.).
// 3. Create a program that uses a for loop to print the first 10 multiples of a given number.
// 4. Write a program that uses a while loop to calculate the factorial of a given number.
import java.util.Scanner;
class switchcase{
    public static void main (String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("enter the numberic value for week day :: ");
        char index=scan.next().charAt(0);
        switch(index)
        {
            case '1':
                System.out.println("It's SUNDAY.");
                break;
            case '2':
                System.out.println("It's MONDAY.");
                break;
            case '3':
                System.out.println("It's TUESDAY.");
                break;
            case '4':
                System.out.println("It's WEDNESAY.");
                break;
            case '5':
                System.out.println("It's THRUSDAY.");
                break;
            case '6':
                System.out.println("It's FRIDAY.");
                break;
            case '7':
                System.out.println("It's SATURDAY.");
                break;
            default:
                System.out.println("Invalid day index.");
                break;
        }
    }
}

//output::
// enter the numberic value for week day :: 3
// It's TUESDAY.
// PS C:\ritika\sem 5\java> java switchcase
// enter the numberic value for week day :: 8
// Invalid day index.