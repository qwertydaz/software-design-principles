package gradedGroupProject.nonPrincipledDesign.v1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class BankAdmin {

	public String name = "Y";

	public List<BankClient> bankClientsToVerify;
	public List<Integer> accountNumbersToVerify;


	public static void main( String[] args ) {

		BankAdmin bankAdmin = new BankAdmin();

		bankAdmin.bankClientsToVerify = new ArrayList<BankClient>();
		bankAdmin.accountNumbersToVerify = new ArrayList<Integer>();

		BankClient bankClient1 = new BankClient( "u1", "p1" );
		int accountNumber1 = bankClient1.addAccount( "primary" );
		bankAdmin.bankClientsToVerify.add( bankClient1 );
		bankAdmin.accountNumbersToVerify.add( accountNumber1 );

		BankClient bankClient2 = new BankClient( "u2", "p2" );
		int accountNumber2 = bankClient2.addAccount( "savings" );
		bankAdmin.bankClientsToVerify.add( bankClient2 );
		bankAdmin.accountNumbersToVerify.add( accountNumber2 );


		print( bankAdmin.bankClientsToVerify );

		for( int i = 0; i < bankAdmin.accountNumbersToVerify.size(); ++i ) {

			int accountNumber = bankAdmin.accountNumbersToVerify.get( i );

			System.out.println( "\nAccount number = " + accountNumber );

			System.out.println( "1. Verify the opening" );
			System.out.println( "2. Do not verify the opening" );
			String choice = read( "choice" );

			if( choice.equals( "1" ) ) bankAdmin.bankClientsToVerify.get( i ).verify( accountNumber, true );//we assume that we are answering to the client with this call
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
