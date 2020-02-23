package gradedGroupProject.nonPrincipledDesign.v2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookAppointment {
	private Date date;
	private String employeeName;
	private List<Date> appointments;
	private List<String> bankEmployeesWithAppointments;
	
	public BookAppointment(Date date, String employeeName, List<Date> appointments, List<String> bankEmployeesWithAppointments) {
		this.date = date;
		this.employeeName = employeeName;
		this.appointments = appointments;
		this.bankEmployeesWithAppointments = bankEmployeesWithAppointments;
		if (this.date == null || this.employeeName == null) {
			System.err.println("Error book appointment transaction");
			
		}
		else {
			if (this.appointments == null) {
				this.appointments = new ArrayList<Date>();
				
			}

			this.appointments.add(this.date);
			if (this.bankEmployeesWithAppointments == null) {
				this.bankEmployeesWithAppointments = new ArrayList<String>();
				
			}

			this.bankEmployeesWithAppointments.add(this.employeeName);
			
		}
		
	}
}
