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






# Swing
**How to change the font of text in label**

 label.setFont(new Font("Serif", Font.BOLD, 50));


**How to set the background color in swing**  
<br>
 frame.getContentPane().setBackground(Color.YELLOW);  

 getContentPane() => A container has several layers in it. We can think of a layer as a transparent film that overlays the container. In Java Swing, the layer that is used to hold objects is called the content pane. Objects are added to the content pane layer of the container. The getContentPane() method retrieves the content pane layer so that you can add an object or apply method to it. The content pane is an object created by the Java run time environment. 
**Remember that Content Pane is a layer of container.**

<br>
**How to use SetBounds(x-axis , y- axis , width, height)**
<br>
Remember that in swinng or awt gui , the origin start from top left . 

![image](https://github.com/RupeshKumar4511/Java-Programming-code/assets/149661006/f4a9bffb-82d1-46c3-9184-9fdde918a525)



 






















// My app
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
import rpack.PlaceholderTextField;

class Login {

    Login() {
        // Create a frame
        JFrame frame = new JFrame();

        // create label and set its properties
        JLabel label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(1250, 100);
        label.setText("SCHOOL MANAGEMENT SYSTEM");
        label.setFont(new Font("Serif", Font.BOLD, 50));

        JLabel lab1 = new JLabel("User_ID :");
        lab1.setFont(new Font("Serif", Font.PLAIN, 25));
        lab1.setBounds(150, 250, 250, 30);

        JLabel lab2 = new JLabel("Password :");
        lab2.setFont(new Font("Serif", Font.PLAIN, 25));
        lab2.setBounds(150, 250, 250, 30);

        // create TextField and set its properties
        JTextField text1 = new JTextField();
        text1.setFont(new Font("Serif", Font.PLAIN, 25));
        text1.setBounds(450, 165, 300, 30);

        JTextField text2 = new JTextField();
        text2.setFont(new Font("Serif", Font.PLAIN, 25));
        text2.setBounds(450, 205, 300, 30);

        // Here add label in frame
        frame.add(label);
        frame.add(lab1);
        frame.add(lab2);

        // here add textfield to frame

        frame.add(text1);
        frame.add(text2);

        // set the properties of frame
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.YELLOW);
        frame.setVisible(true);

    }
}

class First implements ActionListener {

    private JButton button, button1, button2, button3, button4, button5, button6,b7,b8,b9,b10,b11,b12;

    First() {

        // Create a frame
        JFrame frame = new JFrame();

        // Create a label and set its properties

        JLabel label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(1250, 100);
        label.setText("GOVT SR. SEC. SECONDARY SCHOOL, KARNAL");
        label.setFont(new Font("Serif", Font.BOLD, 50));

        // create buttons and add to frame
        button = new JButton("STUDENT  REGISTRATION");
        button.setBounds(230, 150, 200, 30);
        frame.add(button);


        button3 = new JButton("ENROLLMENT  DETAILS");
        button3.setBounds(230, 200, 200, 30);
        frame.add(button3);

        button4 = new JButton("ACADEMIC  DETAILS");
        button4.setBounds(230, 250, 200, 30);
        frame.add(button4);

        button5 = new JButton("STUDENT'S  FEE  DETAILS");
        button5.setBounds(230, 300, 200, 30);
        frame.add(button5);

        button6 = new JButton("ALL  STUDENT'S  DETAILS");
        button6.setBounds(230, 350, 200, 30);
        frame.add(button6);







        button1 = new JButton("TEACHER  REGISTRATION");
        button1.setBounds(480, 150, 300, 30);
        frame.add(button1);

        b7 = new JButton("TEACHER'S  SALARY  STRUCTURE");
        b7.setBounds(480, 200, 300, 30);
        frame.add(b7);

        b8 = new JButton("TEACHER'S  SALARY  DETAILS");
        b8.setBounds(480, 250, 300, 30);
        frame.add(b8);


        b9 = new JButton("ALL  TEACHER'S  DETAILs");
        b9.setBounds(480, 300, 300, 30);
        frame.add(b9);






        button2 = new JButton("OTHER  EMPLOYEES  REGISTRATION");
        button2.setBounds(830, 150, 300, 30);
        frame.add(button2);
        b10 = new JButton("EMPLOYEE'S  SALARY  STRUCTURE");
        b10.setBounds(830, 200, 300, 30);
        frame.add(b10);

        
        b11 = new JButton("EMPLOYEE'S  SALARY  DETAILS");
        b11.setBounds(830, 250, 300, 30);
        frame.add(b11);

        b12 = new JButton("ALL  EMPLOYEE'S  DETAILS");
        b12.setBounds(830, 300, 300, 30);
        frame.add(b12);






        // Here add label in frame
        frame.add(label);

        // set the properties of frame
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.YELLOW);
        frame.setVisible(true);

        // Registraton of buttons
        button.addActionListener(this);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);

    }

    // Event handling

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == button) {
            new Student(null);

        }
        if (e.getSource() == button1) {
            new Teacher();
        }
        if (e.getSource() == button2) {
            new OtherEmployee();
        }
        if (e.getSource() == button3) {
            new Enrollment(null);
        }
        if (e.getSource() == button4) {
            new Academic(null);
        }
        if (e.getSource() == button5) {
            new Fee(null);
        }
        // if (e.getSource() == button6) {
        //     new Fee(null);
        // }
        if (e.getSource() == b7) {
            new TeacherSalaryStructure(null);
        }
        if (e.getSource() == b8) {
            new TeacherSalaryDetails(null);
        }
        // if (e.getSource() == b9) {
        //     new Fee(null);
        // }
        
        if (e.getSource() == b10) {
            new EmployeeSalaryStructure(null);
        }
        if (e.getSource() == b11) {
            new EmployeeSalaryDetails(null);
        }
        // if (e.getSource() == b12) {
        //     new Fee(null);
        // }
    }
}

class Student extends PlaceholderTextField implements ActionListener{
    JButton back;
    String placeholder;

