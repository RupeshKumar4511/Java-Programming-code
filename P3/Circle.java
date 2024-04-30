package P3;
import P1.Shape;
public class Circle extends Shape {
   double radius;
   
  public Circle(double radius){
    this.radius = radius;
   }
   
  public void Area(){
  System.out.println("Area of circle is " + 3.14 * this.radius * this.radius);
  }

}