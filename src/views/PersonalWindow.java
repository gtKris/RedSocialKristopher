package views;

import java.awt.Color;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.*;




public class PersonalWindow extends JFrame {
	
	
	static ArrayList<usersDates>CreateAnObject = new ArrayList<usersDates>();
	static ArrayList<AllUsersWithDayAndHour>FirstTimeInPope = new ArrayList<AllUsersWithDayAndHour>();
	static ArrayList<String> Repited = new ArrayList<String>();
	static String local;
	


	public PersonalWindow () {
		
		MyWindow();
		 
	}
	
	
	 public void MyWindow() {
		 
		 
		    JOptionPane.showMessageDialog(null, "Welcome to Pope");
		    this.setLayout(null);
		    this.setSize(700,700);
		    this.setTitle("Personal Window");
		    this.setLocationRelativeTo(null);
		    this.setResizable(false);
	
		    
			
			JButton rud = new JButton("RUD");
			rud.setBounds(450, 05, 100, 50);
			
			JButton exit = new JButton("Exit Pope");
			exit.setBounds(350, 80, 100, 50);
			
			JButton RUDPOPS = new JButton("RUDMYpops");
			RUDPOPS.setBounds(0, 100, 150, 50);
			
			JButton newFriends = new JButton("newFriends");
			newFriends.setBounds(0, 150, 150, 50);
			
			JButton ViewRequest = new JButton("ViewRequest");
			ViewRequest.setBounds(0, 200, 150, 50);
			
			JButton ViewMyFriends = new JButton("ViewMyFriends");
			ViewMyFriends.setBounds(0, 250, 150, 50);
			
			
			JButton topTen = new JButton("Users");
			topTen.setBounds(450, 80, 100, 50);
			
			JButton play = new JButton("Create an POP!!");
			play.setBounds(450, 160, 150, 50);
			
			JButton view = new JButton("View POPS!!");
			view.setBounds(500, 320, 150, 50);
			
			JButton coments = new JButton("Coment");
			coments.setBounds(500, 500, 150, 50);
			
			JButton reaction = new JButton("Like or dislike");
			reaction.setBounds(500, 400, 150, 50);
		   
			
			
			JTextArea  pops = new JTextArea();
			pops.setBounds(0, 300,500, 500);
			pops.setEditable(false);
			pops.setLineWrap(true);
		
			
			JLabel ActualPlayer = new JLabel("Actual user real name:"+" "+Register.Names[Login.LocalID]);
			ActualPlayer.setBounds(100, 150, 500, 40);
			
			
			JLabel Actualusername = new JLabel("Actual  username:"+" "+Register.usernames[Login.LocalID]);
			Actualusername.setBounds(100, 50, 400, 40);
	
			 getContentPane().add(ViewRequest);
			 getContentPane().add(reaction);
			 getContentPane().add(pops); 
			 getContentPane().add(Actualusername); 
			 getContentPane().add(coments); 
			 getContentPane().add(topTen); 
			 getContentPane().add(rud); 
			 getContentPane().add(ActualPlayer); 
			 getContentPane().add(play); 
			 getContentPane().add(exit);
			 getContentPane().add(view);
			 getContentPane().add( RUDPOPS);
			 getContentPane().add(newFriends);
			 getContentPane().add(ViewMyFriends);
			 
			
			 this.setVisible(true);
			 
			 
			 AddTo();
			 
			 
			 ViewMyFriends.addActionListener(new java.awt.event.ActionListener() {
		         public void actionPerformed(java.awt.event.ActionEvent e) {
		        	 
		        	 ViewMyFriends x = new ViewMyFriends();
		        	
		        	
		         }
		         
		         
		     });
			 
			 
			 
			 ViewRequest.addActionListener(new java.awt.event.ActionListener() {
		         public void actionPerformed(java.awt.event.ActionEvent e) {
		        	 
		        	 ViewRequest x = new ViewRequest();
		        	
		        	
		         }
		         
		         
		     });
			 view.addActionListener(new java.awt.event.ActionListener() {
		         public void actionPerformed(java.awt.event.ActionEvent e) {
		        	 
		        	 
		        	 ShowPOPS.op0="";
		        	 ShowPOPS x = new ShowPOPS();
		        	 pops.setText( ShowPOPS.post0 [0]);
		        	 JOptionPane.showMessageDialog(Actualusername,ShowPOPS.post0 [0] );
		        	
		         }
		         
		         
		     });
			 
			 newFriends.addActionListener(new java.awt.event.ActionListener() {
		         public void actionPerformed(java.awt.event.ActionEvent e) {
		           findfriendrequest x = new findfriendrequest();
		        	
		         }
		         
		         
		     });
			 

			 rud.addActionListener(new java.awt.event.ActionListener() {
		         public void actionPerformed(java.awt.event.ActionEvent e) {
                     
		        	 
		        	
		        	 RUD x = new RUD();
		        	 dispose();
		        	 
		        	 
		         }
		     });
			 

			 
			 
			 exit.addActionListener(new java.awt.event.ActionListener() {
		         public void actionPerformed(java.awt.event.ActionEvent e) {
                     
		        	 
		        	
		        	 ViewsAllUsers h = new ViewsAllUsers();
		        	 dispose();
		        	 
		        	 
		         }
		     });
			 
			 
			 topTen.addActionListener(new java.awt.event.ActionListener() {
		         public void actionPerformed(java.awt.event.ActionEvent e) {
                     
		        	 
		        	
		        	 JTableUsers x = new JTableUsers();
		        
		        	 
		        	 
		         }
		     });
			 
			 
			 
			 play.addActionListener(new java.awt.event.ActionListener() {
		         public void actionPerformed(java.awt.event.ActionEvent e) {
		             
		        	CreateAnPOP x = new CreateAnPOP();

		            
		        	
		        	 dispose();
		        	 
		        	 
		         }
		     });
			 
			 
			 coments.addActionListener(new java.awt.event.ActionListener() {
		         public void actionPerformed(java.awt.event.ActionEvent e) {
		             
		        	CreateAnComent x = new CreateAnComent();

		            
		        	
		        	 dispose();
		        	 
		        	 
		         }
		     });
			 
			 RUDPOPS.addActionListener(new java.awt.event.ActionListener() {
		         public void actionPerformed(java.awt.event.ActionEvent e) {
		        	 
		        	 RUDPOPS x = new RUDPOPS();
		        	
		        	
		         }
		         
		         
		     });
			 
	           
	}
	 
	 public void AddTo() {
		 
		 String id=String.valueOf(Login.LocalID);
		 String name=Register.Names[Login.LocalID];
		 String username=Register.usernames[Login.LocalID];

		
		 
		 
		 
		
		  
		 
		 if (Repited.contains(username)) {
			
			System.out.println("ya");
		} 
		 else {
			 
			 usersDates data = new usersDates(id, name, username);
			 
				CreateAnObject.add(data);
				FirstTimeinPOPE();
			 
		 } 
			
	
		 
		 Repited.add(username);
		 
		 
		 
	 }
	 
	 public void FirstTimeinPOPE(){
		 
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		
		
		 String id=String.valueOf(Login.LocalID);
		 String name=Register.Names[Login.LocalID];
		 String username=Register.usernames[Login.LocalID];
		 String hour=dtf.format(LocalDateTime.now());
		 
		 
		 
		 if (Repited.contains(username)) {
				
				System.out.println("ya");
			} 
			 else {
				 
				 AllUsersWithDayAndHour obj = new AllUsersWithDayAndHour(id, name, username, hour);
				 FirstTimeInPope.add(obj);
				 
				 
			 } 
				
		
			 
			 Repited.add(username);
		 
	 }
	
	 
	

	 
}
