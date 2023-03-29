package views;

import javax.swing.JOptionPane;

public class CreateAnPOP {
	

	
	static String POPS0 []=		 new String [10];
	static String POPS1 []=		 new String [10];
	static String POPS2 []= 	 new String [10];
	static String POPS3 []= 	 new String [10];
	static String POPS4 []=		 new String [10];
	static String POPS5 []=		 new String [10];
	static String POPS6 []=		 new String [10];
	static String POPS7 []= 	 new String [10];
	static String POPS8 []= 	 new String [10];
	static String POPS9 []= 	 new String [10];
	static String POPS10[]=      new String [10];
	static String fianl[]=        new String[500];
	static String AllPops;
	
	
	
	static int cont0;
	static int cont1;
	static int cont2;
	static int cont3;
	static int cont4;
	static int cont5;
	static int cont6;
	static int cont7;
	static int cont8;
	static int cont9;
	static int cont10;
	static int contpops;
	

	public CreateAnPOP() {
		
		
      
	   if (Login.LocalID==0) {
		   
		   POPS0 [cont0]=JOptionPane.showInputDialog(null, "create your POP")+"  "+" Created by --->"+" "+Register.Names[Login.LocalID]+"POP user ID"+" "+ " -->"+String.valueOf(Login.LocalID)+"POP ID  "+" "+"--->"+String.valueOf(cont0)+"\n";
		   JOptionPane.showMessageDialog(null,  POPS0 [cont0]);
		      cont0++;
  			PersonalWindow x = new PersonalWindow();
  		} 
 	 if (Login.LocalID==1) {
 		 
 		   POPS1 [cont1]=JOptionPane.showInputDialog(null, "create your POP")+"  "+" Created by --->"+" "+Register.Names[Login.LocalID]+"POP user ID"+" "+ " -->"+String.valueOf(Login.LocalID)+"POP ID  "+" "+"--->"+String.valueOf(cont1)+"\n";
		   JOptionPane.showMessageDialog(null,  POPS1 [cont1]);
		      cont1++;	
		    
	  			PersonalWindow x = new PersonalWindow();
		} 
 	 
 	 if (Login.LocalID==2) {
 		   POPS2 [cont2]=JOptionPane.showInputDialog(null, "create your POP")+"  "+" Created by --->"+" "+Register.Names[Login.LocalID]+"POP user ID"+" "+ " -->"+String.valueOf(Login.LocalID)+"POP ID  "+" "+"--->"+String.valueOf(cont2)+"\n";
		   JOptionPane.showMessageDialog(null,  POPS2 [cont2]);
		      cont2++;
		   
	  			PersonalWindow x = new PersonalWindow();
  			
  			
  		} 
 	 
 	 if (Login.LocalID==3) {
 		   POPS3 [cont3]=JOptionPane.showInputDialog(null, "create your POP")+"  "+" Created by --->"+" "+Register.Names[Login.LocalID]+"POP user ID"+" "+ " -->"+String.valueOf(Login.LocalID)+"POP ID  "+" "+"--->"+String.valueOf(cont3)+"\n";
		   JOptionPane.showMessageDialog(null,  POPS3 [cont3]);
		      cont3++;
		  
	  			PersonalWindow x = new PersonalWindow();
  			
  		} 
 	 
 	 if (Login.LocalID==4) {
 		   POPS4 [cont4]=JOptionPane.showInputDialog(null, "create your POP")+"  "+" Created by --->"+" "+Register.Names[Login.LocalID]+"POP user ID"+" "+ " -->"+String.valueOf(Login.LocalID)+"POP ID  "+" "+"--->"+String.valueOf(cont4)+"\n";
		   JOptionPane.showMessageDialog(null,  POPS4 [cont4]);
		      cont4++;
		   
	  			PersonalWindow x = new PersonalWindow();
  			
  		} 
 	 
 	 if (Login.LocalID==5) {
 		   POPS5 [cont5]=JOptionPane.showInputDialog(null, "create your POP")+"  "+" Created by --->"+" "+Register.Names[Login.LocalID]+"POP user ID"+" "+ " -->"+String.valueOf(Login.LocalID)+"POP ID  "+" "+"--->"+String.valueOf(cont5)+"\n";
		   JOptionPane.showMessageDialog(null,  POPS5 [cont5]);
		      cont5++;
		    
	  			PersonalWindow x = new PersonalWindow();
  		} 
 	 if (Login.LocalID==6) {
 		   POPS6 [cont6]=JOptionPane.showInputDialog(null, "create your POP")+"  "+" Created by --->"+" "+Register.Names[Login.LocalID]+"POP user ID"+" "+ " -->"+String.valueOf(Login.LocalID)+"POP ID  "+" "+"--->"+String.valueOf(cont6)+"\n";
		   JOptionPane.showMessageDialog(null,  POPS6 [cont6]);
		      cont6++;
		      
	  			PersonalWindow x = new PersonalWindow();
  			
  		} 
 	 if (Login.LocalID==7) {
 		   POPS7 [cont7]=JOptionPane.showInputDialog(null, "create your POP")+"  "+" Created by --->"+" "+Register.Names[Login.LocalID]+"POP user ID"+" "+ " -->"+String.valueOf(Login.LocalID)+"POP ID  "+" "+"--->"+String.valueOf(cont7)+"\n";
		   JOptionPane.showMessageDialog(null,  POPS7 [cont7]);
		      cont7++;
		     
	  			PersonalWindow x = new PersonalWindow();
  		} 
 	 if (Login.LocalID==8) {
 		   POPS8 [cont8]=JOptionPane.showInputDialog(null, "create your POP")+"  "+" Created by --->"+" "+Register.Names[Login.LocalID]+"POP user ID"+" "+ " -->"+String.valueOf(Login.LocalID)+"POP ID  "+" "+"--->"+String.valueOf(cont8)+"\n";
		   JOptionPane.showMessageDialog(null,  POPS8 [cont8]);
		      cont8++;
		      
	  			PersonalWindow x = new PersonalWindow();
  		} 
 	 if (Login.LocalID==9) {
 		   POPS9 [cont9]=JOptionPane.showInputDialog(null, "create your POP")+"  "+" Created by --->"+" "+Register.Names[Login.LocalID]+"POP user ID"+" "+ " -->"+String.valueOf(Login.LocalID)+"POP ID  "+" "+"--->"+String.valueOf(cont9)+"\n";
		   JOptionPane.showMessageDialog(null,  POPS9 [cont9]);
		      cont9++;
		     
	  			PersonalWindow x = new PersonalWindow();
  		} 
 	 if (Login.LocalID==10) {
 		   POPS10 [cont10]=JOptionPane.showInputDialog(null, "create your POP")+"  "+" Created by --->"+" "+Register.Names[Login.LocalID]+"POP user ID"+" "+ " -->"+String.valueOf(Login.LocalID)+"POP ID  "+" "+"--->"+String.valueOf(cont10)+"\n";
		   JOptionPane.showMessageDialog(null,  POPS10 [cont10]);
		      cont10++;
		    
	  			PersonalWindow x = new PersonalWindow();
  		} 
 	 
 	 
	}
	



		
	
	
	

}
