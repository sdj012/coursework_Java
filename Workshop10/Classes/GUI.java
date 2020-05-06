package Classes;
import java.awt.*;
import java.awt.event.*;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class GUI extends Frame implements ActionListener,Runnable
{
 //Declarations
 Button b;
TextField tf;
 static TextArea ta;
 Socket s;
 PrintWriter pw;
 BufferedReader br;
 Thread th;
 String name;

 
 public GUI(String name)
 {

  Frame f=new Frame(name);//Frame for Client
  f.setLayout(new FlowLayout());//set layout
  f.setBackground(Color.DARK_GRAY);//set background color of the Frame
  b=new Button("Send");//Send Button
  b.addActionListener(this);//Add action listener to send button

  ta=new TextArea(12,20);
  tf=new TextField(15);
  ta.setBackground(Color.GRAY);
  f.add(tf);//Add TextField to the frame
  f.add(b);//Add send Button to the frame
  f.add(ta);//Add TextArea to the frame



  setFont(new Font("Arial",Font.BOLD,20));
  f.setSize(300,300);//set the size
  f.setVisible(true);
  f.setLocation(650,300);//set the location
  f.validate();
  
  this.name=name;
  


 }

 //This method will called after clicking on Send button.
 public void actionPerformed(ActionEvent ae)
 {

  ta.append(name+ ": " + tf.getText() + "\n");//write the value of textfield into PrintWriter
  tf.setText("");//clean the textfield

  
 }

 
 //Thread running as a process in background
 public void run()
 {
  while(true)
  {
   try{
    ta.append(br.readLine() + "\n");//Append to TextArea
   }catch(Exception e) {}
  }
 }
 //Main method
 public static void main(String args[]) throws IOException
 {
  //Instantiate AppClient class
	 
	  
// login.main(args);
  
  
  
  }
 
 public static void project(String msg){
	 
	 ta.append(msg);
	 
 }



  
//  Server server = new Server();
//  server.main(args);
//  
  
 

 
}