    Student(String placeholder) {
        super(placeholder);

        // create second frame
        JFrame frame1 = new JFrame();

        // create label and set its properties
        JLabel label1 = new JLabel();
        label1.setHorizontalAlignment(JLabel.CENTER);
        label1.setSize(1250, 100);
        label1.setText("STUDENT  REGISTRATION  FORM ");
        label1.setFont(new Font("Serif", Font.BOLD, 50));

        JLabel lab1 = new JLabel("Student ID :");
        lab1.setFont(new Font("Serif", Font.PLAIN, 25));
        lab1.setBounds(70, 160, 250, 30);

        JLabel lab2 = new JLabel("Student Name :");
        lab2.setFont(new Font("Serif", Font.PLAIN, 25));
        lab2.setBounds(70, 200, 250, 30);

        JLabel lab3 = new JLabel("Father Name :");
        lab3.setFont(new Font("Serif", Font.PLAIN, 25));
        lab3.setBounds(70, 240, 250, 30);

        JLabel lab4 = new JLabel("Mother Name :");
        lab4.setFont(new Font("Serif", Font.PLAIN, 25));
        lab4.setBounds(70, 280, 250, 30);

        JLabel lab5 = new JLabel("Date Of Birth :");
        lab5.setFont(new Font("Serif", Font.PLAIN, 25));
        lab5.setBounds(70, 320, 250, 30);

        JLabel lab6 = new JLabel("Gender :");
        lab6.setFont(new Font("Serif", Font.PLAIN, 25));
        lab6.setBounds(70, 360, 250, 30);

        JLabel lab7 = new JLabel("Mobile Number1 :");
        lab7.setFont(new Font("Serif", Font.PLAIN, 25));
        lab7.setBounds(70, 400, 250, 30);

        JLabel lab8 = new JLabel("Mobile Number2 :");
        lab8.setFont(new Font("Serif", Font.PLAIN, 25));
        lab8.setBounds(70, 440, 250, 30);

        JLabel lab9 = new JLabel("Registration Date :");
        lab9.setFont(new Font("Serif", Font.PLAIN, 25));
        lab9.setBounds(70, 480, 250, 30);

        JLabel lab10 = new JLabel("Address :");
        lab10.setFont(new Font("Serif", Font.PLAIN, 25));
        lab10.setBounds(70, 520, 250, 30);

        JLabel lab11 = new JLabel("Student's Aaadhar NO :");
        lab11.setFont(new Font("Serif", Font.PLAIN, 25));
        lab11.setBounds(700, 160, 250, 30);

        JLabel lab12 = new JLabel("Father's Aadhaar NO :");
        lab12.setFont(new Font("Serif", Font.PLAIN, 25));
        lab12.setBounds(700, 200, 250, 30);

        JLabel lab13 = new JLabel("Mother's Aadhaar NO :");
        lab13.setFont(new Font("Serif", Font.PLAIN, 25));
        lab13.setBounds(700, 240, 250, 30);

        JLabel lab14 = new JLabel("Family ID :");
        lab14.setFont(new Font("Serif", Font.PLAIN, 25));
        lab14.setBounds(700, 280, 250, 30);

        JLabel lab15 = new JLabel("Category :");
        lab15.setFont(new Font("Serif", Font.PLAIN, 25));
        lab15.setBounds(700, 320, 250, 30);

        JLabel lab16 = new JLabel("Student's Photo :");
        lab16.setFont(new Font("Serif", Font.PLAIN, 25));
        lab16.setBounds(700, 360, 250, 30);

        // create TextField and set its properties

        JTextField text1 = new JTextField();
        text1.setFont(new Font("Serif", Font.PLAIN, 25));
        text1.setBounds(300, 165, 300, 30);

        JTextField text2 = new JTextField();
        text2.setFont(new Font("Serif", Font.PLAIN, 25));
        text2.setBounds(300, 205, 300, 30);

        JTextField text3 = new JTextField();
        text3.setFont(new Font("Serif", Font.PLAIN, 25));
        text3.setBounds(300, 245, 300, 30);

        JTextField text4 = new JTextField();
        text4.setFont(new Font("Serif", Font.PLAIN, 25));
        text4.setBounds(300, 285, 300, 30);

        PlaceholderTextField text5 = new PlaceholderTextField("YYYY-MM-DD");
        text5.setFont(new Font("Serif", Font.PLAIN, 25));
        text5.setBounds(300, 325, 300, 30);

        // ComboBox for gender
        String gender[] = { "Male", "Female", "Other" };
        JComboBox<String> ch1 = new JComboBox<>(gender);
        ch1.setBounds(300, 365, 300, 30);

        JTextField text7 = new JTextField();
        text7.setFont(new Font("Serif", Font.PLAIN, 25));
        text7.setBounds(300, 405, 300, 30);

        JTextField text8 = new JTextField();
        text8.setFont(new Font("Serif", Font.PLAIN, 25));
        text8.setBounds(300, 445, 300, 30);

        PlaceholderTextField text9 = new PlaceholderTextField("YYYY-MM-DD");
        text9.setFont(new Font("Serif", Font.PLAIN, 25));
        text9.setBounds(300, 485, 300, 30);

        JTextField text10 = new JTextField();
        text10.setFont(new Font("Serif", Font.PLAIN, 25));
        text10.setBounds(300, 525, 300, 30);

        JTextField text11 = new JTextField();
        text11.setFont(new Font("Serif", Font.PLAIN, 25));
        text11.setBounds(950, 165, 300, 30);

        JTextField text12 = new JTextField();
        text12.setFont(new Font("Serif", Font.PLAIN, 25));
        text12.setBounds(950, 205, 300, 30);

        JTextField text13 = new JTextField();
        text13.setFont(new Font("Serif", Font.PLAIN, 25));
        text13.setBounds(950, 245, 300, 30);

        JTextField text14 = new JTextField();
        text14.setFont(new Font("Serif", Font.PLAIN, 25));
        text14.setBounds(950, 285, 300, 30);

        // ComboBox for category
        String category[] = { "General", "OBC", "SC/ST" };
        JComboBox<String> ch2 = new JComboBox<>(category);
        ch2.setBounds(950, 325, 300, 30);

        // create buttons for submit and clear

        JButton sub = new JButton(" SUBMIT ");
        sub.setBounds(400, 600, 200, 30);

        JButton clear = new JButton(" CLEAR ");
        clear.setBounds(650, 600, 200, 30);

        JButton photo = new JButton("Upload Photo");
        photo.setBounds(950, 365, 300, 30);

        back = new JButton("Home");
        back.setBounds(30,30,100,30);

        // Here add label in frame
        frame1.add(label1);
        frame1.add(lab1);
        frame1.add(lab2);
        frame1.add(lab3);
        frame1.add(lab4);
        frame1.add(lab5);
        frame1.add(lab6);
        frame1.add(lab7);
        frame1.add(lab8);
        frame1.add(lab9);
        frame1.add(lab10);
        frame1.add(lab11);
        frame1.add(lab12);
        frame1.add(lab13);
        frame1.add(lab14);
        frame1.add(lab15);
        frame1.add(lab16);

        // here add textfield and choice in frame

        frame1.add(text1);
        frame1.add(text2);
        frame1.add(text3);
        frame1.add(text4);
        frame1.add(text5);
        frame1.add(ch1);
        frame1.add(text7);
        frame1.add(text8);
        frame1.add(text9);
        frame1.add(text10);
        frame1.add(text11);
        frame1.add(text12);
        frame1.add(text13);
        frame1.add(text14);
        frame1.add(ch2);

        // here add button to frame
        frame1.add(sub);
        frame1.add(clear);
        frame1.add(photo);
        frame1.add(back);

        // set the properties of frame
        frame1.setSize(1500, 1500);
        frame1.setLayout(null);
        frame1.getContentPane().setBackground(Color.YELLOW);
        frame1.setVisible(true);



        // Register the back button with EventListener
        back.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()== back){
            new First();
        }
    }



}

