// Problem 2: Temperature Analyzer
// Create a program that analyzes temperature data. The program should have the following features:
//  Allow the user to input a series of temperature readings (in Celsius).
//  Calculate and display the average temperature.
//  Determine and display the highest and lowest temperatures.
//  Categorize the temperatures into "cold," "mild," and "hot" based on predefined 
// temperature ranges.
import java.time.LocalDate;
// that's a constructor for getting date having arguements year month and date.
// LocalDate date = LocalDate.of(2024, 7, 24); // July 24, 2024
import java.util.Scanner;
class temperature{
    private String Category;
    private double value;
    private String location;
    private LocalDate timestamp;
    static private double highest=0;
    static private double lowest=2344646;
    static private double average=0;
    static private int count=0;
    public temperature()
    {
        count++;
    }
    public temperature(String location, LocalDate timestamp, double value)
    {
        
// Cold: Below 15°C
// Mild: 15°C to 30°C
// Hot: Above 30°C
        this.location=location;
        this.timestamp=timestamp;
        this.value=value;
        average+=value;
        if(value<=15)
        {
            Category="cold";
        }
        else if(value>15 && value<=30)
        {
            Category="mild";
        }
        else{
            Category="hot";
        }
        if(count==1)
        {
            lowest=value;
        }
        if(highest<value)
        {
            highest=value;
        }
        if(lowest>value)
        {
            lowest=value;
        }
    }
    public void getTemp()
    {
// Cold: Below 15°C
// Mild: 15°C to 30°C
// Hot: Above 30°C
        Scanner scan=new Scanner(System.in);
        System.out.print("\n location :: ");
        location=scan.next();
        LocalDate currentDate = LocalDate.now();
        // System.out.println("Current date: " + currentDate);
        
        // Example of using LocalDate methods
        // int year = currentDate.getYear();
        // int month = currentDate.getMonthValue();
        // int day = currentDate.getDayOfMonth();

        
        // System.out.printf("Year: %d, Month: %d, Day: %d%n", year, month, day);
        int year=2355454, date=35542, month=253425;
        boolean flag=false;
        while(year>currentDate.getYear())
        {
            System.out.print("year < "+currentDate.getYear()+" :: ");
            year=scan.nextInt();
        }
        while(month>12)
        {
            System.out.print("enter appropriate month ( <= 12 ):: ");
            month=scan.nextInt();
        }
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            while(date>31)
            {
                System.out.print("enter appropriate DATE ( <= 31 ) :: ");
                date=scan.nextInt();    
            }
        }
        else{
            if(month==2)
            {
                if(year%100==0)
                {
                    if(year%400==0)
                    {
                        flag=true;
                    }
                }
                else
                {
                    if(year%4==0)
                    {
                        flag=true;
                    }   
                }
                if(flag==true)
                {
                    while(date>29)
                    {
                    System.out.print("enter appropriate DATE ( <=29 ) :: ");
                    date=scan.nextInt();    
                    }
                }
                else{
                    while(date>28)
                    {
                    System.out.print("enter appropriate DATE ( <= 28 ) :: ");
                    date=scan.nextInt();
                    }
                }
            }
            else{
                while(date>31)
                {
                System.out.print("enter appropriate DATE ( <= 30 ) :: ");
                date=scan.nextInt();    
                }
            }
            
        }
        LocalDate timestam = LocalDate.of(year, month, date);
        timestamp=timestam;
        System.out.print("enter temperature (celsius):: ");
        value=scan.nextDouble();
        average+=value;
        
        if(count==1)
        {
            lowest=value;
        }
        if(highest<value)
        {
            highest=value;
        }
        if(lowest>value)
        {
            lowest=value;
        }
        
        if(value<=15)
        {
            Category="cold";
        }
        else if(value>15 && value<=30)
        {
            Category="mild";
        }
        else{
            Category="hot";
        }
   }
   public static void average()
   {
        System.out.println("average :: "+average/count);
   }
   public static void highest()
   {
        System.out.println("highest :: "+highest);
   }
   public static void lowest()
   {
        System.out.println("lowest :: "+lowest);
   }

   public void display()
   {
        System.out.println(location +"\t\t"+ value +"\t"+Category +"\t"+ timestamp);
   }
}
class imply{

    public static void main(String args[])
    {
        Scanner scan= new Scanner(System.in);
        System.out.print("enter the number of input :: ");
        int data=scan.nextInt();
        temperature[] t1 = new temperature[data];
        for(int i=0;i<data;i++)
        {
            System.out.print("enter data "+(int)(i+1)+" :: ");
            t1[i]=new temperature();
            t1[i].getTemp();
        }
        for(int i=0;i<data;i++)
        {
            t1[i].display();
            
        }
         temperature.highest();
         temperature.lowest();
         temperature.average();
        
        
    }
}

//output ::
// PS Z:\java> javac casestudy_2.java
// PS Z:\java> java imply
// enter the number of input :: 5
// enter data 1 :: 
//  location :: bihar
// year < 2024 :: 2022
// enter appropriate month ( <= 12 ):: 2
// enter appropriate DATE ( <= 28 ) :: 8
// enter temperature (celsius):: 63
// enter data 2 :: 
//  location :: lol
// year < 2024 :: 2023
// enter appropriate month ( <= 12 ):: 6
// enter appropriate DATE ( <= 30 ) :: 9
// enter temperature (celsius):: 55
// enter data 3 :: 
//  location :: rajmahal
// year < 2024 :: 2015
// enter appropriate month ( <= 12 ):: 12
// enter appropriate DATE ( <= 31 ) :: 5
// enter temperature (celsius):: 43
// enter data 4 :: 
//  location :: koo,
// year < 2024 :: 2021
// enter appropriate month ( <= 12 ):: 8
// enter appropriate DATE ( <= 31 ) :: 24
// enter temperature (celsius):: 33
// enter data 5 :: 
//  location :: kl
// year < 2024 :: 2016
// enter appropriate month ( <= 12 ):: 9
// enter appropriate DATE ( <= 30 ) :: 27
// enter temperature (celsius):: 23
// bihar           63.0    hot     2022-02-08
// lol             55.0    hot     2023-06-09
// rajmahal        43.0    hot     2015-12-05
// koo,            33.0    hot     2021-08-24
// kl              23.0    mild    2016-09-27
// highest :: 63.0
// lowest :: 23.0
// average :: 43.4