package views;

import javax.swing.JOptionPane;

public class RUDPOPS {

	public RUDPOPS() {

       String option;
       int optionn;
       
       option= JOptionPane.showInputDialog(null,"Please insert an option \n1) View all my POPS \n 2) Search an my POP with ID \n·3)Update an POP \n4) delete an POP");
	    
       optionn =Integer.parseInt(option);
       
  
			
		
		
		if (Login.LocalID==0&&optionn==1) {
			
			for (int i = 0; i < CreateAnPOP.POPS0.length; i++) {
				
					JOptionPane.showMessageDialog(null, CreateAnPOP.POPS0[i]);
				
				
			}
			
		}
		
		
	if (Login.LocalID==1&&optionn==1) {
			
			for (int i = 0; i < CreateAnPOP.POPS1.length; i++) {
				
				
				if (CreateAnPOP.POPS1[i] != null) {
					JOptionPane.showMessageDialog(null, CreateAnPOP.POPS1[i]);
				}
				
			}
			
		}
	
	
	
	
	if (Login.LocalID==2&&optionn==1) {
		
		for (int i = 0; i < CreateAnPOP.POPS2.length; i++) {
			
			
			if (CreateAnPOP.POPS2[i] != null) {
				JOptionPane.showMessageDialog(null, CreateAnPOP.POPS2[i]);
			}
			
		}
		
	}
	
	
	
	if (Login.LocalID==3&&optionn==1) {
		
		for (int i = 0; i < CreateAnPOP.POPS3.length; i++) {
			
			
			if (CreateAnPOP.POPS3[i] != null) {
				JOptionPane.showMessageDialog(null, CreateAnPOP.POPS3[i]);
			}
			
		}
		
	}
	
	
	
	
	if (Login.LocalID==4&&optionn==1) {
		
		for (int i = 0; i < CreateAnPOP.POPS4.length; i++) {
			
			
			if (CreateAnPOP.POPS4[i] != null) {
				JOptionPane.showMessageDialog(null, CreateAnPOP.POPS4[i]);
			}
			
		}
		
	}
	
	
	
	
	if (Login.LocalID==5&&optionn==1) {
		
		for (int i = 0; i < CreateAnPOP.POPS5.length; i++) {
			
			
			if (CreateAnPOP.POPS5[i] != null) {
				JOptionPane.showMessageDialog(null, CreateAnPOP.POPS5[i]);
			}
			
		}
		
	}
	
	
	
	if (Login.LocalID==6&&optionn==1) {
		
		for (int i = 0; i < CreateAnPOP.POPS6.length; i++) {
			
			
			if (CreateAnPOP.POPS6[i] != null) {
				JOptionPane.showMessageDialog(null, CreateAnPOP.POPS6[i]);
			}
			
		}
		
	}
	
	
	
	if (Login.LocalID==7&&optionn==1) {
		
		for (int i = 0; i < CreateAnPOP.POPS7.length; i++) {
			
			
			if (CreateAnPOP.POPS7[i] != null) {
				JOptionPane.showMessageDialog(null, CreateAnPOP.POPS7[i]);
			}
			
		}
		
	}
	
	
	
	if (Login.LocalID==8&&optionn==1) {
		
		for (int i = 0; i < CreateAnPOP.POPS8.length; i++) {
			
			
			if (CreateAnPOP.POPS8[i] != null) {
				JOptionPane.showMessageDialog(null, CreateAnPOP.POPS8[i]);
			}
			
		}
		
	}
	
	
	if (Login.LocalID==9&&optionn==1) {
		
		for (int i = 0; i < CreateAnPOP.POPS9.length; i++) {
			
			
			if (CreateAnPOP.POPS9[i] != null) {
				JOptionPane.showMessageDialog(null, CreateAnPOP.POPS9[i]);
			}
			
		}
		
	}
if (Login.LocalID==10&&optionn==1) {
		
		for (int i = 0; i < CreateAnPOP.POPS10.length; i++) {
			
			
			if (CreateAnPOP.POPS10[i] != null) {
				JOptionPane.showMessageDialog(null, CreateAnPOP.POPS10[i]);
			}
			
		}
      
       }
	
		
	
		
		
		if (Login.LocalID==0&&optionn==2) {
			
			  String local;
			  int i ;
			  local= JOptionPane.showInputDialog(null,"Please insert a id of POP");
			  i=Integer.parseInt(local);

				if (CreateAnPOP.POPS0[i] != null) {
					JOptionPane.showMessageDialog(null, CreateAnPOP.POPS0[i]);
				}
				
				else {
					JOptionPane.showMessageDialog(null, "This POP is null");
				}
					
				
			
			
		}
		
		
	if (Login.LocalID==1&&optionn==2) {
			
		  String local;
		  int i ;
		  local= JOptionPane.showInputDialog(null,"Please insert a id of POP");
		  i=Integer.parseInt(local);

			if (CreateAnPOP.POPS1[i] != null) {
				JOptionPane.showMessageDialog(null, CreateAnPOP.POPS1[i]);
			}
			
			else {
				JOptionPane.showMessageDialog(null, "This POP is null");
			}
				
			
		}
	
	
	
	
	if (Login.LocalID==2&&optionn==2) {
		
		  String local;
		  int i ;
		  local= JOptionPane.showInputDialog(null,"Please insert a id of POP");
		  i=Integer.parseInt(local);

			if (CreateAnPOP.POPS2[i] != null) {
				JOptionPane.showMessageDialog(null, CreateAnPOP.POPS2[i]);
			}
			
			else {
				JOptionPane.showMessageDialog(null, "This POP is null");
			}
				
	}
	
	
	
	if (Login.LocalID==3&&optionn==2) {
		
	
		
		  String local;
		  int i ;
		  local= JOptionPane.showInputDialog(null,"Please insert a id of POP");
		  i=Integer.parseInt(local);

			if (CreateAnPOP.POPS3[i] != null) {
				JOptionPane.showMessageDialog(null, CreateAnPOP.POPS3[i]);
			}
			
			else {
				JOptionPane.showMessageDialog(null, "This POP is null");
			}
				
		
	}
	
	
	
	
	if (Login.LocalID==4&&optionn==2) {
	
		  String local;
		  int i ;
		  local= JOptionPane.showInputDialog(null,"Please insert a id of POP");
		  i=Integer.parseInt(local);

			if (CreateAnPOP.POPS4[i] != null) {
				JOptionPane.showMessageDialog(null, CreateAnPOP.POPS4[i]);
			}
			
			else {
				JOptionPane.showMessageDialog(null, "This POP is null");
			}
				
		
	}
	
	
	
	
	if (Login.LocalID==5&&optionn==2) {
		
		  String local;
		  int i ;
		  local= JOptionPane.showInputDialog(null,"Please insert a id of POP");
		  i=Integer.parseInt(local);

			if (CreateAnPOP.POPS5[i] != null) {
				JOptionPane.showMessageDialog(null, CreateAnPOP.POPS5[i]);
			}
			
			else {
				JOptionPane.showMessageDialog(null, "This POP is null");
			}
				
	}
	
	
	
	if (Login.LocalID==6&&optionn==2) {
		
		  String local;
		  int i ;
		  local= JOptionPane.showInputDialog(null,"Please insert a id of POP");
		  i=Integer.parseInt(local);

			if (CreateAnPOP.POPS6[i] != null) {
				JOptionPane.showMessageDialog(null, CreateAnPOP.POPS6[i]);
			}
			
			else {
				JOptionPane.showMessageDialog(null, "This POP is null");
			}
				
		
	}
	
	
	
	if (Login.LocalID==7&&optionn==2) {
		
		  String local;
		  int i ;
		  local= JOptionPane.showInputDialog(null,"Please insert a id of POP");
		  i=Integer.parseInt(local);

			if (CreateAnPOP.POPS7[i] != null) {
				JOptionPane.showMessageDialog(null, CreateAnPOP.POPS7[i]);
			}
			
			else {
				JOptionPane.showMessageDialog(null, "This POP is null");
			}
				
	}
	
	
	
	if (Login.LocalID==8&&optionn==2) {
		
		  String local;
		  int i ;
		  local= JOptionPane.showInputDialog(null,"Please insert a id of POP");
		  i=Integer.parseInt(local);

			if (CreateAnPOP.POPS8[i] != null) {
				JOptionPane.showMessageDialog(null, CreateAnPOP.POPS8[i]);
			}
			
			else {
				JOptionPane.showMessageDialog(null, "This POP is null");
			}
				
		
	}
	
	
	if (Login.LocalID==9&&optionn==2) {
		
		  String local;
		  int i ;
		  local= JOptionPane.showInputDialog(null,"Please insert a id of POP");
		  i=Integer.parseInt(local);

			if (CreateAnPOP.POPS9[i] != null) {
				JOptionPane.showMessageDialog(null, CreateAnPOP.POPS9[i]);
			}
			
			else {
				JOptionPane.showMessageDialog(null, "This POP is null");
			}
				
		
	}
if (Login.LocalID==10&&optionn==2) {
		
	  String local;
	  int i ;
	  local= JOptionPane.showInputDialog(null,"Please insert a id of POP");
	  i=Integer.parseInt(local);

		if (CreateAnPOP.POPS10[i] != null) {
			JOptionPane.showMessageDialog(null, CreateAnPOP.POPS10[i]);
		}
		
		else {
			JOptionPane.showMessageDialog(null, "This POP is null");
		}
			
    }
		
		
		
	
	

		if (Login.LocalID==0&&optionn==3) {
			
			  String local;
			  int i ;
			  local= JOptionPane.showInputDialog(null,"Please insert a id of POP");
			  i=Integer.parseInt(local);

				if (CreateAnPOP.POPS0[i] != null) {
					 CreateAnPOP.POPS0[i]=JOptionPane.showInputDialog(null, "insert the update");
					 CreateAnPOP.POPS0[i]= CreateAnPOP.POPS0[i]+" "+"Created and modified by--->"+" "+Register.Names[Login.LocalID]+" "+ " user id "+String.valueOf(Login.LocalID)+"POP id "+" "+local+"\n";
				}
				
				else {
					JOptionPane.showMessageDialog(null, "This POP is null");
				}
					
				
			
			
		}
		
		
	if (Login.LocalID==1&&optionn==3) {
			
		  String local;
		  int i ;
		  local= JOptionPane.showInputDialog(null,"Please insert a id of POP");
		  i=Integer.parseInt(local);

			if (CreateAnPOP.POPS1[i] != null) {
				 CreateAnPOP.POPS1[i]=JOptionPane.showInputDialog(null, "insert the update");
				 CreateAnPOP.POPS1[i]= CreateAnPOP.POPS1[i]+" "+"Created and modified by--->"+" "+Register.Names[Login.LocalID]+" "+ " user id "+String.valueOf(Login.LocalID)+"POP id "+" "+local+"\n";
			}
			
			else {
				JOptionPane.showMessageDialog(null, "This POP is null");
			}
				
			
		}
	
	
	
	
	if (Login.LocalID==2&&optionn==3) {
		
		  String local;
		  int i ;
		  local= JOptionPane.showInputDialog(null,"Please insert a id of POP");
		  i=Integer.parseInt(local);

			if (CreateAnPOP.POPS2[i] != null) {
				 CreateAnPOP.POPS2[i]=JOptionPane.showInputDialog(null, "insert the update");
				 CreateAnPOP.POPS2[i]= CreateAnPOP.POPS2[i]+" "+"Created and modified by--->"+" "+Register.Names[Login.LocalID]+" "+ " user id "+String.valueOf(Login.LocalID)+"POP id "+" "+local+"\n";
			}
			
			else {
				JOptionPane.showMessageDialog(null, "This POP is null");
			}
				
	}
	
	
	
	if (Login.LocalID==3&&optionn==3) {
		
	
		
		  String local;
		  int i ;
		  local= JOptionPane.showInputDialog(null,"Please insert a id of POP");
		  i=Integer.parseInt(local);

			if (CreateAnPOP.POPS3[i] != null) {
				 CreateAnPOP.POPS3[i]=JOptionPane.showInputDialog(null, "insert the update");
				 CreateAnPOP.POPS3[i]= CreateAnPOP.POPS3[i]+" "+"Created and modified by--->"+" "+Register.Names[Login.LocalID]+" "+ " user id "+String.valueOf(Login.LocalID)+"POP id "+" "+local+"\n";
			}
			
			else {
				JOptionPane.showMessageDialog(null, "This POP is null");
			}
				
		
	}
	
	
	
	
	if (Login.LocalID==4&&optionn==3) {
	
		  String local;
		  int i ;
		  local= JOptionPane.showInputDialog(null,"Please insert a id of POP");
		  i=Integer.parseInt(local);

			if (CreateAnPOP.POPS4[i] != null) {
				 CreateAnPOP.POPS4[i]=JOptionPane.showInputDialog(null, "insert the update");
				 CreateAnPOP.POPS4[i]= CreateAnPOP.POPS4[i]+" "+"Created and modified by--->"+" "+Register.Names[Login.LocalID]+" "+ " user id "+String.valueOf(Login.LocalID)+"POP id "+" "+local+"\n";
			}
			
			else {
				JOptionPane.showMessageDialog(null, "This POP is null");
			}
				
		
	}
	
	
	
	
	if (Login.LocalID==5&&optionn==3) {
		
		  String local;
		  int i ;
		  local= JOptionPane.showInputDialog(null,"Please insert a id of POP");
		  i=Integer.parseInt(local);

			if (CreateAnPOP.POPS5[i] != null) {
				 CreateAnPOP.POPS5[i]=JOptionPane.showInputDialog(null, "insert the update");
				 CreateAnPOP.POPS5[i]= CreateAnPOP.POPS5[i]+" "+"Created and modified by--->"+" "+Register.Names[Login.LocalID]+" "+ " user id "+String.valueOf(Login.LocalID)+"POP id "+" "+local+"\n";
			}
			
			else {
				JOptionPane.showMessageDialog(null, "This POP is null");
			}
				
	}
	
	
	
	if (Login.LocalID==6&&optionn==3) {
		
		  String local;
		  int i ;
		  local= JOptionPane.showInputDialog(null,"Please insert a id of POP");
		  i=Integer.parseInt(local);

			if (CreateAnPOP.POPS6[i] != null) {
				 CreateAnPOP.POPS6[i]=JOptionPane.showInputDialog(null, "insert the update");
				 CreateAnPOP.POPS6[i]= CreateAnPOP.POPS6[i]+" "+"Created and modified by--->"+" "+Register.Names[Login.LocalID]+" "+ " user id "+String.valueOf(Login.LocalID)+"POP id "+" "+local+"\n";
			}
			
			else {
				JOptionPane.showMessageDialog(null, "This POP is null");
			}
				
		
	}
	
	
	
	if (Login.LocalID==7&&optionn==3) {
		
		  String local;
		  int i ;
		  local= JOptionPane.showInputDialog(null,"Please insert a id of POP");
		  i=Integer.parseInt(local);

			if (CreateAnPOP.POPS7[i] != null) {
				 CreateAnPOP.POPS7[i]=JOptionPane.showInputDialog(null, "insert the update");
				 CreateAnPOP.POPS7[i]= CreateAnPOP.POPS7[i]+" "+"Created and modified by--->"+" "+Register.Names[Login.LocalID]+" "+ " user id "+String.valueOf(Login.LocalID)+"POP id "+" "+local+"\n";
			}
			
			else {
				JOptionPane.showMessageDialog(null, "This POP is null");
			}
				
	}
	
	
	
	if (Login.LocalID==8&&optionn==3) {
		
		  String local;
		  int i ;
		  local= JOptionPane.showInputDialog(null,"Please insert a id of POP");
		  i=Integer.parseInt(local);

			if (CreateAnPOP.POPS8[i] != null) {
				 CreateAnPOP.POPS8[i]=JOptionPane.showInputDialog(null, "insert the update");
				 CreateAnPOP.POPS8[i]= CreateAnPOP.POPS8[i]+" "+"Created and modified by--->"+" "+Register.Names[Login.LocalID]+" "+ " user id "+String.valueOf(Login.LocalID)+"POP id "+" "+local+"\n";
			}
			
			else {
				JOptionPane.showMessageDialog(null, "This POP is null");
			}
				
		
	}
	
	
	if (Login.LocalID==9&&optionn==3) {
		
		  String local;
		  int i ;
		  local= JOptionPane.showInputDialog(null,"Please insert a id of POP");
		  i=Integer.parseInt(local);

			if (CreateAnPOP.POPS9[i] != null) {
				 CreateAnPOP.POPS9[i]=JOptionPane.showInputDialog(null, "insert the update");
				 CreateAnPOP.POPS9[i]= CreateAnPOP.POPS9[i]+" "+"Created and modified by--->"+" "+Register.Names[Login.LocalID]+" "+ " user id "+String.valueOf(Login.LocalID)+"POP id "+" "+local+"\n";
			}
			
			else {
				JOptionPane.showMessageDialog(null, "This POP is null");
			}
				
		
	}
if (Login.LocalID==10&&optionn==3) {
		
	  String local;
	  int i ;
	  local= JOptionPane.showInputDialog(null,"Please insert a id of POP");
	  i=Integer.parseInt(local);

		if (CreateAnPOP.POPS10[i] != null) {
			 CreateAnPOP.POPS10[i]=JOptionPane.showInputDialog(null, "insert the update");
			 CreateAnPOP.POPS10[i]= CreateAnPOP.POPS10[i]+" "+"Created and modified by--->"+" "+Register.Names[Login.LocalID]+" "+ " user id "+String.valueOf(Login.LocalID)+"POP id "+" "+local+"\n";
		}
		
		else {
			JOptionPane.showMessageDialog(null, "This POP is null");
		}
		
  }



if (Login.LocalID==0&&optionn==4) {
	
	  String local;
	  int i ;
	  local= JOptionPane.showInputDialog(null,"Please insert a id of POP");
	  i=Integer.parseInt(local);

		if (CreateAnPOP.POPS0[i] != null) {
			 CreateAnPOP.POPS0[i]=null;
		}
		
		else {
			JOptionPane.showMessageDialog(null, "This POP is null");
		}
			
		
	
	
}


if (Login.LocalID==1&&optionn==4) {
	
String local;
int i ;
local= JOptionPane.showInputDialog(null,"Please insert a id of POP");
i=Integer.parseInt(local);

	if (CreateAnPOP.POPS1[i] != null) {
		 CreateAnPOP.POPS1[i]=null;
	}
	
	else {
		JOptionPane.showMessageDialog(null, "This POP is null");
	}
		
	
}




if (Login.LocalID==2&&optionn==4) {

String local;
int i ;
local= JOptionPane.showInputDialog(null,"Please insert a id of POP");
i=Integer.parseInt(local);

	if (CreateAnPOP.POPS2[i] != null) {
		 CreateAnPOP.POPS2[i]=null;
	}
	
	else {
		JOptionPane.showMessageDialog(null, "This POP is null");
	}
		
}



if (Login.LocalID==3&&optionn==4) {



String local;
int i ;
local= JOptionPane.showInputDialog(null,"Please insert a id of POP");
i=Integer.parseInt(local);

	if (CreateAnPOP.POPS3[i] != null) {
		 CreateAnPOP.POPS3[i]=null;
	}
	
	else {
		JOptionPane.showMessageDialog(null, "This POP is null");
	}
		

}




if (Login.LocalID==4&&optionn==4) {

String local;
int i ;
local= JOptionPane.showInputDialog(null,"Please insert a id of POP");
i=Integer.parseInt(local);

	if (CreateAnPOP.POPS4[i] != null) {
		 CreateAnPOP.POPS4[i]=null;
	}
	
	else {
		JOptionPane.showMessageDialog(null, "This POP is null");
	}
		

}




if (Login.LocalID==5&&optionn==4) {

String local;
int i ;
local= JOptionPane.showInputDialog(null,"Please insert a id of POP");
i=Integer.parseInt(local);

	if (CreateAnPOP.POPS5[i] != null) {
		 CreateAnPOP.POPS5[i]=null;
	}
	
	else {
		JOptionPane.showMessageDialog(null, "This POP is null");
	}
		
}



if (Login.LocalID==6&&optionn==4) {

String local;
int i ;
local= JOptionPane.showInputDialog(null,"Please insert a id of POP");
i=Integer.parseInt(local);

	if (CreateAnPOP.POPS6[i] != null) {
		 CreateAnPOP.POPS6[i]=null;
	}
	
	else {
		JOptionPane.showMessageDialog(null, "This POP is null");
	}
		

}



if (Login.LocalID==7&&optionn==4) {

String local;
int i ;
local= JOptionPane.showInputDialog(null,"Please insert a id of POP");
i=Integer.parseInt(local);

	if (CreateAnPOP.POPS7[i] != null) {
		 CreateAnPOP.POPS7[i]=null;
	}
	
	else {
		JOptionPane.showMessageDialog(null, "This POP is null");
	}
		
}



if (Login.LocalID==8&&optionn==4) {

String local;
int i ;
local= JOptionPane.showInputDialog(null,"Please insert a id of POP");
i=Integer.parseInt(local);

	if (CreateAnPOP.POPS8[i] != null) {
		 CreateAnPOP.POPS8[i]=null;
		
	}
	
	else {
		JOptionPane.showMessageDialog(null, "This POP is null");
	}
		

}


if (Login.LocalID==9&&optionn==4) {

String local;
int i ;
local= JOptionPane.showInputDialog(null,"Please insert a id of POP");
i=Integer.parseInt(local);

	if (CreateAnPOP.POPS9[i] != null) {

		 CreateAnPOP.POPS9[i]= null;
	}
	
	else {
		JOptionPane.showMessageDialog(null, "This POP is null");
	}
		

}
if (Login.LocalID==10&&optionn==4) {

String local;
int i ;
local= JOptionPane.showInputDialog(null,"Please insert a id of POP");
i=Integer.parseInt(local);

if (CreateAnPOP.POPS10[i] != null) {
	 CreateAnPOP.POPS10[i]=null;
	
}

else {
	JOptionPane.showMessageDialog(null, "This POP is null");
}

}
		
	}
	


}