class Enrollment extends PlaceholderTextField implements ActionListener{
    JButton back;
    String placeholder;
    Enrollment(String placeholder) {
        super(placeholder);
        JFrame frame = new JFrame();

        // create label and set its properties
        JLabel label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(1250, 100);
        label.setText("ENROLLMENT DETAILS");
        label.setFont(new Font("Serif", Font.BOLD, 50));

        JLabel lab1 = new JLabel("Student ID :");
        lab1.setFont(new Font("Serif", Font.PLAIN, 25));
        lab1.setBounds(150, 160, 250, 30);

        JLabel lab2 = new JLabel("Student Name :");
        lab2.setFont(new Font("Serif", Font.PLAIN, 25));
        lab2.setBounds(150, 200, 250, 30);

        JLabel lab3 = new JLabel("Enrollment NO :");
        lab3.setFont(new Font("Serif", Font.PLAIN, 25));
        lab3.setBounds(150, 240, 250, 30);

        JLabel lab4 = new JLabel("Class :");
        lab4.setFont(new Font("Serif", Font.PLAIN, 25));
        lab4.setBounds(150, 280, 250, 30);

        // Here add label in frame
        frame.add(label);

        frame.add(lab1);
        frame.add(lab2);
        frame.add(lab3);
        frame.add(lab4);

        // create TextField and set its properties

        JTextField text1 = new JTextField();
        text1.setFont(new Font("Serif", Font.PLAIN, 25));
        text1.setBounds(450, 165, 300, 30);

        JTextField text2 = new JTextField();
        text2.setFont(new Font("Serif", Font.PLAIN, 25));
        text2.setBounds(450, 205, 300, 30);

        JTextField text3 = new JTextField();
        text3.setFont(new Font("Serif", Font.PLAIN, 25));
        text3.setBounds(450, 245, 300, 30);

        PlaceholderTextField text4 = new PlaceholderTextField("eg : 5th" );
        text4.setFont(new Font("Serif", Font.PLAIN, 25));
        text4.setBounds(450, 285, 300, 30);


        // create Buttons and set its properties
        JButton sub = new JButton(" SUBMIT ");
        sub.setBounds(400, 600, 200, 30);


        JButton clear = new JButton(" CLEAR ");
        clear.setBounds(650, 600, 200, 30);


        back = new JButton("Home");
        back.setBounds(30,30,100,30);

        // here add textfield to frame
        frame.add(text1);
        frame.add(text2);
        frame.add(text3);
        frame.add(text4);

        // here add button to frame
        frame.add(sub);
        frame.add(clear);
        frame.add(back);

        // set the properties of frame
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.YELLOW);
        frame.setVisible(true);


        // Register the back button with the event Listener
        back.addActionListener(this);

    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()== back){
            new First();
        }
    }
}

class Academic extends PlaceholderTextField implements ActionListener{
    JButton back;
    String placeholder;
    Academic(String placeholder) {

        super(placeholder);
        JFrame frame = new JFrame();

        // create label and set its properties
        JLabel label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(1250, 100);
        label.setText("ACADEMIC DETAILS");
        label.setFont(new Font("Serif", Font.BOLD, 50));

        JLabel lab1 = new JLabel("Student ID :");
        lab1.setFont(new Font("Serif", Font.PLAIN, 25));
        lab1.setBounds(150, 160, 250, 30);

        JLabel lab2 = new JLabel("Student Name :");
        lab2.setFont(new Font("Serif", Font.PLAIN, 25));
        lab2.setBounds(150, 200, 250, 30);

        JLabel lab3 = new JLabel("Class :");
        lab3.setFont(new Font("Serif", Font.PLAIN, 25));
        lab3.setBounds(150, 240, 250, 30);

        JLabel lab4 = new JLabel("Subject :");
        lab4.setFont(new Font("Serif", Font.PLAIN, 25));
        lab4.setBounds(150, 280, 250, 30);


        JLabel lab5 = new JLabel("Year :");
        lab5.setFont(new Font("Serif", Font.PLAIN, 25));
        lab5.setBounds(150, 320, 250, 30);

        JLabel lab6 = new JLabel("Fee :");
        lab6.setFont(new Font("Serif", Font.PLAIN, 25));
        lab6.setBounds(150, 360, 250, 30);

        // Here add label in frame
        frame.add(label);

        frame.add(lab1);
        frame.add(lab2);
        frame.add(lab3);
        frame.add(lab4);
        frame.add(lab5);
        frame.add(lab6);

        // create TextField and set its properties

        JTextField text1 = new JTextField();
        text1.setFont(new Font("Serif", Font.PLAIN, 25));
        text1.setBounds(450, 165, 300, 30);

        JTextField text2 = new JTextField();
        text2.setFont(new Font("Serif", Font.PLAIN, 25));
        text2.setBounds(450, 205, 300, 30);



        PlaceholderTextField text3 = new PlaceholderTextField("eg:5th");
        text3.setFont(new Font("Serif", Font.PLAIN, 25));
        text3.setBounds(450, 245, 300, 30);

        PlaceholderTextField text4 = new PlaceholderTextField("eg : Math,English,Science");
        text4.setFont(new Font("Serif", Font.PLAIN, 25));
        text4.setBounds(450, 285, 300, 30);


        JTextField text5 = new JTextField();
        text5.setFont(new Font("Serif", Font.PLAIN, 25));
        text5.setBounds(450, 325, 300, 30);

        JTextField text6 = new JTextField();
        text6.setFont(new Font("Serif", Font.PLAIN, 25));
        text6.setBounds(450, 365, 300, 30);

        
        // add submit and clear button

        JButton sub = new JButton(" SUBMIT ");
        sub.setBounds(400, 600, 200, 30);

        JButton clear = new JButton(" CLEAR ");
        clear.setBounds(650, 600, 200, 30);

        back = new JButton("Home");
        back.setBounds(30,30,100,30);

        // here add textfield to frame
        frame.add(text1);
        frame.add(text2);
        frame.add(text3);
        frame.add(text4);
        frame.add(text5);
        frame.add(text6);

        // here add button to frame
        frame.add(sub);
        frame.add(clear);
        frame.add(back);

        // set the properties of frame
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.YELLOW);
        frame.setVisible(true);


