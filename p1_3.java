// 3. Implement a program that converts temperature from 
// Celsius to Fahrenheit and vice versa. f=c*9/5+32
// fahrenheit into celsius = c=(f-32)5/9
import java.util.Scanner;
class convert{
    public static void menu(){
        System.out.println("enter 1 for converting Celsius to Fahrenheit. ");
        System.out.println("enter 2 for converting Fahrenheit to Celsius. ");
        System.out.println("enter 3 to exit. ");
        System.out.print("enter choice :: ");
    }
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        menu();
        char choice=scan.next().charAt(0);
        switch(choice)
        {
            case '1':
                System.out.print("enter celsius :: ");
                double c=scan.nextDouble();
                double f=(c*9/5)+32;
                System.out.println("fahrenheit :: "+f);
                break;
            case '2':
                System.out.print("enter fahrenheit :: ");
                double ff=scan.nextDouble();
                double cc=(ff-32)*5/9;
                System.out.println("celcius :: "+cc);
                break;
            case '3':
                // exit();
                break;
            default:
                System.out.println("invalid choice.");
                break;
        }
    }
}


//output :: 
// enter 1 for converting Celsius to Fahrenheit.
// enter 2 for converting Fahrenheit to Celsius.
// enter 3 to exit.
// enter choice ::
// 1
// enter celsius ::
// 70
// fahrenheit :: 158.0
// PS Z:\java> java convert
// enter 1 for converting Celsius to Fahrenheit. 
// enter 2 for converting Fahrenheit to Celsius.
// enter 3 to exit.
// enter choice ::
// 2
// enter fahrenheit :: 
// 150
// celcius :: 65.55555555555556
