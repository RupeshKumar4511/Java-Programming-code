/*Program 6.) Write a program that copies content of one file to another. 
Pass the names of the files through command-line arguments */

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class filehandling{
    
     public static void main(String[] args) {
      /*

      // code to create a file

       File file = new File("C:\\Rupesh\\file1.txt");
        try{
            file.createNewFile();

        }
        catch(Exception e) {
        System.out.println("some problem  occured");
    }  
    
   
   // code to write in a file
   try{

    FileWriter fileWriter = new FileWriter("C:\\Rupesh\\file1.txt");
    fileWriter.write("This is my first java file ");
    fileWriter.close();
    }
    catch(Exception e){
        System.out.println("there is any problem in code");
    }


    // code to read a file.
    try{

    File file = new File("C:\\Rupesh\\file1.txt");
      Scanner scanner = new Scanner(file);
      while (scanner.hasNextLine()) {
      String line = scanner.nextLine();
      System.out.println(line);
      scanner.close();  
      }     
       
    }
    catch (Exception e){
        System.out.println("some mistake in your code");
    }




    // This is my Second file;

    File file2 = new File("C:\\Rupesh\\file2.txt");
    try {
        file2.createNewFile();
    }
    catch(Exception e){
        System.out.println("there is some error");
    }

*/
   Scanner scanner  = new Scanner(System.in);
   System.out.println("enter the file path");
   String user_input = scanner.next();
   scanner.close();
  
   try{
    File file = new File(user_input);
    Scanner scanner1 = new Scanner(file);
    while (scanner1.hasNextLine()) {
    String line = scanner1.nextLine();
    
    FileWriter fileWriter2 = new FileWriter("C:\\Rupesh\\file2.txt");
    fileWriter2.write(line.substring(0));
    fileWriter2.close();
    System.out.println("file copied");
    }

    scanner1.close();
    } 

    catch(Exception e){
    System.out.println("exception here");
    }

    finally{
        
        System.out.println("Program end...");
        
    }

    }
}


