package gradedGroupProject.nonPrincipledDesign.v1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class ReadPrint {
	
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

		System.out.println( "Bank Clients:\n" );

		for( int i = 0; bankClients != null && i < bankClients.size(); ++i ) bankClients.get( i ).toPrint();
	}
	
}
