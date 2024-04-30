package P;
/*Program 2.) Create a class TwoDim which contains private members as x and y coordinates in package P1. 
Define the default constructor, a parameterized constructor and override toString() method to display the co- ordinates. 
Now reuse this class and in package P2 create another class ThreeDim, adding a new dimension as z as its private member.

 Define the constructors for the subclass and override toString() method in the subclass also. 
 Write appropriate methods to show dynamic method dispatch. The main() function should be in a package P.
*/

import P1.TwoDim;
import P2.ThreeDim;

public class Main {
    public static void main(String[] args) {
        TwoDim twoDim = new TwoDim(2, 3);
        ThreeDim threeDim = new ThreeDim(twoDim, 4);
        ThreeDim threeDim2 = new ThreeDim(5, 3, 4);
        System.out.println(twoDim);
        System.out.println(threeDim);
        System.out.println(threeDim2);
    }
}
