package gradedGroupProject.nonPrincipledDesign.v1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Appointments {
	
	public List<Date> appointments;
	public List<String> bankEmployeesWithAppointments;

	public boolean askForSchedulingAppointment( int clientID, Date date, String employeeName ){

		if( date == null || employeeName == null ) {

			System.err.println( "Error schedule appointment transaction" );

			return false;
		}

		else {

			//Assume we sent a message to bank employee

			return true;
		}
	}

	public void bookAppointment( Date date, String  employeeName ){

		if( date == null || employeeName == null ) System.err.println( "Error book appointment transaction" );

		else {

			if( appointments == null ) appointments = new ArrayList<Date>();

			appointments.add( date );


			if( bankEmployeesWithAppointments == null ) bankEmployeesWithAppointments = new ArrayList<String>();

			bankEmployeesWithAppointments.add( employeeName );
		}
	}
}
