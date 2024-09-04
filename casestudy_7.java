// Problem 7: Leap Year Checker
// Write a program that checks whether a given year is a leap year. The program should have the
// following features:
// Prompt the user to enter a year.
// Implement the logic to determine if the year is a leap year (a year divisible by 4, except for
// years divisible by 100, unless they are also divisible by 400).
// Display whether the entered year is a leap year or not.
class casestudy_6{
    public static boolean leapyearChecker(int year)
    {
        if(year%100==0)
        {
            if(year%400==0)
                return true;
            else
                return false;
        }
        else{
            if(year%4==0)
                return true;
            else
                return false;
        }
    }
    public static void main(String args[]) 
    {
        int year=1900;
        if(leapyearChecker(year))
            System.out.println(year+" is a leap year");
        else
            System.out.println(year+" is not a leap year");
    }
}
//output
// C:\j>java casestudy_6 
// 1900 is not a leap year

// C:\j>java casestudy_6
// 2012 is a leap year