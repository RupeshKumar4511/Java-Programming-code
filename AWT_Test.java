// Program 9.) Write a program to display a string in frame window with pink color as background.

import java.awt.*;

public class AWT_Test {

   public AWT_Test(){
   Frame frame = new Frame("This is my Frame");
   
   Label label = new Label("This is my string");
   label.setBounds(50,120,120,40);
   label.setBackground(Color.pink);
   frame.add(label);
     
   
   frame.setSize(400,400);
   frame.setLayout(null);
   frame.setVisible(true);
   frame.setBackground(Color.pink);
   frame.setName("sdjkh");
   }

   public static void main(String[] args) {
    AWT_Test test = new AWT_Test();
   }
}
