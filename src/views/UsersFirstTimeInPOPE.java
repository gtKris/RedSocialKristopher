package views;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class UsersFirstTimeInPOPE extends JFrame {

	public UsersFirstTimeInPOPE() {
		
		
		 
		
		
		JTable table = new JTable();
		
		
		
		  this.add(new JScrollPane(table));
	         
	        this.setTitle("Users who have entered POPE ");
	        this.pack();
	        this.setVisible(true);
	        this.setLocationRelativeTo(null);
		
	        
	        DefaultTableModel modelo = new DefaultTableModel();
	        
	        
	        modelo.addColumn("ID");
	        modelo.addColumn("Name");
	        modelo.addColumn("Username");
	        modelo.addColumn("First time");

	        for (AllUsersWithDayAndHour first : PersonalWindow.FirstTimeInPope) {
	            Object[] fila = new Object[4];
	            
	          
					    fila[0] = first.getId();
			            fila[1] = first.getName();
			            fila[2] = first.getUsername();
			            fila[3]=  first.getDate();
			           
               
				
	           
	            modelo.addRow(fila);
	        }
	        table.setModel(modelo); 
	      
	}

}
