/* Program 1.) Design a class Complex having a real part (x) and an imaginary part (y). Provide methods to perform
the following on complex numbers: 

a.) Add and Multiply two complex numbers.
b.) toString() method to display complex numbers in the form; x+iy
 */


class Complex {
    int x;
    int y;

    Complex(int real_1, int imaginary_1) {
        this.x = real_1;
        this.y = imaginary_1;
    }

    public void Addition(int real_2, int imaginary_2) {
        int real_3 = this.x + real_2;
        int imaginary_3 = this.y + imaginary_2;
        System.out.println("Second Complex Number is : " + real_2 + "+" + imaginary_2 + "i");
        System.out.println("additon of two complex Number is : " + real_3 + "+" + imaginary_3 + "i");
    }

    public void Multiplication(int real_2, int imaginary_2) {
        int real_3 = this.x * real_2 - this.y * imaginary_2;
        int imaginary_3 = this.x * imaginary_2 + this.y * real_2;
        System.out.println("Second Complex Number is : " + real_2 + "+" + imaginary_2 + "i");
        System.out.println("multiplication of two complex Number is : " + real_3 + "+" + imaginary_3 + "i");
    }

    public String toString() {
        return ("First Complex Number is : " + this.x + "+" + this.y + "i");
    }
}

public class Practical_1 {
    public static void main(String[] args) {
        Complex var1 = new Complex(12, 34);
        System.out.println(var1);
        var1.Addition(34, 23);
        var1.Multiplication(12, 13);
    }
}
