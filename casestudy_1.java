// Case Study Based Questions
// Problem 1: Currency Converter
// Write a program that can convert between different currencies. The program should have the 
// following features:
//  Prompt the user to enter the amount they want to convert.
//  Provide a list of available currencies (e.g., USD, EUR, JPY, GBP, INR) 
//  and ask the user to select the source and target currencies.
//  Implement the currency conversion logic using appropriate exchange rates.
//  Display the converted amount to the user.

// class currency{
//     private double inr;
//     private double eur;
//     private double usd;
//     private double gbp;
//     private double jpy;
// }
import java.util.Scanner;
class casestudy_1{
    public static void menu()
    {
        System.out.println(" 1. USD ");
        System.out.println(" 2. EUR ");
        System.out.println(" 3. JPY ");
        System.out.println(" 4. GBP ");
        System.out.println(" 5. INR ");
        System.out.println(" 6. Exit ");
        System.out.print(" enter choice :: ");
    }

    public static void inr2any(double inr)
    {
        Scanner scan = new Scanner(System.in);
//from rupee
// 1 eur = 91.14 rupee
// 1 usd = 83.65
// 1 gbp = 108.2 
// 1 jpy = 0.5330
        double eur = 0.011;// =1
        // 100=?
        // 100*1/91.14;
        double usd = 0.012;//83.65 inr= 1 usd;
        double gbp = 0.009 ;
        double jpy = 1.774;
        char choice='1';
        while(choice != '5')        
        {
        System.out.println(" 1. USD ");
        System.out.println(" 2. EUR ");
        System.out.println(" 3. JPY ");
        System.out.println(" 4. GBP ");
        System.out.println(" 5. TO EXIT ");
        System.out.print(" enter choice :: ");
        choice=scan.next().charAt(0);   
        switch(choice)
        {
            case '1':
                System.out.println(inr + "rupees :: "+(double)(inr*usd)+ "usd");
                break;
            case '2':
                System.out.println(inr + "rupees :: "+(double)(inr*eur)+ "eur");
                break;
            case '3':
                System.out.println(inr + "rupees :: "+(double)(inr*jpy)+ "gbp");
                break;
            case '4':
                System.out.println(inr + "rupees :: "+(double)(inr*gbp)+ "usd");
                break;
            case '5':
                return;
            default:
                System.out.println("invalid choice.");
                break;
        }
    }
}
    

    public static void usd2any(double usd)
    {
        Scanner scan = new Scanner(System.in);
// from usd
// 1 eur = 1.081 
// 1 inr = 0.012
// 1 gbp = 1.283 
// 1 jpy = 0.006
        double eur = 0.911;//=1
        // ?=100
        // 100/1.086=
        double inr = 83.898;
        double gbp = 0.778;
        double jpy = 148.806;
        char choice='1';
        while(choice != '5')        
        {
        System.out.println(" 1. INR ");
        System.out.println(" 2. EUR ");
        System.out.println(" 3. JPY ");
        System.out.println(" 4. GBP ");
        System.out.println(" 5. TO EXIT ");
        System.out.print(" enter choice :: ");
        choice=scan.next().charAt(0);
        switch(choice)
        {
            case '1':
                System.out.println(usd + " usd :: "+(double)(usd*inr)+ " inr");
                break;
            case '2':
                System.out.println(usd + " usd :: "+(double)(usd*eur)+ " eur");
                break;
            case '3':
                System.out.println(usd + " usd :: "+(double)(usd*jpy)+ " jpy");
                break;
            case '4':
                System.out.println(usd + " usd :: "+(double)(usd*gbp)+ " gbp");
                break;
            case '5':
                return;
            default:
                System.out.println("invalid choice.");
                break;
        }
    }
}
    public static void eur2any(double eur)
    {
       Scanner scan = new Scanner(System.in); 
// from eur
// 1 usd = 0.925
// 1 inr = 0.011
// 1 gbp = 1.187
// 1 jpy = 0.006
        double usd = 1.098;
        double inr = 92.084;
        double gbp = 0.854;
        double jpy = 163.326;
        char choice='1';
        while(choice != '5')
    {
        System.out.println(" 1. INR ");     
        System.out.println(" 2. USD ");
        System.out.println(" 3. JPY ");
        System.out.println(" 4. GBP ");
        System.out.println(" 5. TO EXIT ");
        System.out.print(" enter choice :: ");
        choice=scan.next().charAt(0);
        switch(choice)
        {
            case '1':
                System.out.println(eur + "  eur :: "+(double)(eur*inr)+"inr");
                break;
            case '2':
                System.out.println(eur + " eur :: "+(double)(eur*usd)+ " usd");
                break;
            case '3':
                System.out.println(eur + " eur :: "+(double)(eur*jpy)+ " jpy");
                break;
            case '4':
                System.out.println(eur + " eur :: "+(double)(eur*gbp)+ " gbp");
                break;
            case '5':
                return;

            default:
                System.out.println("invalid choice.");
                break;
        }
    }
}

