/* Program 7.) Write a program to read a file and display only those lines that
 have the first two characters as '//' (Use try with resources).
 */

import java.io.FileWriter;
import java.util.Scanner;
import java.io.File;
public class Filehandling2{
     public static void main(String[] args) {
     /*  
      // code to create a file

       File file = new File("C:\\Rupesh\\file3.txt");
        try{
            file.createNewFile();

        }
    catch(Exception e) {
System.out.println("some problem  occured");
    }  
    
   
   // code to write in a file
   try{

    FileWriter fileWriter = new FileWriter("C:\\Rupesh\\file3.txt");
    fileWriter.write("This is my first java file . // This is a single comment.");
    fileWriter.close();
    }
    catch(Exception e){
        System.out.println("there is any problem in code");
    }

*/
    // code to read a file.
    try{

    File file = new File("C:\\Rupesh\\file3.txt");
    Scanner scanner = new Scanner(file);

    while (scanner.hasNextLine()) {
       String line = scanner.nextLine();

    if(line.contains("//")){
       int index = line.indexOf("//");
       int index1 = line.indexOf(".",index);
       System.out.println(line.substring(index,index1+1));

    }      
    }  
    scanner.close();     
       
    }
    catch (Exception e){
        System.out.println("some mistake in your code");
    }
    finally{
    
        System.out.println("Program end...");
    }


    }
}
