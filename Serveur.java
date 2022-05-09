package projetChat;
import java.io.*;
import java.util.*;
import java.net.*;

public class Serveur {

	ServerSocket srv ;
	MonIHMChat ihm;

	Vector<SClient> liste = new Vector<SClient>();


	public Serveur( int port) throws IOException{

	srv = new ServerSocket(port) ;

	}



	public void go() {
	int i=0;
		while (true) 
		{
			try {
	System.out.println("serveur a démarré");
			//rester en attente des demandes de socket provennat du client
			Socket sck = srv.accept() ;
	                SClient sc = new SClient(sck);

	                ihm.ta1.append(sc.toString());
	                System.out.println("serveur a démarré");
	                
	                liste.add(sc);
			//MonThread tClient = new MonThread(sck);
			//tClient.start();

	        	}
	         catch(Exception e){}
	}}
	public static void main (String[] args)  {
	try {
	Serveur serv = new Serveur(Integer.parseInt(args[0])) ;
	serv.go() ;
	}
	catch(IOException e){

	e.printStackTrace();
	}
	}
}
