package projetChat;
import java.net.*;
import java.io.*;

public class MonThread extends Thread {


Socket sck;
MonThread(Socket sck ){this.sck=sck;}

public void run()
{

try{
dialogue(sck.getInputStream(), sck.getOutputStream());
Thread.sleep(100000);

		sck.close() ;
	
	} catch (Exception exc) { }
	
}
public void dialogue(InputStream is, OutputStream os)
throws IOException {
DataOutputStream dos = new DataOutputStream(os) ;
dos.writeUTF ("Hello net World") ;


}
}
