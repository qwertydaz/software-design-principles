package gradedGroupProject.nonPrincipledDesign.v2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookAppointment {
	private List<Date> appointments;
	private List<String> bankEmployeesWithAppointments;
	
	public BookAppointment(Date date, String  employeeName){
		if (date == null || employeeName == null) {
			System.err.println("Error book appointment transaction");
			
		}
		else {
			if (appointments == null) {
				appointments = new ArrayList<Date>();
				
			}

			appointments.add(date);
			if (bankEmployeesWithAppointments == null) {
				bankEmployeesWithAppointments = new ArrayList<String>();
				
			}

			bankEmployeesWithAppointments.add(employeeName);
			
		}
		
	}
}
