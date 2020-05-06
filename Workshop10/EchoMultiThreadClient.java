import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.Scanner;

public class EchoMultiThreadClient {

    public static void main(String[] args) {
    	
    	String name="";
        try (Socket socket = new Socket("localhost", 4000)) {
        	
        	//socket.setSoTimeout(5000);
            BufferedReader echoes = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            PrintWriter stringToEcho = new PrintWriter(socket.getOutputStream(), true);

            Scanner scanner = new Scanner(System.in);
            String echoString;
            String response;
            
//            System.out.println("Enter Name: ");
//            name=scanner.nextLine().toString();

            do {
                System.out.println("Message: ");
                echoString = scanner.nextLine();
                stringToEcho.println(echoString);
       
            } while(!echoString.equals("exit"));
            
       // }catch(SocketTimeoutException e) {
        //	System.out.println("The Socket has been timed out");

        } catch (IOException e) {
            System.out.println("Client Error: " + e.getMessage());

        }
    }
}
