package views;

import javax.swing.JOptionPane;

public class findfriendrequest {
	
	static String request0 [] = new String[10];
	static String request1 [] = new String[10];
	static String request2 [] = new String[10];
	static String request3 [] = new String[10];
	static String request4 [] = new String[10];
	static String request5 [] = new String[10];
	static String request6 [] = new String[10];
	static String request7 [] = new String[10];
	static String request8 [] = new String[10];
	static String request9 [] = new String[10];
	static String request10 [] = new String[10];
	
	
	static int count0;
	static int count1;
	static int count2;
	static int count3;
	static int count4;
	static int count5;
	static int count6;
	static int count7;
	static int count8;
	static int count9; 
	static int count10;

	public findfriendrequest() {
		String id ;
		int identifier;
		
		
		id= JOptionPane.showInputDialog("please insert user id to request friendship ");
        identifier=Integer.parseInt(id);
        
        
        if (Register.Names[identifier]!=null&&Register.Names[identifier]!=Register.Names[Login.LocalID]) {
        	
        	   if (identifier==0) {
                     
        		   request0 [count0]=Register.usernames[Login.LocalID];
        		   JOptionPane.showMessageDialog(null, "Solicitud enviada a --->"+"   "+Register.usernames[identifier]);
        		   count0++;
			  }
        	   
        	   if (identifier==1) {
        		   JOptionPane.showMessageDialog(null, "Solicitud enviada a --->"+"   "+Register.usernames[identifier]);
        		   request1 [count1]=Register.usernames[Login.LocalID];
        		   count1++;

 			  }
        	   
        	   
        	   if (identifier==2) {
        		   JOptionPane.showMessageDialog(null, "Solicitud enviada a --->"+"   "+Register.usernames[identifier]);
        		   request2 [count2]=Register.usernames[Login.LocalID];
        		   count2++;

 			  }
        	   
        	   
        	   if (identifier==3) {
        		   JOptionPane.showMessageDialog(null, "Solicitud enviada a --->"+"   "+Register.usernames[identifier]);
        		   request3 [count3]=Register.usernames[Login.LocalID];
        		   count3++;
 			  }
        	   
        	   
        	   if (identifier==4) {
        		   JOptionPane.showMessageDialog(null, "Solicitud enviada a --->"+"   "+Register.usernames[identifier]);
        		   request4 [count4]=Register.usernames[Login.LocalID];
        		   count4++;

 			  }
        	   
        	   if (identifier==5) {
        		   JOptionPane.showMessageDialog(null, "Solicitud enviada a --->"+"   "+Register.usernames[identifier]);
        		   request5 [count5]=Register.usernames[Login.LocalID];
        		   count5++;

 			  }
        	   
        	   
        	   if (identifier==6) {
        		   JOptionPane.showMessageDialog(null, "Solicitud enviada a --->"+"   "+Register.usernames[identifier]);
        		   request6 [count6]=Register.usernames[Login.LocalID];
        		   count6++;

 			  }
        	   
        	   if (identifier==7) {
        		   JOptionPane.showMessageDialog(null, "Solicitud enviada a --->"+"   "+Register.usernames[identifier]);
        		   request7 [count7]=Register.usernames[Login.LocalID];
        		   count7++;

 			  }
        	   
        	   if (identifier==8) {
        		   JOptionPane.showMessageDialog(null, "Solicitud enviada a --->"+"   "+Register.usernames[identifier]);
        		   request8 [count8]=Register.usernames[Login.LocalID];
        		   count8++;

 			  }
        	   
        	   if (identifier==9) {
        		   JOptionPane.showMessageDialog(null, "Solicitud enviada a --->"+"   "+Register.usernames[identifier]);
        		   request9 [count9]=Register.usernames[Login.LocalID];
        		   count9++;

 			  }
        	   
        	   if (identifier==10) {
        		   JOptionPane.showMessageDialog(null, "Solicitud enviada a --->"+"   "+Register.usernames[identifier]);
        		   request10 [count10]=Register.usernames[Login.LocalID];
        		   count10++;

 			  }
			
		} else { 
                  JOptionPane.showMessageDialog(null, "This user doesnt exists and you can't send request to yourself");
		}
	}

}
