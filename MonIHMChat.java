package projetChat;
import java.awt.*;

import java.awt.event.*;
import java.io.*;

public class MonIHMChat  implements ActionListener {


	
		Frame f;
		Panel p1,p2;
		Button b1,b2;
		Label l1;
		TextField tf1;
		TextArea ta1;
		Serveur serveur;

		public MonIHMChat(String titre)
		{



		f = new Frame(titre);
		p1 = new Panel();
		p2 = new Panel();
		b1 = new Button("demarrer");
		b2 = new Button("stopper");
		l1 = new Label("Port");
		tf1 = new TextField("2425");
		ta1 = new TextArea("Liste des Clients");

		p1.setLayout(new GridLayout(1,1));
		p1.add(l1);p1.add(tf1);

		p2.add(b1);p2.add(b2);

		f.add(p1, BorderLayout.NORTH);
		f.add(p2, BorderLayout.SOUTH);
		f.add(ta1, BorderLayout.CENTER);

		b1.addActionListener(this);
		b2.addActionListener(this);

		f.pack();
		f.setVisible(true);

		}

		public void actionPerformed(ActionEvent e){
		System.out.println("Ok");

			if (e.getSource()==b1) {

				String sPort = tf1.getText();
				int port = Integer.parseInt(sPort);
			        ThreadDemarrage td = new ThreadDemarrage(port);
		                td.serveur.ihm=this;
		                td.start();
		        
		}
			
		       else { }	

		}

		public static  void main(String [] args){

		MonIHMChat ihm = new MonIHMChat("ChatServer");
		}
		}


