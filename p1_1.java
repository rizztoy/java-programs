// 1. Declare variables of different data types (int, double, boolean, char) and perform various
// arithmetic operations on them.
import java.util.Scanner;
class part1
{
    public static void menu()
        {
        System.out.print("1. int\n2. double\n3. char\n4. bool\n5. exit\n choice :: ");
        }
    public static void main(String args[])
    {
        char choice='1';

        Scanner s=new Scanner(System.in);
        while(choice!='5')
        {
        menu();
        choice=s.next().charAt(0);
        switch(choice)
            {
            case '1':
                System.out.println("int");
                System.out.print("enter no 1 :: ");
                int first=s.nextInt();
                System.out.print("enter no 2 :: ");
                int second=s.nextInt();
                System.out.println("addition :: "+(int)(first+second));
                System.out.println("multiplication :: "+(int)(first*second));
                int subs=first-second;
                System.out.println("substraction :: "+subs);
                if(second!=0)
                System.out.println("division :: "+(int)(first/second));
                else
                System.out.println("denominator can not be 0.");
                break;
            
            case '2':
                System.out.println("double");
                System.out.print("enter no 1 :: ");
                double f=s.nextDouble();
                System.out.print("enter no 2 :: ");
                double ss=s.nextDouble(); 
                System.out.println("addition :: "+(double)(f+ss));
                System.out.println("multiplication :: "+(double)(f*ss));
                double subst=f-ss;
                System.out.println("substraction :: "+subst);
                if(ss!=0)
                System.out.println("division :: "+(double)(f/ss));
                else
                System.out.println("denominator can not be 0.");
                break;
            
            case '3':
                System.out.println("char");
                System.out.print("enter char 1 :: ");
                char firstc=s.next().charAt(0);
                System.out.print("enter char 2 :: ");
                char secondc=s.next().charAt(0);
                System.out.println("concat :: "+firstc+secondc);
                break;

            case '4':
                System.out.println("boolean");
                System.out.print("enter no 1 :: ");
                boolean fir=s.nextBoolean();
                System.out.print("enter no 2 :: ");
                boolean seco=s.nextBoolean();
                boolean andd=fir & seco;
                boolean orr=fir | seco;
                boolean xor=fir ^ seco;
                // boolean nand=~(fir & seco);
                // boolean nor=~(fir | seco);
                System.out.println("and :: "+andd);
                System.out.println("or :: "+orr);
                System.out.println("xor :: "+xor);
                // System.out.println("nand :: "+nand);
                // System.out.println("nor :: "+nor);
                break;

            default:
                if(choice != '5')
                System.out.println("invalid choice.");
                break;
            }
        }
    }
}
// PS Z:\java> javac p1_1.java
// PS Z:\java> java part1     
// 1. int
// 2. double
// 3. char
// 4. bool
// 5. exit
//  choice :: 1
// int
// enter no 1 :: 12
// enter no 2 :: 6
// addition :: 18
// multiplication :: 72
// substraction :: 6
// division :: 2
// 1. int
// 2. double
// 3. char
// 4. bool
// 5. exit
//  choice :: 2
// double
// enter no 1 :: 12.24
// enter no 2 :: 6.2
// addition :: 18.44
// multiplication :: 75.888
// substraction :: 6.04
// division :: 1.9741935483870967
// 1. int
// 2. double
// 3. char
// 4. bool
// 5. exit
//  choice :: 3
// char
// enter char 1 :: r
// enter char 2 :: y
// concat :: ry
// 1. int
// 2. double
// 3. char
// 4. bool
// 5. exit
//  choice :: 4
// boolean
// enter no 1 :: true
// enter no 2 :: false
// and :: false
// or :: true
// xor :: true
// 1. int
// 2. double
// 3. char
// 4. bool
// 5. exit
//  choice :: 5