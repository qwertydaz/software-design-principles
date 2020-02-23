package gradedGroupProject.nonPrincipledDesign.v0;

import java.text.ParseException;
import java.util.Date;
import java.util.List;


public class BankEmployee {

	public String name = "X";

	public List<BankClient> bankClientsWithAppointments;
	public List<Date> appointmentDates;


	public static void main( String[] args ) throws ParseException {

		//TODO


			System.out.println( "1. Book it" );
			System.out.println( "2. Do not book it" );

			//bankClient.bookAppointment( date, bankEmployee.name ); //we assume that we answer with this call to the client.
	}
}
