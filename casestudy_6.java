// Problem 6: BMI Calculator
// Create a program that calculates a person's Body Mass Index (BMI) and provides an interpretation of
// the result. The program should have the following features:
//  Prompt the user to enter their height (in meters) and weight (in kilograms).
//  Calculate the BMI using the formula: BMI = weight / (height * height).
//  Determine the BMI category (<18.5 underweight, 18.5 – 24.9 normal, 25 – 29.9overweight, or obese) based on the
// calculated BMI.
// Obesity: BMI ≥ 30
// Class 1 (Moderate): BMI 30 – 34.9
// Class 2 (Severe): BMI 35 – 39.9
// Class 3 (Very Severe or Morbid): BMI ≥ 40
//  Display the user's BMI value and the corresponding BMI category.

class bmi{
    private double height;
    private double weight;
    private double bmi;
    public bmi(double height, double weight)
    {
        this.height=height;
        this.weight=weight;
        this.bmi=weight/(height*height);
    } 
    public void insert(double height, double weight)
    {
        this.height=height;
        this.weight=weight;
        this.bmi=weight/(height*height);
    } 
    public double BMI()
    {
        return bmi;
    }

    public String category()
    {
        if(bmi<18.5)
        {
            return "underweight";
        }
        else if(bmi>=18.5 && bmi<=24.9)
        {
            return "normal";
        }
        else if(bmi>24.9 && bmi<=29.9)
        {
            return "overweight";
        }
        else
        {
            return "obese";
        }
    }
}
class casestudy_5{
    public static void main(String args[])
    {
        bmi p1=new bmi(1.6,49);
        System.out.println(p1.BMI()+"    "+p1.category());   
    }
}

//output


// C:\j>java casestudy_5
// 19.140624999999996    normal
