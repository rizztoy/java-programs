// Problem 4: Fibonacci Sequence Generator
// Write a program that generates the Fibonacci sequence. The program should have the following 
// features:
//  Prompt the user to enter the number of Fibonacci numbers to generate.
//  Use a loop to calculate and display the Fibonacci sequence up to the specified number of 
// terms.
//  Optionally, allow the user to choose whether to display the sequence using 
// a for loop, while loop, or recursive method.
import java.util.Scanner;
class casestudy_4{
    public static void menu()
    {
        System.out.print("1. For loop ::\n2. While loop ::\n3. Recursive method ::\nchoice ::");
    }
    private static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the number you wanna generate fibonacci series for :: ");
        int n = scan.nextInt();
        int[] Fibonacci= new int[n];
      
        menu();
        char ch=scan.next().charAt(0);
        if(ch!='3')
        {
               
        }
        switch(ch){
            case '1':
                 Fibonacci[0]=0;
                Fibonacci[1]=1;
                int i=2;
                System.out.print(Fibonacci[0]+" "+Fibonacci[1]);    
                for(;i<n;i++)
                {
                    Fibonacci[i]=Fibonacci[i-1]+Fibonacci[i-2];
                    System.out.print(" "+Fibonacci[i]);
                }
                break;
            case '2':
                Fibonacci[0]=0;
                Fibonacci[1]=1;
                i=2;
                System.out.print(Fibonacci[0]+" "+Fibonacci[1]);
                while(i<n)
                {
                    Fibonacci[i]=Fibonacci[i-1]+Fibonacci[i-2];
                    System.out.print(" "+Fibonacci[i]);
                    i++;
                }
                
                
                break;
            case '3':
                for (i = 0; i < n; i++) {
                Fibonacci[i] = fibonacci(i);
                }
                for (i = 0; i < n; i++) {
                System.out.print(Fibonacci[i] + " ");
                }
                break;
            default:
                System.out.println("inappropriate choice.");
                break;
        }

    }
}

// output::
// enter the number you wanna generate fibonacci series for :: 7
// 1. For loop ::
// 2. While loop ::
// 3. Recursive method ::
// choice ::3
// 0 1 1 2 3 5 8 

// enter the number you wanna generate fibonacci series for :: 7
// 1. For loop ::
// 2. While loop ::
// 3. Recursive method ::
// choice ::1
// 0 1 1 2 3 5 8

// enter the number you wanna generate fibonacci series for :: 7
// 1. For loop ::
// 2. While loop ::
// 3. Recursive method ::
// choice ::2
// 0 1 1 2 3 5 8
