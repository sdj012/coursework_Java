package Classes;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ServerConnection implements Runnable{
	
	private Socket server;
	private BufferedReader in;
	
	
	
	public ServerConnection(Socket s) throws IOException {
		
		this.server= s;
		in =new BufferedReader(new InputStreamReader(this.server.getInputStream()));


	}
	
	@Override 
	public void run() {
		
		try {
	
	
		while(true) {
			
			String serverResponse=in.readLine();
			
					if(serverResponse == null) break; // server is disconnected
			
			System.out.println(serverResponse);
			
			
			} 
		
		}catch (IOException e) {
				
				e.printStackTrace();
		} finally {
				try {
				in.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
			
		}
		
		
	}


