package gradedGroupProject.nonPrincipledDesign.v2;

import java.util.Date;

public class ChangeBankClientDetails {
	private String name;
	private String address;
	private Date birthDate;
	private String username;
	private String password;
	
	public ChangeBankClientDetails(String name, String address, Date birthDate, String username, String password){
		if (name == null || address == null || birthDate == null || username == null || password == null) {
			System.err.println("Error change details transaction");
			
		}
		else {
			this.name = name;
			this.address = address;
			this.birthDate = birthDate;
			this.username = username;
			this.password = password;
			
		}
		
	}
}
