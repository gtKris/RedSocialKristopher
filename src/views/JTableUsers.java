package views;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



public class JTableUsers  extends JFrame{

	public JTableUsers() {
		
		 
		
		
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

	        for (usersDates pers : PersonalWindow.CreateAnObject) {
	            Object[] fila = new Object[3];
	            
	          
					    fila[0] = pers.getId();
			            fila[1] = pers.getName();
			            fila[2] = pers.getUsername();
			           
               
				
	           
	            modelo.addRow(fila);
	        }
	        table.setModel(modelo); 
	      
		
	}

};


