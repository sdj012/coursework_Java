package Classes;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;

public class ClientHandler implements Runnable {
	
	private Socket client;
	private BufferedReader in;
	private PrintWriter out;
	private ArrayList<ClientHandler> clients=new ArrayList<>();
	private String name="";

	
	public ClientHandler(Socket clientSocket,ArrayList<ClientHandler> clients,String name) throws IOException {
		
		this.client=clientSocket;
		this.clients=clients;
		this.name=name;
		
		in=new BufferedReader(new InputStreamReader(client.getInputStream()));
		out=new PrintWriter(client.getOutputStream(),true);
			
	}
	
	@Override
	public void run() {
		
		  
		  login scrn = new login();
		  
	
			while(true) {
				
				String msg = null;
				try {
					msg = in.readLine();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
	
				send(msg.substring(0));
		
			}
			
			
				
	
	}
	
	private void send(String msg) {
		for (ClientHandler aClient: clients) {
			aClient.out.println(msg);
		}
	}

}
