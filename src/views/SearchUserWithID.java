package views;

import javax.swing.JOptionPane;

public class SearchUserWithID {

	 String ID="";
	 int intID  ;
	
	public SearchUserWithID() {
		
		
		ID= JOptionPane.showInputDialog(null,"Please insert the id of the user you want to search");
		
		
		try{
			intID=Integer.parseInt(ID);
			ConfirmUser();
    	}catch(NumberFormatException ex){
        	JOptionPane.showMessageDialog(null, "Please insert an integer");
        	
        	returntoMain();
    	}
		
	
		
		
		
		
	}
	
	private void returntoMain() {
		 ViewsAllUsers v = new ViewsAllUsers();
		
	}

	private void ConfirmUser() {
		intID=Integer.parseInt(ID);
		
		if (Register.Names[intID]!=null) {
			JOptionPane.showMessageDialog(null, "The user with this id is"+" "+"-->"+" "+Register.Names[intID]+"\n"+"ID"+" "+"-->"+" "+ intID);
			 ViewsAllUsers v = new ViewsAllUsers();
			
		} else {
			JOptionPane.showMessageDialog(null, "The user with this ID does not exist");
			 ViewsAllUsers v = new ViewsAllUsers();

		}
	
	}

}
