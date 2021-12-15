import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args){
        //creating scanner object
     Scanner input = new Scanner(System.in);

     //prompting user to enter length
     System.out.println("enter the length: ");
     double length = input.nextDouble();

     //prompting user to enter breadth
     System.out.println("enter the breadth: ");
     double breadth = input.nextDouble();

     //calling rectangle object
     Area rectangleArea = new Area(length, breadth);
     System.out.print(rectangleArea.getArea());
    }
}
class Area{ //creating an rectangle object
    double length;
    double breadth;

    public Area(double newlength, double newbreadth){
        this.length = newlength;
        this.breadth = newbreadth;
    }
    public double getArea(){ //method that calculates rectangle area
        double result = length * breadth;
        return result;
    }
}