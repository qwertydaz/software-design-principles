package gradedGroupProject.nonPrincipledDesign.v2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class CreateBankAccount {
	private AtomicInteger accountCount;
	private List<Integer> accountNumbers;
	private List<String> accountTypes;
	private List<Boolean> accountVerified;
	private List<Double> accountBalances;
	private int accountNum;
	
	public CreateBankAccount(String accountType) {
		if (accountType == null || (accountType != null && ! accountType.equals("primary") && ! accountType.equals("savings"))) {
			System.err.println("Error create account transaction");
			this.accountNum = -1;
			
		}
		else {
			if (accountNumbers == null) {
				accountNumbers = new ArrayList<Integer>();
				
			}
			
			if (accountTypes == null) {
				accountTypes = new ArrayList<String>();
				
			}
			
			if (accountVerified == null) {
				accountVerified = new ArrayList<Boolean>();
				
			}
			
			if (accountBalances == null) {
				accountBalances = new ArrayList<Double>();
				
			}
			
			accountNumbers.add(accountCount.incrementAndGet());
			accountTypes.add(accountType);
			accountVerified.add(false);
			accountBalances.add(0.0);
			this.accountNum = accountCount.get();
			
		}
		
	}
	
}
