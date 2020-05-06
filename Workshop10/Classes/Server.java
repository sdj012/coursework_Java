package Classes;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Server{
	
	private static ArrayList<ClientHandler> clients = new ArrayList<>();
	
	private static ExecutorService pool=Executors.newFixedThreadPool(2);
	
	private static String name="";

	public static void main(String[] args) throws IOException {
		
		ServerSocket listener = null;
		 
		listener = new ServerSocket(4000);
		
		while(true) {

	
		System.out.println("Waiting for client connection...");	
		
		Socket client = null;
		
		client = listener.accept();
		
		System.out.println("Connected to client!");
		
		

		PrintWriter out=new PrintWriter(client.getOutputStream(),true);
	
		 
		BufferedReader in=new BufferedReader(new InputStreamReader(client.getInputStream()));
	
		ClientHandler clientThread = null;
		
		
		clientThread = new ClientHandler(client,clients,name);
	
		
		clients.add(clientThread);
		
		pool.execute(clientThread);
		
		
		

		} 
		

		}
	}

	

