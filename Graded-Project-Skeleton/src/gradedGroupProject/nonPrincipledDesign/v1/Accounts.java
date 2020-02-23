package gradedGroupProject.nonPrincipledDesign.v1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Accounts {
	
	public static final AtomicInteger accountCount = new AtomicInteger( 0 );
	
	public List<Integer> accountNumbers;
	public List<String> accountTypes;
	public List<Boolean> accountVerified;
	public List<Double> accountBalances;

	public int addAccount( String accountType ){

		if( accountType == null || (accountType != null && ! accountType.equals( "primary" ) && ! accountType.equals( "savings" ) ) ) {

			System.err.println( "Error create account transaction" );

			return -1;
		}

		else {

			if( accountNumbers == null ) accountNumbers = new ArrayList<Integer>();
			if( accountTypes == null ) accountTypes = new ArrayList<String>();
			if( accountVerified == null ) accountVerified = new ArrayList<Boolean>();
			if( accountBalances == null ) accountBalances = new ArrayList<Double>();

			accountNumbers.add( accountCount.incrementAndGet() );
			accountTypes.add( accountType );
			accountVerified.add( false );
			accountBalances.add( 0.0 );

			return accountCount.get();
		}
	}

	public boolean askForVerification( int clientID, int accountNumber, String adminName ){

		//Assume we sent a message to bank admin

		return true;
	}

	public void verify( int accountNumber, boolean verified ){

		for( int i = 0; i < accountNumbers.size(); ++i ) if( accountNumbers.get( i ) == accountNumber ) accountVerified.set( i , verified );
	}
	
	public void toPrintAccount( int accountNumber ) {

		for( int i = 0; accountNumbers != null && i < accountNumbers.size(); ++i ) {

			if( accountNumbers.get( i ) == accountNumber ) {

				System.out.println( "\taccountNumber: " + accountNumbers.get( i ) );
				System.out.println( "\taccountType: " + accountTypes.get( i ) );
				System.out.println( "\taccountVerified: " + accountVerified.get( i ) );
				System.out.println( "\taccountBalance: " + accountBalances.get( i ) );
			}
		}
	}

	public void printAccounts() {

		for( int i = 0; accountNumbers != null && i < accountNumbers.size(); ++i ) {

			System.out.println( "\taccountNumber: " + accountNumbers.get( i ) );
			System.out.println( "\taccountType: " + accountTypes.get( i ) );
			System.out.println( "\taccountVerified: " + accountVerified.get( i ) );
			System.out.println( "\taccountBalance: " + accountBalances.get( i ) );
		}
	}

	public void deleteAccount( int accountNumber ) {

		int pos = 0;

		for( pos = 0; pos < accountNumbers.size(); ++pos ) if( accountNumbers.get( pos ) == accountNumber ) break;

		if( pos >= 0 && pos < accountNumbers.size() ) {

			accountNumbers.remove( pos );
			accountTypes.remove( pos );
			accountVerified.remove( pos );
			accountBalances.remove( pos );
		}
	}
	
}
