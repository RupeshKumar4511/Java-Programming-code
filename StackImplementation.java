/*Program 5.) Write a program to implement stack. Use exception handling to manage underflow and overflow
conditions.
*/

public class StackImplementation
   {

      public static void Overflow(){
         int [] arr = new int [5];
         for (int i=0 ; i<=arr.length ; i++){
           arr[i]=5;
         }
      }
      public static void Underflow(){
         int [] arr1 = new int[0];
         System.out.println(arr1[0]);
      }
      
   public static void main(String[] args) {
      try{
      Overflow();
      }
      catch (Exception e){
         System.out.println("This is an overflow error");
      }

     try{
       Underflow();
      }
      catch(Exception e){
         System.out.println("This is an underflow error");
      }
      
   } 
}




