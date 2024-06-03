/*Program 6.) Write a program that copies content of one file to another. 
Pass the names of the files through command-line arguments */

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.Scanner;
import java.io.IOException;

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
  try {
   FileReader fr = new FileReader("C:\\Rupesh\\file1.txt");
             
             
            int charData;
            StringBuilder line = new StringBuilder();
            while ((charData = fr.read()) != -1) {
                line.append((char)charData);
            }
            
            System.out.println(line.toString());
            fr.close();
        }
        
    catch (IOException e){
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
  
    try {
        FileReader fr = new FileReader(user_input);
        FileWriter fw = new FileWriter("file4.txt");
             
            int charData;
            while ((charData = fr.read()) != -1) {
                fw.write(charData);
            }
        fr.close();
        fw.close();
        System.out.println("file copied");
        
        }


    catch(IOException e){
    System.out.println("exception here");
    }

    finally{
        
        System.out.println("Program end...");
        
    }

    }
}


