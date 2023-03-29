package views;

public class AllUsersWithDayAndHour extends usersDates {

	
	private String date;
	private String hour;
	
	
	public AllUsersWithDayAndHour(String id ,String name , String username,String date) {
		// TODO Auto-generated constructor stub
		
		  super(id, username, name);
		  
		  this.date= date;
		 ;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getHour() {
		return hour;
	}


	public void setHour(String hour) {
		this.hour = hour;
	}

   
}