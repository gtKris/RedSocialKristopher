package views;



import javax.swing.JOptionPane;

public class ViewRequest {
	static String thisdID;
	static int    ID;
	static int finalID;
	static String friends0[]= new String[2];
	static String friends1[]= new String[2];
	static String friends2[]= new String[2];
	static String friends3[]= new String[2];
	static String friends4[]= new String[2];
	static String friends5[]= new String[2];
	static String friends6[]= new String[2];
	static String friends7[]= new String[2];
	static String friends8[]= new String[2];
	static String friends9[]= new String[2];
	static String friends10[]= new String[2];
	static String actualUser;
	 
	

	

	public ViewRequest() {
		actualUser=Register.usernames[Login.LocalID];
		
		
		if (Login.LocalID==0) {
			for (int i = 0; i <findfriendrequest. request0 .length; i++) {
				if (findfriendrequest. request0[i]!= null) {
					JOptionPane.showMessageDialog(null, findfriendrequest. request0[i]+" "+ " ID-->"+" "+i);
					
				}
				
			}
			
			if (JOptionPane.showConfirmDialog(null, "Do you want to accept someone?", "WARNING",
			        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
				
				thisdID=JOptionPane.showInputDialog("Please insert the id request");
				ID=Integer.parseInt(thisdID);
				
				char loca = findfriendrequest. request0[ID].charAt(findfriendrequest. request0[ID].length()-1);
		        String x = String.valueOf(loca);
				int local=Integer.parseInt(x);
				friends0[1]=friends0[1]+findfriendrequest. request0[ID]+"\n";
				findfriendrequest. request0[ID]=null;
				
				JOptionPane.showMessageDialog(null, local);
	
				if (local==1) {
					
					friends1[1]=friends1[1]+actualUser+"\n";
				
				}
				
                  if (local==2) {
					
                	  friends2[1]=friends2[1]+actualUser+"\n";
					
				}
				
                  if (local==3) {
                	  friends3[1]=friends3[1]+actualUser+"\n";
  				
  				}
                  
                  
                  if (local==4) {
                	  friends4[1]=friends4[1]+actualUser+"\n";
  					
  				}
                  
                  if (local==5) {
  					
                	  friends5[1]=friends5[1]+actualUser+"\n";
  				}
                  
                  
                  if (local==6) {
                	  friends6[1]=friends6[1]+actualUser+"\n";
  					
  				}
                  
                  
                  if (local==7) {
                	  friends7[1]=friends7[1]+actualUser+"\n";
  					
  				}
                  
                  if (local==8) {
                	  friends8[1]=friends8[1]+actualUser+"\n";
  					
  				}
                  if (local==9) {
                	  friends9[1]=friends9[1]+actualUser+"\n";
  					
  				}
                  if (local==10) {
                	  friends10[1]=friends10[1]+actualUser+"\n";
  					
  				}
              
                  
       
			    // yes option
			} 
			
			else {
				
				JOptionPane.showMessageDialog(null, "Okk");
			    // no option
			}
		}
		
		
		
		
		
		
	
		if (Login.LocalID==1) {
			for (int i = 0; i <findfriendrequest. request1 .length; i++) {
				if (findfriendrequest. request1[i]!= null) {
					JOptionPane.showMessageDialog(null, findfriendrequest. request1[i]+" "+ " ID-->"+" "+i);
					
				}
				
			}
		
			if (JOptionPane.showConfirmDialog(null, "Do you want to accept someone?", "WARNING",
			        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
				
				thisdID=JOptionPane.showInputDialog("Please insert the id request");
				ID=Integer.parseInt(thisdID);
				
				char local = findfriendrequest. request1[ID].charAt(findfriendrequest. request1[ID].length()-1);
		
				friends1[1]=friends1[1]+findfriendrequest. request1[ID]+"\n";
				findfriendrequest. request1[ID]=null;
				
				if (local==0) {
					
					friends0[1]=friends0[1]+actualUser+"\n";
				
				}
				
                  if (local==2) {
					
                    friends2[1]= friends2[1]+actualUser+"\n";
					
				}
				
                  if (local==3) {
  					
                		friends3[1]=  friends3[1]+actualUser+"\n";
  				}
                  
                  
                  if (local==4) {
  					
                		friends4[1]=  friends4[1]+actualUser+"\n";
  				}
                  
                  if (local==5) {
  					
                		friends5[1]=  friends5[1]+actualUser+"\n";;
  				}
                  
                  
                  if (local==6) {
  					
                		friends6[1]=  friends6[1]+actualUser+"\n";
  				}
                  
                  
                  if (local==7) {
  					
                		friends7[1]=  friends7[1]+actualUser+"\n";
  				}
                  
                  if (local==8) {
  					
                		friends8[1]=  friends8[1]+actualUser+"\n";
  				}
                  if (local==9) {
  					
                		friends9[1]=  friends9[1]+actualUser+"\n";;
  				}
                  if (local==10) {
                		friends10[1]=  friends3[1]+actualUser+"\n";
  				}
              
                  
                  
				
				
			    // yes option
			} else {
				
				JOptionPane.showMessageDialog(null, "Okk");
			    // no option
			}
		}
		
		
		
		
		
		
		if (Login.LocalID==2) {
			for (int i = 0; i <findfriendrequest. request2 .length; i++) {
				if (findfriendrequest. request2[i]!= null) {
					JOptionPane.showMessageDialog(null, findfriendrequest. request2[i]+" "+ " ID-->"+" "+i);
					
				}
				
			}
			
			if (JOptionPane.showConfirmDialog(null, "Do you want to accept someone?", "WARNING",
			        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
				
				thisdID=JOptionPane.showInputDialog("Please insert the id request");
				ID=Integer.parseInt(thisdID);
				
				char local = findfriendrequest. request2[ID].charAt(findfriendrequest. request2[ID].length()-1);
		
				friends2[1]=friends2[1]+findfriendrequest. request2[ID]+"\n";
				findfriendrequest. request2[ID]=null;
				
				
				if (local==0) {
					
					friends0[1]=friends0[1]+actualUser+"\n";
				
				}
				
                  if (local==2) {
					
                    friends2[1]= friends2[1]+actualUser+"\n";
					
				}
				
                  if (local==3) {
  					
                		friends3[1]=  friends3[1]+actualUser+"\n";
  				}
                  
                  
                  if (local==4) {
  					
                		friends4[1]=  friends4[1]+actualUser+"\n";
  				}
                  
                  if (local==5) {
  					
                		friends5[1]=  friends5[1]+actualUser+"\n";;
  				}
                  
                  
                  if (local==6) {
  					
                		friends6[1]=  friends6[1]+actualUser+"\n";
  				}
                  
                  
                  if (local==7) {
  					
                		friends7[1]=  friends7[1]+actualUser+"\n";
  				}
                  
                  if (local==8) {
  					
                		friends8[1]=  friends8[1]+actualUser+"\n";
  				}
                  if (local==9) {
  					
                		friends9[1]=  friends9[1]+actualUser+"\n";;
  				}
                  if (local==10) {
                		friends10[1]=  friends3[1]+actualUser+"\n";
  				}
              
                  
                  
				
				
			    // yes option
			} else {
				
				JOptionPane.showMessageDialog(null, "Okk");
			    // no option
			}
		}
		
		
		
		
		
		
		if (Login.LocalID==3) {
			for (int i = 0; i <findfriendrequest. request3 .length; i++) {
				if (findfriendrequest. request3[i]!= null) {
					JOptionPane.showMessageDialog(null, findfriendrequest. request3[i]+" "+ " ID-->"+" "+i);
					
				}
				
			}
			
			if (JOptionPane.showConfirmDialog(null, "Do you want to accept someone?", "WARNING",
			        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
				
				thisdID=JOptionPane.showInputDialog("Please insert the id request");
				ID=Integer.parseInt(thisdID);
				
				char local = findfriendrequest. request3[ID].charAt(findfriendrequest. request3[ID].length()-1);
		
				friends3[1]=friends3[1]+findfriendrequest. request3[ID]+"\n";
				findfriendrequest. request3[ID]=null;
				
				if (local==0) {
					
					friends0[1]=friends0[1]+actualUser+"\n";
				
				}
				
                    if (local==1) {
					
					friends1[1]=friends1[1]+actualUser+"\n";
				
				}
                  if (local==2) {
					
                    friends2[1]= friends2[1]+actualUser+"\n";
					
				}
				
                  if (local==3) {
  					
                		friends3[1]=  friends3[1]+actualUser+"\n";
  				}
                  
                  
                  if (local==4) {
  					
                		friends4[1]=  friends4[1]+actualUser+"\n";
  				}
                  
                  if (local==5) {
  					
                		friends5[1]=  friends5[1]+actualUser+"\n";;
  				}
                  
                  
                  if (local==6) {
  					
                		friends6[1]=  friends6[1]+actualUser+"\n";
  				}
                  
                  
                  if (local==7) {
  					
                		friends7[1]=  friends7[1]+actualUser+"\n";
  				}
                  
                  if (local==8) {
  					
                		friends8[1]=  friends8[1]+actualUser+"\n";
  				}
                  if (local==9) {
  					
                		friends9[1]=  friends9[1]+actualUser+"\n";;
  				}
                  if (local==10) {
                		friends10[1]=  friends3[1]+actualUser+"\n";
  				}
                  
                  
				
				
			    // yes option
			} else {
				
				JOptionPane.showMessageDialog(null, "Okk");
			    // no option
			}
		}
		
		
		
		
		if (Login.LocalID==4) {
			for (int i = 0; i <findfriendrequest. request4 .length; i++) {
				if (findfriendrequest. request4[i]!= null) {
					JOptionPane.showMessageDialog(null, findfriendrequest. request4[i]+" "+ " ID-->"+" "+i);
					
				}
				
			}
			
			if (JOptionPane.showConfirmDialog(null, "Do you want to accept someone?", "WARNING",
			        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
				
				thisdID=JOptionPane.showInputDialog("Please insert the id request");
				ID=Integer.parseInt(thisdID);
				
				char local = findfriendrequest. request4[ID].charAt(findfriendrequest. request4[ID].length()-1);
		
				friends4[1]=friends4[1]+findfriendrequest. request4[ID]+"\n";
				
				findfriendrequest. request4[ID]=null;
				
				if (local==0) {
					
					friends0[1]=friends0[1]+actualUser+"\n";
				
				}
				
                    if (local==1) {
					
					friends1[1]=friends1[1]+actualUser+"\n";
				
				}
                  if (local==2) {
					
                    friends2[1]= friends2[1]+actualUser+"\n";
					
				}
				
                  if (local==3) {
  					
                		friends3[1]=  friends3[1]+actualUser+"\n";
  				}
                  
                  
                  if (local==4) {
  					
                		friends4[1]=  friends4[1]+actualUser+"\n";
  				}
                  
                  if (local==5) {
  					
                		friends5[1]=  friends5[1]+actualUser+"\n";;
  				}
                  
                  
                  if (local==6) {
  					
                		friends6[1]=  friends6[1]+actualUser+"\n";
  				}
                  
                  
                  if (local==7) {
  					
                		friends7[1]=  friends7[1]+actualUser+"\n";
  				}
                  
                  if (local==8) {
  					
                		friends8[1]=  friends8[1]+actualUser+"\n";
  				}
                  if (local==9) {
  					
                		friends9[1]=  friends9[1]+actualUser+"\n";;
  				}
                  if (local==10) {
                		friends10[1]=  friends3[1]+actualUser+"\n";
  				}
              
                  
                  
				
				
			    // yes option
			} else {
				
				JOptionPane.showMessageDialog(null, "Okk");
			    // no option
				
			}
			
		}
			
			
			
			
			
			if (Login.LocalID==5) {
				for (int i = 0; i <findfriendrequest. request5 .length; i++) {
					if (findfriendrequest. request5[i]!= null) {
						JOptionPane.showMessageDialog(null, findfriendrequest. request5[i]+" "+ " ID-->"+" "+i);
						
					}
					
				}
				
				if (JOptionPane.showConfirmDialog(null, "Do you want to accept someone?", "WARNING",
				        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
					
					thisdID=JOptionPane.showInputDialog("Please insert the id request");
					ID=Integer.parseInt(thisdID);
					
					char local = findfriendrequest. request5[ID].charAt(findfriendrequest. request5[ID].length()-1);
			
					friends5[1]=friends5[1]+findfriendrequest. request5[ID]+"\n";
					findfriendrequest. request5[ID]=null;
					if (local==0) {
						
						friends0[1]=friends0[1]+actualUser+"\n";
					
					}
					
                        if (local==1) {
						
						friends1[1]=friends1[1]+actualUser+"\n";
					
					}
	                  if (local==2) {
						
	                    friends2[1]= friends2[1]+actualUser+"\n";
						
					}
					
	                  if (local==3) {
	  					
	                		friends3[1]=  friends3[1]+actualUser+"\n";
	  				}
	                  
	                  
	                  if (local==4) {
	  					
	                		friends4[1]=  friends4[1]+actualUser+"\n";
	  				}
	                  
	                  if (local==5) {
	  					
	                		friends5[1]=  friends5[1]+actualUser+"\n";;
	  				}
	                  
	                  
	                  if (local==6) {
	  					
	                		friends6[1]=  friends6[1]+actualUser+"\n";
	  				}
	                  
	                  
	                  if (local==7) {
	  					
	                		friends7[1]=  friends7[1]+actualUser+"\n";
	  				}
	                  
	                  if (local==8) {
	  					
	                		friends8[1]=  friends8[1]+actualUser+"\n";
	  				}
	                  if (local==9) {
	  					
	                		friends9[1]=  friends9[1]+actualUser+"\n";;
	  				}
	                  if (local==10) {
	                		friends10[1]=  friends3[1]+actualUser+"\n";
	  				}
	                  
	                  
					
					
				    // yes option
				} else {
					
					JOptionPane.showMessageDialog(null, "Okk");
				    // no option
				}
				
			}
				
				
				
				if (Login.LocalID==6) {
					for (int i = 0; i <findfriendrequest. request6 .length; i++) {
						if (findfriendrequest. request6[i]!= null) {
							JOptionPane.showMessageDialog(null, findfriendrequest. request6[i]+" "+ " ID-->"+" "+i);
							
						}
						
					}
					
					if (JOptionPane.showConfirmDialog(null, "Do you want to accept someone?", "WARNING",
					        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
						
						thisdID=JOptionPane.showInputDialog("Please insert the id request");
						ID=Integer.parseInt(thisdID);
						
						char local = findfriendrequest. request6[ID].charAt(findfriendrequest. request6[ID].length()-1);
				
						friends6[1]=friends6[1]+findfriendrequest. request6[ID]+"\n";;
						findfriendrequest. request6[ID]=null;
						
if (local==0) {
							
							friends0[1]=friends0[1]+actualUser+"\n";
						
						}
						
                            if (local==1) {
							
							friends1[1]=friends1[1]+actualUser+"\n";
						
						}
		                  if (local==2) {
							
		                    friends2[1]= friends2[1]+actualUser+"\n";
							
						}
						
		                  if (local==3) {
		  					
		                		friends3[1]=  friends3[1]+actualUser+"\n";
		  				}
		                  
		                  
		                  if (local==4) {
		  					
		                		friends4[1]=  friends4[1]+actualUser+"\n";
		  				}
		                  
		                  if (local==5) {
		  					
		                		friends5[1]=  friends5[1]+actualUser+"\n";;
		  				}
		                  
		                  
		                  if (local==6) {
		  					
		                		friends6[1]=  friends6[1]+actualUser+"\n";
		  				}
		                  
		                  
		                  if (local==7) {
		  					
		                		friends7[1]=  friends7[1]+actualUser+"\n";
		  				}
		                  
		                  if (local==8) {
		  					
		                		friends8[1]=  friends8[1]+actualUser+"\n";
		  				}
		                  if (local==9) {
		  					
		                		friends9[1]=  friends9[1]+actualUser+"\n";;
		  				}
		                  if (local==10) {
		                		friends10[1]=  friends3[1]+actualUser+"\n";
		  				}
							
	
		                  
		                  
						
						
					    // yes option
					} else {
						
						JOptionPane.showMessageDialog(null, "Okk");
					    // no option
					}
				}
				
				
				
				
				
				
				
				if (Login.LocalID==7) {
					for (int i = 0; i <findfriendrequest. request7 .length; i++) {
						if (findfriendrequest. request7[i]!= null) {
							JOptionPane.showMessageDialog(null, findfriendrequest. request7[i]+" "+ " ID-->"+" "+i);
							
						}
						
					}
					
					if (JOptionPane.showConfirmDialog(null, "Do you want to accept someone?", "WARNING",
					        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
						
						thisdID=JOptionPane.showInputDialog("Please insert the id request");
						ID=Integer.parseInt(thisdID);
						
						char local = findfriendrequest. request7[ID].charAt(findfriendrequest. request7[ID].length()-1);
				
						friends7[1]=friends7[1]+findfriendrequest. request7[ID]+"\n";
						findfriendrequest. request7[ID]=null;
						
                        
						if (local==0) {
							
							friends0[1]=friends0[1]+actualUser+"\n";
						
						}
						
                            if (local==1) {
							
							friends1[1]=friends1[1]+actualUser+"\n";
						
						}
		                  if (local==2) {
							
		                    friends2[1]= friends2[1]+actualUser+"\n";
							
						}
						
		                  if (local==3) {
		  					
		                		friends3[1]=  friends3[1]+actualUser+"\n";
		  				}
		                  
		                  
		                  if (local==4) {
		  					
		                		friends4[1]=  friends4[1]+actualUser+"\n";
		  				}
		                  
		                  if (local==5) {
		  					
		                		friends5[1]=  friends5[1]+actualUser+"\n";;
		  				}
		                  
		                  
		                  if (local==6) {
		  					
		                		friends6[1]=  friends6[1]+actualUser+"\n";
		  				}
		                  
		                  
		                  if (local==7) {
		  					
		                		friends7[1]=  friends7[1]+actualUser+"\n";
		  				}
		                  
		                  if (local==8) {
		  					
		                		friends8[1]=  friends8[1]+actualUser+"\n";
		  				}
		                  if (local==9) {
		  					
		                		friends9[1]=  friends9[1]+actualUser+"\n";;
		  				}
		                  if (local==10) {
		                		friends10[1]=  friends3[1]+actualUser+"\n";
		  				}
		              
		                  
		                  
						
						
					    // yes option
					} else {
						
						JOptionPane.showMessageDialog(null, "Okk");
					    // no option
					}
				}
				
				
				
				
				
				if (Login.LocalID==8) {
					for (int i = 0; i <findfriendrequest. request8 .length; i++) {
						if (findfriendrequest. request8[i]!= null) {
							JOptionPane.showMessageDialog(null, findfriendrequest. request8[i]+" "+ " ID-->"+" "+i);
							
						}
						
					}
					
					if (JOptionPane.showConfirmDialog(null, "Do you want to accept someone?", "WARNING",
					        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
						
						thisdID=JOptionPane.showInputDialog("Please insert the id request");
						ID=Integer.parseInt(thisdID);
						
						char local = findfriendrequest. request8[ID].charAt(findfriendrequest. request8[ID].length()-1);
				
						friends8[1]=friends8[1]+findfriendrequest. request8[ID]+"\n";;
						findfriendrequest. request8[ID]=null;
						

						if (local==0) {
							
							friends0[1]=friends0[1]+actualUser+"\n";
						
						}
						
                            if (local==1) {
							
							friends1[1]=friends1[1]+actualUser+"\n";
						
						}
		                  if (local==2) {
							
		                    friends2[1]= friends2[1]+actualUser+"\n";
							
						}
						
		                  if (local==3) {
		  					
		                		friends3[1]=  friends3[1]+actualUser+"\n";
		  				}
		                  
		                  
		                  if (local==4) {
		  					
		                		friends4[1]=  friends4[1]+actualUser+"\n";
		  				}
		                  
		                  if (local==5) {
		  					
		                		friends5[1]=  friends5[1]+actualUser+"\n";;
		  				}
		                  
		                  
		                  if (local==6) {
		  					
		                		friends6[1]=  friends6[1]+actualUser+"\n";
		  				}
		                  
		                  
		                  if (local==7) {
		  					
		                		friends7[1]=  friends7[1]+actualUser+"\n";
		  				}
		                  
		                  if (local==8) {
		  					
		                		friends8[1]=  friends8[1]+actualUser+"\n";
		  				}
		                  if (local==9) {
		  					
		                		friends9[1]=  friends9[1]+actualUser+"\n";;
		  				}
		                  if (local==10) {
		                		friends10[1]=  friends3[1]+actualUser+"\n";
		  				}
		              
		                  
		                  
						
						
					    // yes option
					} else {
						
						JOptionPane.showMessageDialog(null, "Okk");
					    // no option
					}
				}
				
				
				
				
			}
		

}