        // Register back component with event Listener
        back.addActionListener(this);
    }


    public void actionPerformed(ActionEvent e ){
        if(e.getSource()== back){
            new First();
        }
    }
}

class Fee extends PlaceholderTextField implements ActionListener {
    JButton back;

    String placeholder;
    Fee(String placeholder) {
        super(placeholder);
        JFrame frame = new JFrame();

        // create label and set its properties
        JLabel label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(1250, 100);
        label.setText("FEE DETAILS");
        label.setFont(new Font("Serif", Font.BOLD, 50));

        JLabel lab1 = new JLabel("Student ID :");
        lab1.setFont(new Font("Serif", Font.PLAIN, 25));
        lab1.setBounds(150, 160, 250, 30);

        JLabel lab2 = new JLabel("Student Name :");
        lab2.setFont(new Font("Serif", Font.PLAIN, 25));
        lab2.setBounds(150, 200, 250, 30);

        JLabel lab3 = new JLabel("Class:");
        lab3.setFont(new Font("Serif", Font.PLAIN, 25));
        lab3.setBounds(150, 240, 250, 30);

        JLabel lab4 = new JLabel("Paid Fee :");
        lab4.setFont(new Font("Serif", Font.PLAIN, 25));
        lab4.setBounds(150, 280, 250, 30);

        JLabel lab5 = new JLabel("Balance :");
        lab5.setFont(new Font("Serif", Font.PLAIN, 25));
        lab5.setBounds(150, 320, 250, 30);

        // Here add label in frame
        frame.add(label);

        frame.add(lab1);
        frame.add(lab2);
        frame.add(lab3);
        frame.add(lab4);
        frame.add(lab5);

        // create TextField and set its properties

        JTextField text1 = new JTextField();
        text1.setFont(new Font("Serif", Font.PLAIN, 25));
        text1.setBounds(450, 165, 300, 30);

        JTextField text2 = new JTextField();
        text2.setFont(new Font("Serif", Font.PLAIN, 25));
        text2.setBounds(450, 205, 300, 30);

        PlaceholderTextField text3 = new PlaceholderTextField("eg : 5th");
        text3.setFont(new Font("Serif", Font.PLAIN, 25));
        text3.setBounds(450, 245, 300, 30);

        JTextField text4 = new JTextField();
        text4.setFont(new Font("Serif", Font.PLAIN, 25));
        text4.setBounds(450, 285, 300, 30);

        JTextField text5 = new JTextField();
        text5.setFont(new Font("Serif", Font.PLAIN, 25));
        text5.setBounds(450, 325, 300, 30);



        // create button and set its properties
        JButton sub = new JButton(" SUBMIT ");
        sub.setBounds(400, 600, 200, 30);

        JButton clear = new JButton(" CLEAR ");
        clear.setBounds(650, 600, 200, 30);

        back = new JButton("Home");
        back.setBounds(30,30,100,30);

        // here add textfield to frame
        frame.add(text1);
        frame.add(text2);
        frame.add(text3);
        frame.add(text4);
        frame.add(text5);

        // here add button to frame
        frame.add(sub);
        frame.add(clear);
        frame.add(back);

        // set the properties of frame
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.YELLOW);
        frame.setVisible(true);


        // Register the back button with event Listener
        back.addActionListener(this);
    }

    // Event handling
    public void actionPerformed(ActionEvent e){
        if(e.getSource()== back){
            new First();
        }
    }
}

class Teacher implements ActionListener{

