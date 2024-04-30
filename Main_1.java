/*Program 3.) Define an abstract class Shape in package P1. 
Inherit two more classes: Rectangle in package P2 and Circle in package P3. 
Write a program to ask the user for the type of shape and then using the concept of
dynamic method dispatch, display the area of the appropriate subclass.
Also write appropriate methods to read the data. The main() function should not be in any package.  */

import java.util.Scanner;
import P1.Shape;
import P2.Rectangle;
import P3.Circle;

public class Main_1 {
   public static void main (String args[]){
   Shape shapeRec = new Rectangle(45, 45);
   Shape shapeCir = new Circle(45);
   
   Scanner scanner = new Scanner(System.in);
   System.out.println("enter your shape");
   String user_input = scanner.nextLine();
   if(user_input.equalsIgnoreCase("Rectangle")){
      shapeRec.Area();
   }
   else if(user_input.equalsIgnoreCase("Circle")){
      shapeCir.Area();
   }
   
   
   }
}
