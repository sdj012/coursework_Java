package Classes;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client{
	
	private static String name="";
	public static login scrn;
	
	
	public static void main(String[] args) throws IOException {

		 
		 Socket socket = null;
		 
		 
			socket = new Socket ("localhost",4000);

	
		 
		 BufferedReader keyboard=new BufferedReader(new InputStreamReader(System.in));
		
		 PrintWriter out = null;
		 
			out = new PrintWriter(socket.getOutputStream(),true);
	
	
		System.out.println("Name: ");
			
		name=keyboard.readLine().toString();
			
			 
			 ServerConnection serverOut = null;
			 
			serverOut = new ServerConnection(socket);

	
			Thread serverConn = new Thread(serverOut);
			serverConn.start();
		 
		 while(true) {
		
			 System.out.println("Message: ");
			 
			 String msg = null;
			 
			 msg = name+": " + keyboard.readLine();
		
			 
			 if (msg.equals("quit")) break;
			 
			 out.println(msg);

		 }
		 
		  
		socket.close();

		 System.exit(0);
 
	 }
	

		
	}
	