    JButton back;
    Teacher() {

        // create a frame
        JFrame frame2 = new JFrame();

        // create label and set its properties
        JLabel label2 = new JLabel();
        label2.setHorizontalAlignment(JLabel.CENTER);
        label2.setSize(1250, 100);
        label2.setText("TEACHER  REGISTRATION  FORM");
        label2.setFont(new Font("Serif", Font.BOLD, 50));

        JLabel lab1 = new JLabel("Teacher ID :");
        lab1.setFont(new Font("Serif", Font.PLAIN, 25));
        lab1.setBounds(70, 160, 250, 30);

        JLabel lab2 = new JLabel("Teacher Name :");
        lab2.setFont(new Font("Serif", Font.PLAIN, 25));
        lab2.setBounds(70, 200, 250, 30);

        JLabel lab3 = new JLabel("Father Name :");
        lab3.setFont(new Font("Serif", Font.PLAIN, 25));
        lab3.setBounds(70, 240, 250, 30);

        JLabel lab4 = new JLabel("Mother Name :");
        lab4.setFont(new Font("Serif", Font.PLAIN, 25));
        lab4.setBounds(70, 280, 250, 30);

        JLabel lab5 = new JLabel("Date Of Birth :");
        lab5.setFont(new Font("Serif", Font.PLAIN, 25));
        lab5.setBounds(70, 320, 250, 30);

        JLabel lab6 = new JLabel("Gender :");
        lab6.setFont(new Font("Serif", Font.PLAIN, 25));
        lab6.setBounds(70, 360, 250, 30);

        JLabel lab7 = new JLabel("Mobile_Number1 :");
        lab7.setFont(new Font("Serif", Font.PLAIN, 25));
        lab7.setBounds(70, 400, 250, 30);

        JLabel lab8 = new JLabel("Mobile Number2 :");
        lab8.setFont(new Font("Serif", Font.PLAIN, 25));
        lab8.setBounds(70, 440, 250, 30);

        JLabel lab9 = new JLabel("Joining Date :");
        lab9.setFont(new Font("Serif", Font.PLAIN, 25));
        lab9.setBounds(70, 480, 250, 30);

        JLabel lab10 = new JLabel("Address :");
        lab10.setFont(new Font("Serif", Font.PLAIN, 25));
        lab10.setBounds(70, 520, 250, 30);

        JLabel lab11 = new JLabel("Teacher's Aaadhar NO :");
        lab11.setFont(new Font("Serif", Font.PLAIN, 25));
        lab11.setBounds(700, 160, 250, 30);

        JLabel lab12 = new JLabel("Family ID :");
        lab12.setFont(new Font("Serif", Font.PLAIN, 25));
        lab12.setBounds(700, 200, 250, 30);

        JLabel lab13 = new JLabel("Qualification :");
        lab13.setFont(new Font("Serif", Font.PLAIN, 25));
        lab13.setBounds(700, 240, 250, 30);

        JLabel lab14 = new JLabel("Experience :");
        lab14.setFont(new Font("Serif", Font.PLAIN, 25));
        lab14.setBounds(700, 280, 250, 30);

        JLabel lab15 = new JLabel("Account NO :");
        lab15.setFont(new Font("Serif", Font.PLAIN, 25));
        lab15.setBounds(700, 320, 250, 30);

        JLabel lab16 = new JLabel("Teacher's Photo :");
        lab16.setFont(new Font("Serif", Font.PLAIN, 25));
        lab16.setBounds(700, 360, 250, 30);

        // create TextField and set its properties

        JTextField text1 = new JTextField();
        text1.setFont(new Font("Serif", Font.PLAIN, 25));
        text1.setBounds(300, 165, 300, 30);

        JTextField text2 = new JTextField();
        text2.setFont(new Font("Serif", Font.PLAIN, 25));
        text2.setBounds(300, 205, 300, 30);

        JTextField text3 = new JTextField();
        text3.setFont(new Font("Serif", Font.PLAIN, 25));
        text3.setBounds(300, 245, 300, 30);

        JTextField text4 = new JTextField();
        text4.setFont(new Font("Serif", Font.PLAIN, 25));
        text4.setBounds(300, 285, 300, 30);

        PlaceholderTextField text5 = new PlaceholderTextField("YYYY-MM-DD");
        text5.setFont(new Font("Serif", Font.PLAIN, 25));
        text5.setBounds(300, 325, 300, 30);

        // ComboBox for gender
        String gender[] = { "Male", "Female", "Other" };
        JComboBox<String> ch1 = new JComboBox<>(gender);
        ch1.setBounds(300, 365, 300, 30);

        JTextField text7 = new JTextField();
        text7.setFont(new Font("Serif", Font.PLAIN, 25));
        text7.setBounds(300, 405, 300, 30);

        JTextField text8 = new JTextField();
        text8.setFont(new Font("Serif", Font.PLAIN, 25));
        text8.setBounds(300, 445, 300, 30);

        PlaceholderTextField text9 = new PlaceholderTextField("YYYY-MM-DD");
        text9.setFont(new Font("Serif", Font.PLAIN, 25));
        text9.setBounds(300, 485, 300, 30);

        JTextField text10 = new JTextField();
        text10.setFont(new Font("Serif", Font.PLAIN, 25));
        text10.setBounds(300, 525, 300, 30);

        JTextField text12 = new JTextField();
        text12.setFont(new Font("Serif", Font.PLAIN, 25));
        text12.setBounds(950, 205, 300, 30);

        JTextField text11 = new JTextField();
        text11.setFont(new Font("Serif", Font.PLAIN, 25));
        text11.setBounds(950, 165, 300, 30);

        JTextField text13 = new JTextField();
        text13.setFont(new Font("Serif", Font.PLAIN, 25));
        text13.setBounds(950, 245, 300, 30);

        JTextField text14 = new JTextField();
        text14.setFont(new Font("Serif", Font.PLAIN, 25));
        text14.setBounds(950, 285, 300, 30);

        JTextField text15 = new JTextField();
        text15.setFont(new Font("Serif", Font.PLAIN, 25));
        text15.setBounds(950, 325, 300, 30);

        // Here add label in frame
        frame2.add(label2);
        frame2.add(lab1);
        frame2.add(lab2);
        frame2.add(lab3);
        frame2.add(lab4);
        frame2.add(lab5);
        frame2.add(lab6);
        frame2.add(lab7);
        frame2.add(lab8);
        frame2.add(lab9);
        frame2.add(lab10);
        frame2.add(lab11);
        frame2.add(lab12);
        frame2.add(lab13);
        frame2.add(lab14);
        frame2.add(lab15);
        frame2.add(lab16);

        // here add textField to frame

        frame2.add(text1);
        frame2.add(text2);
        frame2.add(text3);
        frame2.add(text4);
        frame2.add(text5);
        frame2.add(ch1);
        frame2.add(text7);
        frame2.add(text8);
        frame2.add(text9);
        frame2.add(text10);
        frame2.add(text11);
        frame2.add(text12);
        frame2.add(text13);
        frame2.add(text14);
        frame2.add(text15);

        // create buttons for submit and clear

        JButton sub = new JButton(" SUBMIT ");
        sub.setBounds(400, 600, 200, 30);

        JButton clear = new JButton(" CLEAR ");
        clear.setBounds(650, 600, 200, 30);

        JButton photo = new JButton("Upload Photo");
        photo.setBounds(950, 365, 300, 30);


        back = new JButton("Home");
        back.setBounds(30,30,100,30);


        // here add button to frame
        frame2.add(sub);
        frame2.add(clear);
        frame2.add(photo);
        frame2.add(back);

        // set the properties of frame
        frame2.setSize(500, 500);
        frame2.setLayout(null);
        frame2.getContentPane().setBackground(Color.YELLOW);
        frame2.setVisible(true);


        // Register the  button component with frame
        back.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()== back){
            new First();
        }
    }
}

