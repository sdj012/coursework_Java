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

public class TesterClass{
	
	private static ArrayList<ClientHandler> clients = new ArrayList<>();
	
	private static ExecutorService pool=Executors.newFixedThreadPool(4);
	
	
	public static void main(String[] args) throws IOException {
		
	Server.main(args);
	Client.main(args);
	Client.main(args);

	}

	
}



