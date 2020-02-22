package gradedGroupProject.nonPrincipledDesign.v1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class BankEmployee {

	public String name = "X";

	public List<BankClient> bankClientsWithAppointments;
	public List<Date> appointmentDates;


	public static void main( String[] args ) throws ParseException {

		BankEmployee bankEmployee = new BankEmployee();

		bankEmployee.bankClientsWithAppointments = new ArrayList<BankClient>();
		bankEmployee.appointmentDates = new ArrayList<Date>();

		BankClient bankClient1 = new BankClient( "u1", "p1" );
		bankClient1.name = "A";
		bankEmployee.bankClientsWithAppointments.add( bankClient1 );
		bankEmployee.appointmentDates.add( new SimpleDateFormat( "dd/MM/yyyy" ).parse( "20/12/2000" ) );

		BankClient bankClient2 = new BankClient( "u2", "p2" );
		bankClient2.name = "B";
		bankEmployee.bankClientsWithAppointments.add( bankClient2 );
		bankEmployee.appointmentDates.add( new SimpleDateFormat( "dd/MM/yyyy" ).parse( "22/12/2000" ) );


		print( bankEmployee.bankClientsWithAppointments );

		for( int i = 0; i < bankEmployee.bankClientsWithAppointments.size(); ++i ) {

			Date date = bankEmployee.appointmentDates.get( i );
			BankClient bankClient = bankEmployee.bankClientsWithAppointments.get( i );

			System.out.println( "\nCandidate date = " + date + " with client = " + bankClient.name );

			System.out.println( "1. Book it" );
			System.out.println( "2. Do not book it" );
			String choice = read( "choice" );

			if( choice.equals( "1" ) ) bankClient.bookAppointment( date, bankEmployee.name ); //we assume that we answer with this call to the client.
		}
	}

	public static String read( String label ) {

		System.out.println( "\nProvide your " + label + ":" );

		System.out.println( ">" );


		BufferedReader input = new BufferedReader( new InputStreamReader( System.in ) );

		String value = null;

		try {

			value = input.readLine();
		}

		catch (IOException ex) { ex.printStackTrace(); }


		return value;
	}

	public static void print( List<BankClient> bankClients ) {

		for( int i = 0; bankClients != null && i < bankClients.size(); ++i ) bankClients.get( i ).toPrint();
	}
}