class TeacherSalaryStructure extends PlaceholderTextField implements ActionListener{
    JButton back;
    String placeholder;
    TeacherSalaryStructure(String placeholder) {

        super(placeholder);
        JFrame frame = new JFrame();

        // create label and set its properties
        JLabel label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(1250, 100);
        label.setText("SALARY STRUCTURE");
        label.setFont(new Font("Serif", Font.BOLD, 50));

        JLabel lab1 = new JLabel("Teacher ID :");
        lab1.setFont(new Font("Serif", Font.PLAIN, 25));
        lab1.setBounds(150, 160, 250, 30);

        JLabel lab2 = new JLabel("Teacher Name :");
        lab2.setFont(new Font("Serif", Font.PLAIN, 25));
        lab2.setBounds(150, 200, 250, 30);

        JLabel lab3 = new JLabel("Salary :");
        lab3.setFont(new Font("Serif", Font.PLAIN, 25));
        lab3.setBounds(150, 240, 250, 30);

        JLabel lab4 = new JLabel("Month :");
        lab4.setFont(new Font("Serif", Font.PLAIN, 25));
        lab4.setBounds(150, 280, 250, 30);


        JLabel lab5 = new JLabel("Year :");
        lab5.setFont(new Font("Serif", Font.PLAIN, 25));
        lab5.setBounds(150, 320, 250, 30);

       

        // Here add label in frame
        frame.add(label);

        frame.add(lab1);
        frame.add(lab2);
        frame.add(lab3);
        frame.add(lab4);
        frame.add(lab5);

        // create TextField and set its properties

        JTextField text1 = new JTextField();
        text1.setFont(new Font("Serif", Font.PLAIN, 25));
        text1.setBounds(450, 165, 300, 30);

        JTextField text2 = new JTextField();
        text2.setFont(new Font("Serif", Font.PLAIN, 25));
        text2.setBounds(450, 205, 300, 30);



        JTextField text3 = new JTextField();
        text3.setFont(new Font("Serif", Font.PLAIN, 25));
        text3.setBounds(450, 245, 300, 30);

        PlaceholderTextField text4 = new PlaceholderTextField("eg : January");
        text4.setFont(new Font("Serif", Font.PLAIN, 25));
        text4.setBounds(450, 285, 300, 30);


        JTextField text5 = new JTextField();
        text5.setFont(new Font("Serif", Font.PLAIN, 25));
        text5.setBounds(450, 325, 300, 30);

        
        // add submit and clear button

        JButton sub = new JButton(" SUBMIT ");
        sub.setBounds(400, 600, 200, 30);

        JButton clear = new JButton(" CLEAR ");
        clear.setBounds(650, 600, 200, 30);


        back = new JButton("Home");
        back.setBounds(30,30,100,30);

        // here add textfield to frame
        frame.add(text1);
        frame.add(text2);
        frame.add(text3);
        frame.add(text4);
        frame.add(text5);

        // here add button to frame
        frame.add(sub);
        frame.add(clear);
        frame.add(back);


        // set the properties of frame
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.YELLOW);
        frame.setVisible(true);


        // Register the component with EventListener
        back.addActionListener(this);
    }

    //Event handling
    public void actionPerformed(ActionEvent e){
        if(e.getSource()== back){
            new First();
        }
    }
}

class TeacherSalaryDetails extends PlaceholderTextField implements ActionListener{
    JButton back;
    String placeholder;
    TeacherSalaryDetails(String placeholder) {

        super(placeholder);
        JFrame frame = new JFrame();

        // create label and set its properties
        JLabel label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(1250, 100);
        label.setText("SALARY DETAILS");
        label.setFont(new Font("Serif", Font.BOLD, 50));

        JLabel lab1 = new JLabel("Teacher ID :");
        lab1.setFont(new Font("Serif", Font.PLAIN, 25));
        lab1.setBounds(150, 160, 250, 30);

        JLabel lab2 = new JLabel("Teacher Name :");
        lab2.setFont(new Font("Serif", Font.PLAIN, 25));
        lab2.setBounds(150, 200, 250, 30);

        JLabel lab3 = new JLabel("Salary Paid :");
        lab3.setFont(new Font("Serif", Font.PLAIN, 25));
        lab3.setBounds(150, 240, 250, 30);

        JLabel lab4 = new JLabel("Month :");
        lab4.setFont(new Font("Serif", Font.PLAIN, 25));
        lab4.setBounds(150, 280, 250, 30);


        JLabel lab5 = new JLabel("Year :");
        lab5.setFont(new Font("Serif", Font.PLAIN, 25));
        lab5.setBounds(150, 320, 250, 30);


        // Here add label in frame
        frame.add(label);

        frame.add(lab1);
        frame.add(lab2);
        frame.add(lab3);
        frame.add(lab4);
        frame.add(lab5);

        // create TextField and set its properties

        JTextField text1 = new JTextField();
        text1.setFont(new Font("Serif", Font.PLAIN, 25));
        text1.setBounds(450, 165, 300, 30);

        JTextField text2 = new JTextField();
        text2.setFont(new Font("Serif", Font.PLAIN, 25));
        text2.setBounds(450, 205, 300, 30);



        JTextField text3 = new JTextField();
        text3.setFont(new Font("Serif", Font.PLAIN, 25));
        text3.setBounds(450, 245, 300, 30);

        PlaceholderTextField text4 = new PlaceholderTextField("eg : January");
        text4.setFont(new Font("Serif", Font.PLAIN, 25));
        text4.setBounds(450, 285, 300, 30);


        JTextField text5 = new JTextField();
        text5.setFont(new Font("Serif", Font.PLAIN, 25));
        text5.setBounds(450, 325, 300, 30);

        
        // add submit and clear button

        JButton sub = new JButton(" SUBMIT ");
        sub.setBounds(400, 600, 200, 30);

        JButton clear = new JButton(" CLEAR ");
        clear.setBounds(650, 600, 200, 30);

        back = new JButton("Home");
        back.setBounds(30,30,100,30);

        // here add textfield to frame
        frame.add(text1);
        frame.add(text2);
        frame.add(text3);
        frame.add(text4);
        frame.add(text5);

        // here add button to frame
        frame.add(sub);
        frame.add(clear);
        frame.add(back);

        // set the properties of frame
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.YELLOW);
        frame.setVisible(true);

        // Register the button with EventListener
        back.addActionListener(this);
    }

    // Event handlling
    public void actionPerformed(ActionEvent e){
        if(e.getSource()== back){
            new First();
        }
    }
}


