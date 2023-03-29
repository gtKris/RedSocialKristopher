package views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ViewsAllUsers extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ViewsAllUsers() {
		
		Views();
		
	}

	public void Views() {
		
		
		JButton Search = new JButton("Search users with ID");
		Search.setBounds(100, 500, 200, 100);
	
	    JButton Viewallusers= new JButton("View all users");
	    Viewallusers.setBounds(400, 500, 200, 100);
	    
	    JButton ViewPops= new JButton("ViewPops");
	    ViewPops.setBounds(250, 100, 200, 100);
	    
	    JButton Register= new JButton("Return to register Window");
	    Register.setBounds(250, 300, 200, 100);
	    
        this.setVisible(true);
		this.setSize(700, 700);
		this.setLayout(null);
		this.setTitle("Pops menu");
		this.setLocationRelativeTo(null);
		this.setLocationRelativeTo(null);
		
		 getContentPane().add(Viewallusers);
		 getContentPane().add(Search);
		 getContentPane().add(ViewPops);
		 getContentPane().add(Register);
		
		 
		 
		 
		 
		 ViewPops.addActionListener(new ActionListener(){
				  @Override
				public void actionPerformed(ActionEvent e) {
				    ViewPOPS x = new ViewPOPS();
				}
				});
			
		 
			Viewallusers.addActionListener(new ActionListener(){
				  @Override
				public void actionPerformed(ActionEvent e) {
					  UsersFirstTimeInPOPE x = new UsersFirstTimeInPOPE();
				}
				});
			
			
			
			Search.addActionListener(new ActionListener(){
				 
				public void actionPerformed(ActionEvent e) {
					  SearchUserWithID x = new SearchUserWithID();
					   dispose();
				}
				});
			
			
			Register.addActionListener(new ActionListener(){
				  @Override
				public void actionPerformed(ActionEvent e) {
					  Register x = new Register();
					   dispose();
				}
				});
	}
	


}
