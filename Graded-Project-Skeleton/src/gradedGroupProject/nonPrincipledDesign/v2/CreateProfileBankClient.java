package gradedGroupProject.nonPrincipledDesign.v2;

import java.util.Date;

public class CreateProfileBankClient {
	private String name;
	private String address;
	private Date birthDate;
	
	public CreateProfileBankClient(String name, String address, Date birthDate) {
		if (this.name == null || this.address == null || this.birthDate == null) {
			System.err.println("Error create profile transaction");
			
		}
		else {
			this.name = name;
			this.address = address;
			this.birthDate = birthDate;
			
		}
		
	}
	
}
