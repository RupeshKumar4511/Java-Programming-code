/*Programs 4.) Create an exception subclass UnderAge, which prints "Under Age" along with the age value when an
object of UnderAge class is printed in the catch statement. Write a class exceptionDemo in which
 the method test() throws UnderAge exception if the variable age passed to it as argument is less than 18. 
 Write main() method also to show working of the program.
 */

class Underage extends Exception{

  public Underage(String str){
    super(str);
  }

}    
public class exceptionDemo {
  
  static void test(int age) throws Underage {
    
    if (age<18){
      throw new Underage("under age " + age) ;
    }
   
    else{
      System.out.println("you are " + age + " years old.");
      }
  }

  public static void main(String[] args) {
    try{
      test(15);
    }
    catch(Underage a){
      System.out.println(a);
    }
  }
}