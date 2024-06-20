# Java-Programming


# Antanomy of java
When thejVM starts running, it looks for the class you give it at the command line. Then it starts looking for a specially-Written method that looks
exactly like:

public static void main (String [] args){

// your code goes here
}

Next, theJVM runs everything between the curly braces { }of your main
method. EveryJava application has to have at least one class. and at least
one main method (**not one main per class;just one main per application**).


# class and Object
![image](https://github.com/RupeshKumar4511/Java-Programming-code/assets/149661006/dab63228-4e62-46ab-bdcf-5e267c283ab0)


**A class is not an object.
(but it’s used to construct them)**


**Object**


Object is a collection of state(variables ) and behavior ( method)


 **Class** 
 A class is blue print of an  object.
It tells virtual machine how to make an object of that type . Each object made from that class have its own value for the instance variable ov that class.


# Use of main method:

1. To test your real class
<br>

2.To launch/start your Java application

# while loop 
while(true){
}
This is used to ceate infinite loop.

# Wrapper class


if we want to convert any number to string then we have method

int a =10; // convert primitive datatype to string
String str = String.valueOf();


Integer a =10 ;   // to convert object into into string 
String str = a.toString();


How to get max value from an array

int max = Arrays.stream(arr).max().getAsInt();

Here 
Arrays.stream(arr):

Converts the array arr into an IntStream, which is a sequence of primitive int values.

.max():

Finds the maximum value in the stream. It returns an OptionalInt because the stream might be empty, in which case there wouldn't be a maximum value.

.getAsInt():

Retrieves the value from the OptionalInt. Since we're assuming the array is not empty, this operation is safe. However, if there's a possibility that the array could be empty, it's better to handle the empty case explicitly to avoid NoSuchElementException.


# how to use for else in java ;
int num =25;
boolean found = false;
for(int i =2;i<num;i++){
if (num % i==0){
  found = true;
  
  System.out.println("not prime number");
  break;
} 
}
if (!found){
  System.out.println("prime number");

}




# concepts of stack memory and heap memory
In Java, memory management is a critical aspect of the language's runtime environment.
 Both stack and heap are areas of memory where data can be stored during program execution, but they serve different purposes and have different characteristics.

1. Stack Memory:

Purpose:
Stack memory is used for storing method execution frames and local variables.
Characteristics:
Each thread in a Java application has its own stack.
Memory allocation and deallocation on the stack follow a last-in, first-out (LIFO) principle.
It has a fixed size determined at the startup of the Java Virtual Machine (JVM).
Access to stack memory is faster than heap memory because of its simple allocation and deallocation mechanism.
Usage:

Method calls and local variables are stored in stack memory.
Variables created within a method, including primitive types and references to objects, are stored in stack memory.
Stack memory is automatically managed by the JVM, and it's not directly accessible to Java programmers.


2. Heap Memory:

Purpose:
Heap memory is used for dynamic memory allocation. It's where objects, arrays, and their instance variables are allocated.
Characteristics:
All Java objects reside in the heap.
Memory allocation and deallocation on the heap are less predictable than on the stack and follow a more complex process.
The size of the heap can dynamically increase or decrease during the execution of a Java program.
Memory management in the heap is handled by the garbage collector, which identifies and removes objects that are no longer in use to free up memory.
Usage:
Objects created using the new keyword are allocated in heap memory.
Instance variables of objects are stored in heap memory.
The heap is shared among all threads in a Java application.
Comparison:
Lifetime:
Stack memory is short-lived and exists only during the execution of a method, while heap memory persists for the duration of the program's execution or until the object is no longer referenced.
Access:
Access to stack memory is faster than access to heap memory due to its simple allocation and deallocation mechanism.
Size:
Stack memory size is fixed and usually smaller than the heap. It's determined at JVM startup.
The heap can dynamically increase or decrease in size during program execution based on the memory requirements of the application and the available system resources.


# Advantages of Packages; 

1. Java Package is Used to Categorize the Classes and Interfaces for Easier Maintenance:
In Java, packages serve as a way to group related classes, interfaces, enumerations, and annotations.
By organizing code into packages, developers can manage and maintain large codebases more efficiently.

2.Java Package Removes Naming Collision:
Naming collisions occur when two classes or interfaces have the same name.
Packages help in avoiding these conflicts by providing a namespace for each class or interface. 

3.Java Package Provides Access Protection:
Java packages also play a crucial role in defining the accessibility of classes and their members. This is achieved through access modifiers and package-level access control. 


# java System Packages:

Java system packages are a set of pre-defined packages provided by the Java Standard Library (also known as the Java API). These packages include classes and interfaces that are fundamental to the design and functioning of Java applications. They offer essential functionality, such as basic input and output operations, string manipulation, data structures, networking, graphical user interface (GUI) development, and more.

Here are some of the core Java system packages and their primary purposes:

1. java.lang
This package is automatically imported into every Java program and contains fundamental classes and interfaces.

Classes: Object, Class, String, Math, System, Thread, Exception, etc.
Purpose: Provides classes that are fundamental to the design of the Java programming language.
2. java.util
This package contains the collections framework, legacy collection classes, event model, date and time facilities, and miscellaneous utility classes.

Classes: ArrayList, HashMap, HashSet, Date, Calendar, Random, Scanner, etc.
Purpose: Provides utility classes and data structures like lists, maps, sets, and utilities for date and time manipulation.
3. java.io
This package provides for system input and output through data streams, serialization, and the file system.

Classes: File, FileInputStream, FileOutputStream, BufferedReader, BufferedWriter, PrintStream, etc.
Purpose: Handles input and output operations, including file I/O and stream-based I/O.
4. java.nio
This package provides classes for the new I/O (non-blocking I/O) facilities.

Classes: ByteBuffer, CharBuffer, FileChannel, Paths, Path, Files, etc.
Purpose: Offers advanced I/O capabilities, including buffer management, file channels, and file operations.
5. java.net
This package provides classes for implementing networking applications.

Classes: URL, URLConnection, Socket, ServerSocket, InetAddress, HttpURLConnection, etc.
Purpose: Facilitates network operations, such as URL handling, socket programming, and networking utilities.
6. java.awt
This package contains classes for creating user interfaces and for painting graphics and images.

Classes: Button, Label, Canvas, Frame, Graphics, Color, Font, etc.
Purpose: Provides the Abstract Window Toolkit (AWT) for creating GUI components and handling events.
7. javax.swing
This package provides a set of "lightweight" (all-Java language) components that work the same on all platforms.

Classes: JButton, JLabel, JPanel, JFrame, JTextField, etc.
Purpose: Offers a rich set of GUI components that enhance and extend the AWT framework.
8. java.sql
This package provides the API for accessing and processing data stored in a data source (usually a relational database) using the Java programming language.

Classes: Connection, Statement, PreparedStatement, ResultSet, SQLException, etc.
Purpose: Enables database connectivity and operations using JDBC (Java Database Connectivity).
9. java.security
This package provides the classes and interfaces for the security framework.

Classes: MessageDigest, KeyPair, Signature, SecureRandom, AccessController, etc.
Purpose: Supports the development of security features, including cryptography, authentication, and access control.
10. java.time
This package provides the API for date and time operations.

Classes: LocalDate, LocalTime, LocalDateTime, ZonedDateTime, Duration, Period, etc.
Purpose: Offers a comprehensive set of classes for date and time manipulation, introduced in Java 8 to replace the older java.util.Date and java.util.Calendar.

# Virtual Memory Error
Virtual memory error refers to problems related to the management and allocation of virtual memory by the operating system (OS). Virtual memory is a memory management technique that allows an operating system to compensate for physical memory shortages, temporarily transferring data from random access memory (RAM) to disk storage.

Insufficient Virtual Memory: When the combined total of RAM and allocated virtual memory (page file) is insufficient to handle the current demands of running applications, the OS may produce a virtual memory error.

# OutOfMemoryError
OutOfMemoryError in Java is a runtime error thrown by the Java Virtual Machine (JVM) when it cannot allocate an object because it is out of heap memory. This error indicates that the garbage collector has failed to free up enough memory for a new object. 


# Difference between Exception and Error:

Recoverability:

Exception: Usually represents conditions that can be recovered from. The application can catch and handle these exceptions to continue running.
Error: Represents serious issues that are generally not recoverable. The application is usually unable to handle these errors and may need to terminate.
Handling:

Exception: Can be caught using a try-catch block. Checked exceptions must be either caught or declared in the method signature.
Error: Generally should not be caught. Handling errors is often not practical as they signify serious problems that the application cannot reasonably be expected to recover from.

Examples:

Exception: IOException, SQLException, NullPointerException.
Error: OutOfMemoryError, StackOverflowError, VirtualMachineError.



# Use of finalize() method;
The primary purpose of the finalize method is to perform cleanup operations on resources that are not managed by the Java garbage collector. This includes resources like file handles, network connections, or database connections.

example =>

public class ResourceHolder {
    private FileOutputStream fileOutputStream;

    public ResourceHolder(String fileName) throws FileNotFoundException {
        fileOutputStream = new FileOutputStream(fileName);
    }

    @Override
    protected void finalize() throws Throwable {
        try {
            if (fileOutputStream != null) {
                fileOutputStream.close();
                System.out.println("FileOutputStream closed.");
            }
        } finally {
            super.finalize();
        }
    }
}


Note =>  In this example, the finalize method ensures that the FileOutputStream is closed before the object is garbage collected.

# Byte Stream
Byte streams are used for handling I/O of raw binary data. They read and write data in bytes (8-bit). Byte streams are suitable for handling binary data such as images, audio files, and other types of binary content.

Key Classes for Byte Stream

InputStream:

This is an abstract class that represents an input stream of bytes.
Common subclasses include FileInputStream, ByteArrayInputStream, BufferedInputStream, and DataInputStream.


OutputStream:

This is an abstract class that represents an output stream of bytes.
Common subclasses include FileOutputStream, ByteArrayOutputStream, BufferedOutputStream, and DataOutputStream.


Example =>

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExample {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("input.txt");
             FileOutputStream fos = new FileOutputStream("output.txt")) {
             
            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


# Character Stream

Character streams are used for handling I/O of character data. They read and write data in characters (16-bit Unicode). Character streams are suitable for handling text data.

Key Classes for Character Stream
Reader:

This is an abstract class that represents an input stream of characters.
Common subclasses include FileReader, BufferedReader, CharArrayReader, StringReader, and InputStreamReader.
Writer:

This is an abstract class that represents an output stream of characters.
Common subclasses include FileWriter, BufferedWriter, CharArrayWriter, StringWriter, and OutputStreamWriter.


Example => 
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamExample {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("input.txt");
             FileWriter fw = new FileWriter("output.txt")) {
             
            int charData;
            while ((charData = fr.read()) != -1) {
                fw.write(charData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



# Efficiency of Byte Stream and Character Stream ;
Byte Stream
Efficiency with Binary Data: Byte streams are typically more efficient when dealing with binary data (like images, audio files, and other non-text files). This is because they read and write raw binary data directly in 8-bit bytes, which involves less overhead.
No Encoding/Decoding Overhead: Since byte streams do not involve character encoding and decoding, they avoid the overhead associated with converting between bytes and characters.

Character Stream
Efficiency with Text Data: Character streams are optimized for handling text data. They read and write 16-bit Unicode characters, which makes them suitable for text files and ensures proper handling of different character encodings.
Encoding/Decoding Overhead: Character streams involve encoding and decoding of characters to and from bytes, which can introduce some overhead. However, this overhead is necessary for correctly processing text data, especially when dealing with different character sets and encodings.


# MVC
**1. Model**
Definition: The model represents the data and the business logic of the application. It directly manages the data, logic, and rules of the application.
Responsibilities:
Retrieve data from the database.
Handle data processing and business logic.
Notify the view of any data changes, often through a notification mechanism like observers.
Example: In an e-commerce application, the model would be responsible for handling data related to products, users, and orders.
**2. View**
Definition: The view is the user interface of the application. It displays data from the model to the user and sends user commands to the controller.
Responsibilities:
Render data in a user-friendly format.
Receive user input and display results.
Refresh the display when data in the model changes.
Example: In the same e-commerce application, the view would be the HTML pages or user interface elements that display product listings, user information, and shopping carts.
**3. Controller**
Definition: The controller acts as an intermediary between the model and the view. It processes user inputs and interacts with the model to update the view accordingly.
Responsibilities:
Handle user input from the view.
Update the model based on user actions.
Select the view to display based on the model state and user input.
Example: In the e-commerce application, the controller would manage actions like adding items to a cart, processing user logins, and handling checkout processes
