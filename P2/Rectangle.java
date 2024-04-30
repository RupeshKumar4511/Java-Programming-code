package P2;
import P1.Shape;
public class Rectangle extends Shape {
    double length;
    double breadth;

    public Rectangle(double length,double breadth){
     this.length= length;
     this.breadth = breadth;

    }
    public void Area(){
    System.out.println("Area of Rectangle is " + this.length * this.breadth);
    
    }
    
}
