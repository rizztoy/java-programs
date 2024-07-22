// 3. Create a Circle class with the following properties: radius. Implement methods to calculate 
// the area and circumference of the circle.
class circle{
    static final double pi=3.1416;
    private double radius;
    private double circumference;
    private double area;
    public circle(double r)
    {
        this.radius=r;
    }
    public void calculation()
    {
        this.area=this.radius*this.radius*pi;
        this.circumference=2*this.radius*pi;
        System.out.println("radius :: "+this.radius);
        System.out.println("circumference :: "+this.circumference);
        System.out.println("area :: "+this.area);
    }
}
class implimentation{
    public static void main (String args[])
    {
        circle c= new circle(12);
        c.calculation();
    }
}


//output::
// radius :: 12.0
// circumference :: 75.3984
// area :: 452.3904