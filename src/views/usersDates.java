package views;
public class usersDates {
	
	
	private String 	id ="";
	private String 	name ="";
	private String 	username=" ";
	public usersDates(String id ,String name , String username ) {
		
		this.name	    =name;
		this.username	=username;
		this.id			=id;
		
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}
	

}