class OtherEmployee implements ActionListener{
    JButton back;
    OtherEmployee() {
        JFrame frame3 = new JFrame();

        JLabel label3 = new JLabel();
        label3.setHorizontalAlignment(JLabel.CENTER);
        label3.setSize(1250, 100);
        label3.setText("EMPLOYEE  REGISTRATION  FORM ");
        label3.setFont(new Font("Serif", Font.BOLD, 50));

        JLabel lab1 = new JLabel("Employee ID :");
        lab1.setFont(new Font("Serif", Font.PLAIN, 25));
        lab1.setBounds(70, 160, 250, 30);

        JLabel lab2 = new JLabel("Employee Name :");
        lab2.setFont(new Font("Serif", Font.PLAIN, 25));
        lab2.setBounds(70, 200, 250, 30);

        JLabel lab3 = new JLabel("Father Name :");
        lab3.setFont(new Font("Serif", Font.PLAIN, 25));
        lab3.setBounds(70, 240, 250, 30);

        JLabel lab4 = new JLabel("Mother_Name :");
        lab4.setFont(new Font("Serif", Font.PLAIN, 25));
        lab4.setBounds(70, 280, 250, 30);

        JLabel lab5 = new JLabel("Date Of Birth :");
        lab5.setFont(new Font("Serif", Font.PLAIN, 25));
        lab5.setBounds(70, 320, 250, 30);

        JLabel lab6 = new JLabel("Gender :");
        lab6.setFont(new Font("Serif", Font.PLAIN, 25));
        lab6.setBounds(70, 360, 250, 30);

        JLabel lab7 = new JLabel("Mobile Number1 :");
        lab7.setFont(new Font("Serif", Font.PLAIN, 25));
        lab7.setBounds(70, 400, 250, 30);

        JLabel lab8 = new JLabel("Mobile Number2 :");
        lab8.setFont(new Font("Serif", Font.PLAIN, 25));
        lab8.setBounds(70, 440, 250, 30);

        JLabel lab9 = new JLabel("Joining Date :");
        lab9.setFont(new Font("Serif", Font.PLAIN, 25));
        lab9.setBounds(70, 480, 250, 30);

        JLabel lab10 = new JLabel("Address :");
        lab10.setFont(new Font("Serif", Font.PLAIN, 25));
        lab10.setBounds(70, 520, 250, 30);

        JLabel lab11 = new JLabel("Employee's Aaadhar NO:");
        lab11.setFont(new Font("Serif", Font.PLAIN, 25));
        lab11.setBounds(700, 160, 258, 30);

        JLabel lab12 = new JLabel("Family ID :");
        lab12.setFont(new Font("Serif", Font.PLAIN, 25));
        lab12.setBounds(700, 200, 250, 30);

        JLabel lab13 = new JLabel("Qualification :");
        lab13.setFont(new Font("Serif", Font.PLAIN, 25));
        lab13.setBounds(700, 240, 250, 30);

        JLabel lab14 = new JLabel("Job :");
        lab14.setFont(new Font("Serif", Font.PLAIN, 25));
        lab14.setBounds(700, 280, 250, 30);

        JLabel lab15 = new JLabel("Account NO :");
        lab15.setFont(new Font("Serif", Font.PLAIN, 25));
        lab15.setBounds(700, 320, 250, 30);

        JLabel lab16 = new JLabel("Employee's Photo :");
        lab16.setFont(new Font("Serif", Font.PLAIN, 25));
        lab16.setBounds(700, 360, 250, 30);

        // create TextField and set its properties

        JTextField text1 = new JTextField();
        text1.setFont(new Font("Serif", Font.PLAIN, 25));
        text1.setBounds(300, 165, 300, 30);

        JTextField text2 = new JTextField();
        text2.setFont(new Font("Serif", Font.PLAIN, 25));
        text2.setBounds(300, 205, 300, 30);

        JTextField text3 = new JTextField();
        text3.setFont(new Font("Serif", Font.PLAIN, 25));
        text3.setBounds(300, 245, 300, 30);

        JTextField text4 = new JTextField();
        text4.setFont(new Font("Serif", Font.PLAIN, 25));
        text4.setBounds(300, 285, 300, 30);

        PlaceholderTextField text5 = new PlaceholderTextField("YYYY-MM-DD");
        text5.setFont(new Font("Serif", Font.PLAIN, 25));
        text5.setBounds(300, 325, 300, 30);

        // ComboBox for gender
        String gender[] = { "Male", "Female", "Other" };
        JComboBox<String> ch1 = new JComboBox<>(gender);
        ch1.setBounds(300, 365, 300, 30);

        JTextField text7 = new JTextField();
        text7.setFont(new Font("Serif", Font.PLAIN, 25));
        text7.setBounds(300, 405, 300, 30);

        JTextField text8 = new JTextField();
        text8.setFont(new Font("Serif", Font.PLAIN, 25));
        text8.setBounds(300, 445, 300, 30);

        PlaceholderTextField text9 = new PlaceholderTextField("YYYY-MM-DD");
        text9.setFont(new Font("Serif", Font.PLAIN, 25));
        text9.setBounds(300, 485, 300, 30);

        JTextField text10 = new JTextField();
        text10.setFont(new Font("Serif", Font.PLAIN, 25));
        text10.setBounds(300, 525, 300, 30);

        JTextField text11 = new JTextField();
        text11.setFont(new Font("Serif", Font.PLAIN, 25));
        text11.setBounds(960, 165, 300, 30);

        JTextField text12 = new JTextField();
        text12.setFont(new Font("Serif", Font.PLAIN, 25));
        text12.setBounds(960, 205, 300, 30);

        JTextField text13 = new JTextField();
        text13.setFont(new Font("Serif", Font.PLAIN, 25));
        text13.setBounds(960, 245, 300, 30);

        JTextField text14 = new JTextField();
        text14.setFont(new Font("Serif", Font.PLAIN, 25));
        text14.setBounds(960, 285, 300, 30);

        JTextField text15 = new JTextField();
        text15.setFont(new Font("Serif", Font.PLAIN, 25));
        text15.setBounds(960, 325, 300, 30);

        // Here add label in frame
        frame3.add(label3);
        frame3.add(lab1);
        frame3.add(lab2);
        frame3.add(lab3);
        frame3.add(lab4);
        frame3.add(lab5);
        frame3.add(lab6);
        frame3.add(lab7);
        frame3.add(lab8);
        frame3.add(lab9);
        frame3.add(lab10);
        frame3.add(lab11);
        frame3.add(lab12);
        frame3.add(lab13);
        frame3.add(lab14);
        frame3.add(lab15);
        frame3.add(lab16);

        // here add textField

        frame3.add(text1);
        frame3.add(text2);
        frame3.add(text3);
        frame3.add(text4);
        frame3.add(text5);
        frame3.add(ch1);
        frame3.add(text7);
        frame3.add(text8);
        frame3.add(text9);
        frame3.add(text10);
        frame3.add(text11);
        frame3.add(text12);
        frame3.add(text13);
        frame3.add(text14);
        frame3.add(text15);

        // create buttons for submit and clear

        JButton sub = new JButton(" SUBMIT ");
        sub.setBounds(400, 600, 200, 30);

        JButton clear = new JButton(" CLEAR ");
        clear.setBounds(650, 600, 200, 30);

        JButton photo = new JButton("Upload Photo");
        photo.setBounds(960, 365, 300, 30);

        back = new JButton("Home");
        back.setBounds(30,30,100,30);

        // here add button to frame
        frame3.add(sub);
        frame3.add(clear);
        frame3.add(photo);
        frame3.add(back);

        // set the properties of frame
        frame3.setSize(500, 500);
        frame3.setLayout(null);
        frame3.getContentPane().setBackground(Color.YELLOW);
        frame3.setVisible(true);


        // Register the button with Event listener
        back.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()== back){
            new First();
        }
    }
}