    public static void gbp2any(double gbp)
    {
        Scanner scan = new Scanner(System.in);
// from gbp 
// 1 usd = 0.780
// 1 inr = 0.009
// 1 eur =0.843
// 1 jpy = 0.005
        double usd = 1.285;
        double inr = 107.770;
        double eur = 1.170;
        double jpy = 191.147;
        char choice='1';
        while(choice != '5')
    {
        System.out.println(" 1. INR ");     
        System.out.println(" 2. USD ");
        System.out.println(" 3. JPY ");
        System.out.println(" 4. EUR ");
        System.out.println(" 5. TO EXIT ");
        System.out.print(" enter choice :: ");
        choice=scan.next().charAt(0);
        switch(choice)
        {
            case '1':
                System.out.println(gbp + "  gbp :: "+(double)(gbp*inr)+"inr");
                break;
            case '2':
                System.out.println(gbp + " gbp :: "+(double)(gbp*usd)+ " usd");
                break;
            case '3':
                System.out.println(gbp + " gbp :: "+(double)(gbp*jpy)+ " jpy");
                break;
            case '4':
                System.out.println(gbp + " gbp :: "+(double)(gbp*eur)+ " eur");
                break;
            case '5':
                return;
            default:
                System.out.println("invalid choice.");
                break;
        }
    }
}


public static void jpy2any(double jpy)
    {
    Scanner scan = new Scanner(System.in);
//FROM JPY
// 1 usd = 154.568
// 1 inr = 1.847
// 1 eur =167.028
// 1 gbp = 198.240

        double usd = 0.007;
        double inr = 0.564;
        double eur = 0.006;
        double gbp = 0.005;
        char choice='1';
        while(choice != '5')
        {   
        System.out.println(" 1. INR ");
        System.out.println(" 2. USD ");
        System.out.println(" 3. GBP ");
        System.out.println(" 4. EUR ");
        System.out.println(" 5. TO EXIT ");
        System.out.print(" enter choice :: ");
             choice=scan.next().charAt(0);
        switch(choice)
        {
            case '1':
                System.out.println(jpy + "  gbp :: "+(double)(jpy*inr)+"inr");
                break;
            case '2':
                System.out.println(jpy + " jpy :: "+(double)(jpy*usd)+ " usd");
                break;
            case '3':
                System.out.println(jpy + " jpy :: "+(double)(jpy*gbp)+ " gbp");
                break;
            case '4':
                System.out.println(jpy + " jpy :: "+(double)(jpy*eur)+ " eur");
                break;
            case '5':
                return;

            default:
                System.out.println("invalid choice.");
                break;
        }
    }
}
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        char choice='1';
        while(choice!='6')
        {
            menu();
            
        // System.out.println(" 1. USD ");
        // System.out.println(" 2. EUR ");
        // System.out.println(" 3. JPY ");
        // System.out.println(" 4. GBP ");
        // System.out.println(" 5. INR ");
        // System.out.println(" 6. Exit ");
        // System.out.print(" enter choice :: ");
            choice=scan.next().charAt(0);
            switch(choice){
                case '1':
                    System.out.print("enter usd :: ");
                    double usd=scan.nextInt();
                    usd2any(usd);
                    break;
                case '2':
                    System.out.print("enter eur :: ");
                    double eur=scan.nextInt();
                    eur2any(eur);
                    break;
                case '3':
                    System.out.print("enter jpy :: ");
                    double jpy=scan.nextInt();
                    jpy2any(jpy);
                    break;
                case '4':
                    System.out.print("enter gbp :: ");
                    double gbp=scan.nextInt();
                    gbp2any(gbp);
                    break;
                case '5':
                    System.out.print("enter inr :: ");
                    double inr=scan.nextInt();
                    inr2any(inr);
                    break;
                default:
                    System.out.println("invalid choice");
                    break;
            }
        }
    }
}