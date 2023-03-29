package views;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.*;




public class ViewPOPS extends JFrame {
	



	public ViewPOPS () {
		
		MyWindow();
		 
	}
	
	
	 public void MyWindow() {
		 
		 
		    JOptionPane.showMessageDialog(null, "Welcome to Pope");
		    this.setLayout(null);
		    this.setSize(700,700);
		    this.setTitle("Personal Window");
		    this.setLocationRelativeTo(null);
		    this.setResizable(false);
	
			
	
			
			JButton view = new JButton("View POPS!!");
			view.setBounds(500, 320, 150, 50);
			
		   
			JTextArea  demo = new JTextArea();
			demo.setBounds(0, 0,500, 500);
			demo.setEditable(false);
			demo.setLineWrap(true);
			
			
			 getContentPane().add(view);
			 getContentPane().add(demo);
			
			 this.setVisible(true);
			 
			
			 

			 
			 view.addActionListener(new java.awt.event.ActionListener() {
		         public void actionPerformed(java.awt.event.ActionEvent e) {
		        	 ShowPOPS.op0="";
		        	 ShowPOPS x = new ShowPOPS();
                        demo.setText( ShowPOPS.post0 [0]);
		        	
		         }
		         
		         
		     });
			 

			 
		
			 
	           
	}
	 

	
	 
	

	 
}
