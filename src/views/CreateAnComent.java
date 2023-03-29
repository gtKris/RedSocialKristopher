package views;

import javax.swing.JOptionPane;

public class CreateAnComent {
	static int idP;
	public CreateAnComent() {
		
		String coment;
		String id="";
		String idPOP="";
		int op;
		
		
		
		id=JOptionPane.showInputDialog(null, "Please insert the id user");
		idPOP=JOptionPane.showInputDialog(null, "Please insert the id pop");
		
		
		op = Integer.parseInt(id);
		idP= Integer.parseInt(idPOP);
		
		
		if (op==0) {
			
			  if (CreateAnPOP.POPS0[idP]!=null) {
				
				 coment= JOptionPane.showInputDialog(null, "Please insert the coment user");
				 CreateAnPOP.POPS0[idP]=CreateAnPOP.POPS0[idP]+"  "+coment+" "+" coment by -->"+" "+Register.Names[Login.LocalID]+"\n";
				  CreateAnPOP.AllPops= CreateAnPOP.AllPops+CreateAnPOP.POPS0[idP];
				  PersonalWindow x = new PersonalWindow();
				
			} else {
				
				JOptionPane.showMessageDialog(null, "This POP doesnt exist");
				PersonalWindow x = new PersonalWindow();
			}
			
		}
		
		
		if (op==1) {
			  if (CreateAnPOP.POPS1[idP]!=null) {
				  coment= JOptionPane.showInputDialog(null, "Please insert the coment user");
					 CreateAnPOP.POPS1[idP]=CreateAnPOP.POPS1[idP]+"  "+coment+" "+" coment by -->"+" "+Register.Names[Login.LocalID]+"\n";
					  PersonalWindow x = new PersonalWindow();
					
				} else {
					
					JOptionPane.showMessageDialog(null, "This POP doesnt exist");
				}
			
		}
		
		
		if (op==2) {
			  if (CreateAnPOP.POPS2[idP]!=null) {
				  coment= JOptionPane.showInputDialog(null, "Please insert the coment user");
					 CreateAnPOP.POPS2[idP]=CreateAnPOP.POPS2[idP]+"  "+coment+" "+" coment by -->"+" "+Register.Names[Login.LocalID]+"\n";
					  PersonalWindow x = new PersonalWindow();
					
				} else {
					
					JOptionPane.showMessageDialog(null, "This POP doesnt exist");
				}
		}
		
		if (op==3) {
			  if (CreateAnPOP.POPS3[idP]!=null) {
				  coment= JOptionPane.showInputDialog(null, "Please insert the coment user");
					 CreateAnPOP.POPS3[idP]=CreateAnPOP.POPS3[idP]+"  "+coment+" "+" coment by -->"+" "+Register.Names[Login.LocalID]+"\n";
					  PersonalWindow x = new PersonalWindow();
				} else {
					
					JOptionPane.showMessageDialog(null, "This POP doesnt exist");
				}
			
		}
		if (op==4) {
			  if (CreateAnPOP.POPS4[idP]!=null) {
				  coment= JOptionPane.showInputDialog(null, "Please insert the coment user");
					 CreateAnPOP.POPS4[idP]=CreateAnPOP.POPS4[idP]+"  "+coment+" "+" coment by -->"+" "+Register.Names[Login.LocalID]+"\n";
					  PersonalWindow x = new PersonalWindow();
					
				} else {
					
					JOptionPane.showMessageDialog(null, "This POP doesnt exist");
				}
	
		}
		if (op==5) {
			  if (CreateAnPOP.POPS5[idP]!=null) {
				  coment= JOptionPane.showInputDialog(null, "Please insert the coment user");
					 CreateAnPOP.POPS5[idP]=CreateAnPOP.POPS5[idP]+"  "+coment+" "+" coment by -->"+" "+Register.Names[Login.LocalID]+"\n";
					  PersonalWindow x = new PersonalWindow();
				} else {
					
					JOptionPane.showMessageDialog(null, "This POP doesnt exist");
				}
	
		}
		if (op==6) {
			  if (CreateAnPOP.POPS6[idP]!=null) {
				  coment= JOptionPane.showInputDialog(null, "Please insert the coment user");
					 CreateAnPOP.POPS6[idP]=CreateAnPOP.POPS6[idP]+"  "+coment+" "+" coment by -->"+" "+Register.Names[Login.LocalID]+"\n";
					  PersonalWindow x = new PersonalWindow();
					
				} else {
					
					JOptionPane.showMessageDialog(null, "This POP doesnt exist");
				}
	
		}
		if (op==7) {
			  if (CreateAnPOP.POPS7[idP]!=null) {
				  coment= JOptionPane.showInputDialog(null, "Please insert the coment user");
					 CreateAnPOP.POPS7[idP]=CreateAnPOP.POPS7[idP]+"  "+coment+" "+" coment by -->"+" "+Register.Names[Login.LocalID]+"\n";
					  PersonalWindow x = new PersonalWindow();
					
				} else {
					
					JOptionPane.showMessageDialog(null, "This POP doesnt exist");
				}
	
		}
		if (op==8) {
			  if (CreateAnPOP.POPS8[idP]!=null) {
				  coment= JOptionPane.showInputDialog(null, "Please insert the coment user");
					 CreateAnPOP.POPS8[idP]=CreateAnPOP.POPS8[idP]+"  "+coment+" "+" coment by -->"+" "+Register.Names[Login.LocalID]+"\n";
					  PersonalWindow x = new PersonalWindow();
					
				} else {
					
					JOptionPane.showMessageDialog(null, "This POP doesnt exist");
				}
	
		}
		if (op==9) {
			  if (CreateAnPOP.POPS9[idP]!=null) {
				  coment= JOptionPane.showInputDialog(null, "Please insert the coment user");
					 CreateAnPOP.POPS9[idP]=CreateAnPOP.POPS9[idP]+"  "+coment+" "+" coment by -->"+" "+Register.Names[Login.LocalID]+"\n";
					  PersonalWindow x = new PersonalWindow();
					
				} else {
					
					JOptionPane.showMessageDialog(null, "This POP doesnt exist");
				}
	
		}
		if (op==10) {
			  if (CreateAnPOP.POPS10[idP]!=null) {
				  coment= JOptionPane.showInputDialog(null, "Please insert the coment user");
					 CreateAnPOP.POPS10[idP]=CreateAnPOP.POPS10[idP]+"  "+coment+" "+" coment by -->"+" "+Register.Names[Login.LocalID]+"\n";
					  PersonalWindow x = new PersonalWindow();
					
				} else {
					
					JOptionPane.showMessageDialog(null, "This POP doesnt exist");
				}
	
		}

	}

}