class EmployeeSalaryStructure extends PlaceholderTextField implements ActionListener{
    JButton back;
    String placeholder;
    EmployeeSalaryStructure(String placeholder) {

        super(placeholder);
        JFrame frame = new JFrame();

        // create label and set its properties
        JLabel label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(1250, 100);
        label.setText("SALARY STRUCTURE");
        label.setFont(new Font("Serif", Font.BOLD, 50));

        JLabel lab1 = new JLabel("Employee ID :");
        lab1.setFont(new Font("Serif", Font.PLAIN, 25));
        lab1.setBounds(150, 160, 250, 30);

        JLabel lab2 = new JLabel("Employee Name :");
        lab2.setFont(new Font("Serif", Font.PLAIN, 25));
        lab2.setBounds(150, 200, 250, 30);

        JLabel lab3 = new JLabel("Salary :");
        lab3.setFont(new Font("Serif", Font.PLAIN, 25));
        lab3.setBounds(150, 240, 250, 30);

        JLabel lab4 = new JLabel("Month :");
        lab4.setFont(new Font("Serif", Font.PLAIN, 25));
        lab4.setBounds(150, 280, 250, 30);


        JLabel lab5 = new JLabel("Year :");
        lab5.setFont(new Font("Serif", Font.PLAIN, 25));
        lab5.setBounds(150, 320, 250, 30);

       

        // Here add label in frame
        frame.add(label);

        frame.add(lab1);
        frame.add(lab2);
        frame.add(lab3);
        frame.add(lab4);
        frame.add(lab5);

        // create TextField and set its properties

        JTextField text1 = new JTextField();
        text1.setFont(new Font("Serif", Font.PLAIN, 25));
        text1.setBounds(450, 165, 300, 30);

        JTextField text2 = new JTextField();
        text2.setFont(new Font("Serif", Font.PLAIN, 25));
        text2.setBounds(450, 205, 300, 30);



        JTextField text3 = new JTextField();
        text3.setFont(new Font("Serif", Font.PLAIN, 25));
        text3.setBounds(450, 245, 300, 30);

        PlaceholderTextField text4 = new PlaceholderTextField("eg : January");
        text4.setFont(new Font("Serif", Font.PLAIN, 25));
        text4.setBounds(450, 285, 300, 30);


        JTextField text5 = new JTextField();
        text5.setFont(new Font("Serif", Font.PLAIN, 25));
        text5.setBounds(450, 325, 300, 30);

        
        // add submit and clear button

        JButton sub = new JButton(" SUBMIT ");
        sub.setBounds(400, 600, 200, 30);

        JButton clear = new JButton(" CLEAR ");
        clear.setBounds(650, 600, 200, 30);

        back = new JButton("Home");
        back.setBounds(30,30,100,30);

        // here add textfield to frame
        frame.add(text1);
        frame.add(text2);
        frame.add(text3);
        frame.add(text4);
        frame.add(text5);

        // here add button to frame
        frame.add(sub);
        frame.add(clear);
        frame.add(back);

        // set the properties of frame
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.YELLOW);
        frame.setVisible(true);

        // Register the Button with the Event Listener
        back.addActionListener(this);
    }

    // Event handling
    public void actionPerformed(ActionEvent e){
        if(e.getSource()== back){
            new First();
        }
    }
}




class EmployeeSalaryDetails extends PlaceholderTextField implements ActionListener{

    JButton back;
    String placeholder;

    EmployeeSalaryDetails(String placeholder) {

        super(placeholder);
        JFrame frame = new JFrame();

        // create label and set its properties
        JLabel label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(1250, 100);
        label.setText("SALARY DETAILS");
        label.setFont(new Font("Serif", Font.BOLD, 50));

        JLabel lab1 = new JLabel("Employee ID :");
        lab1.setFont(new Font("Serif", Font.PLAIN, 25));
        lab1.setBounds(150, 160, 250, 30);

        JLabel lab2 = new JLabel("Employee Name :");
        lab2.setFont(new Font("Serif", Font.PLAIN, 25));
        lab2.setBounds(150, 200, 250, 30);

        JLabel lab3 = new JLabel("Salary Paid :");
        lab3.setFont(new Font("Serif", Font.PLAIN, 25));
        lab3.setBounds(150, 240, 250, 30);

        JLabel lab4 = new JLabel("Month :");
        lab4.setFont(new Font("Serif", Font.PLAIN, 25));
        lab4.setBounds(150, 280, 250, 30);


        JLabel lab5 = new JLabel("Year :");
        lab5.setFont(new Font("Serif", Font.PLAIN, 25));
        lab5.setBounds(150, 320, 250, 30);


        // Here add label in frame
        frame.add(label);

        frame.add(lab1);
        frame.add(lab2);
        frame.add(lab3);
        frame.add(lab4);
        frame.add(lab5);

        // create TextField and set its properties

        JTextField text1 = new JTextField();
        text1.setFont(new Font("Serif", Font.PLAIN, 25));
        text1.setBounds(450, 165, 300, 30);

        JTextField text2 = new JTextField();
        text2.setFont(new Font("Serif", Font.PLAIN, 25));
        text2.setBounds(450, 205, 300, 30);



        JTextField text3 = new JTextField();
        text3.setFont(new Font("Serif", Font.PLAIN, 25));
        text3.setBounds(450, 245, 300, 30);

        PlaceholderTextField text4 = new PlaceholderTextField("eg : January");
        text4.setFont(new Font("Serif", Font.PLAIN, 25));
        text4.setBounds(450, 285, 300, 30);


        JTextField text5 = new JTextField();
        text5.setFont(new Font("Serif", Font.PLAIN, 25));
        text5.setBounds(450, 325, 300, 30);

        
        // add submit and clear button

        JButton sub = new JButton(" SUBMIT ");
        sub.setBounds(400, 600, 200, 30);

        JButton clear = new JButton(" CLEAR ");
        clear.setBounds(650, 600, 200, 30);

        back = new JButton("Home");
        back.setBounds(30,30,100,30);

        // here add textfield to frame
        frame.add(text1);
        frame.add(text2);
        frame.add(text3);
        frame.add(text4);
        frame.add(text5);

        // here add button to frame
        frame.add(sub);
        frame.add(clear);
        frame.add(back);

        // set the properties of frame
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.YELLOW);
        frame.setVisible(true);


        // Register the button with event Listener
        back.addActionListener(this);
    }

    // Event handling
    public void actionPerformed(ActionEvent e){
        if(e.getSource()== back){
            new First();
        }
    }
}

public class App {

    public static void main(String[] args) {
        new First();
    }
}
