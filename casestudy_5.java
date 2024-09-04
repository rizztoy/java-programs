// Problem 5: Palindrome Checker 
// Submission Date: - &Date 
// Develop a program that checks whether a given string is a palindrome. The program should have the 
// following features: 
//  Prompt the user to enter a string. 
//  Implement a method to determine if the string is a palindrome (a word, phrase, number, or 
// other sequence of characters that reads the same backward as forward). 
//  Display the result (whether the input is a palindrome or not) to the user. 
import java.util.Scanner;
class palindrome{
    public static void palindromeChecker( String palin)
    {
        int j=0;
        char[] p = new char[palin.length()];
        for (int i=(int)(palin.length()-1);i>=0;i--)
        {
            p[j]=palin.charAt(i);
            // System.out.println(p[j] +" "+palin.charAt(i));   
            j++;
        }
        String pa=new String(p);
        if(palin.equals(pa))
        {
        System.out.println(palin+" is in palindrome sequence");
        }
        else
        {
            System.out.println(palin+" is not in palindrome sequence");
        }
        
    }
    // public void palindromeChecker( int palin)
    // {
        
    // }
    // public void palindromeChecker( Deuble palin)
    // {
        
    // }
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("enter what you wanna check :: ");
        String palin=scan.nextLine();
        // String palin= new String("pocop");
        // String paln= new String(palin.reverse());
        palindromeChecker(palin);
        // System.out.println();
    }
}
// output :: 

// enter what you wanna check :: hhhh oooo hhhh
// hhhh oooo hhhh is in palindrome sequence
// enter what you wanna check :: 345.543
// 345.543 is in palindrome sequence
// enter what you wanna check :: 343
// 343 is in palindrome sequence
// enter what you wanna check :: what's so wrong
// what's so wrong is not in palindrome sequence
// enter what you wanna check :: 342.2
// 342.2 is not in palindrome sequence
