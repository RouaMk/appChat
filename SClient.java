package projetChat;
import java.net.*;

public class SClient {

	
	Socket sk;
	int id;

	SClient(Socket sk){this.sk=sk;}


	public void setId(int id){this.id=id;}


	public String toString(){
	return "Nouveau Client" + sk.getInetAddress()+"\n";

	}
	
}
