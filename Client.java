package projetChat;
import java.net.*;
import java.io.*;

public class Client {

	
	Socket sck ;
	public Client( String host, int port) throws IOException{
	sck = new Socket(host, port) ;
	}
		public void go() {
		try{
			dialogue(sck.getInputStream(), sck.getOutputStream()) ;
		} catch (IOException exc) { }
		}

	public void stop() {
		try {
	sck.close() ;
	} catch (IOException exc) { }
	}

	public void dialogue(InputStream is,OutputStream os) throws IOException {
		DataInputStream dis = new DataInputStream(is) ;
		System.out.println(dis.readUTF()) ;
		//DataOutputStream dos = new DataOutputStream(os) ;
		//dos.writeUTF("2") ;

	}

	public static void main (String[] args)  {

	try{
		Client cli = new Client( args[0],
		Integer.parseInt(args[1])) ;
	cli.go() ;
	cli.stop() ;
	}
	catch(IOException e)
	{
	e.printStackTrace();
	}
	}
	
}
