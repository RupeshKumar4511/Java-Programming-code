/* Program 7.) Write a program to read a file and display only those lines that
 have the first two characters as '//' (Use try with resources).
 */

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
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
    try {FileReader fr = new FileReader("C:\\Rupesh\\file3.txt");
             
             
            int charData;
            StringBuilder line = new StringBuilder();
            while ((charData = fr.read()) != -1) {
                line.append((char)charData);
            }
            
            String lines = line.toString();
            
        if(lines.contains("//")){
        int index = lines.indexOf("//");
        int index1 = lines.indexOf("\n",index);
        System.out.println(lines.substring(index,index1+1));
 
        }      
            fr.close();
        }
    catch (IOException e){
        System.out.println("some mistake in your code");
    }
    finally{
    
        System.out.println("Program end...");
    }


    }
}
