package Classes;
import java.awt.*;
import java.awt.event.*;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class login extends Frame implements ActionListener,Runnable
{

private static String name="";
private Button b;
private TextField tf;
private static GUI gui;
Frame f=new Frame("Login");

 
 public login()
 {

  f.setLayout(new FlowLayout());
  f.setBackground(Color.DARK_GRAY);
  b=new Button("Enter");
  b.addActionListener(this);

  tf=new TextField(15);

  f.add(tf);
  f.add(b);



  setFont(new Font("Arial",Font.BOLD,20));
  f.setSize(200,100);
  f.setVisible(true);
  f.setLocation(650,300);
  f.validate();

  

 }
 

 public void actionPerformed(ActionEvent ae)
 {
  name=tf.getText();
  tf.setText("");
  f.dispose();
  GUI gui = new GUI(name);
  this.gui=gui;
  
 }
 
 public static String returnName() {
	 
	 return name;
	 
 }
 
 public static void project(String msg){
	 
	 gui.project(msg);
	 
 }



 public void run()
 {
  while(true)
  {
   try{

   }catch(Exception e) {}
  }
 }

 public static void main(String args[]) throws IOException
 {

  
  login scrn = new login();
  
  scrn.tf.setText("Enter Your Name: ");


 }
}