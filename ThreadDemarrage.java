package projetChat; 
import java.io.*;

public class ThreadDemarrage extends Thread {
	Serveur serveur;

	ThreadDemarrage(int port){
	try{

	serveur = new Serveur(port);}

	catch(IOException ex){ex.printStackTrace();}
	}

	public void run(){
	serveur.go();
	}
}
