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
	
	public CreateBankAccount(String accountType, List<Integer> accountNumbers, List<String> accountTypes, List<Boolean> accountVerified, List<Double> accountBalances) {
		this.accountNumbers = accountNumbers;
		this.accountTypes = accountTypes;
		this.accountVerified = accountVerified;
		this.accountBalances = accountBalances;
		if (accountType == null || (accountType != null && ! accountType.equals("primary") && ! accountType.equals("savings"))) {
			System.err.println("Error create account transaction");
			this.accountNum = -1;
			
		}
		else {
			if (this.accountNumbers == null) {
				this.accountNumbers = new ArrayList<Integer>();
				
			}
			
			if (this.accountTypes == null) {
				this.accountTypes = new ArrayList<String>();
				
			}
			
			if (this.accountVerified == null) {
				this.accountVerified = new ArrayList<Boolean>();
				
			}
			
			if (this.accountBalances == null) {
				this.accountBalances = new ArrayList<Double>();
				
			}
			
			this.accountNumbers.add(accountCount.incrementAndGet());
			this.accountTypes.add(accountType);
			this.accountVerified.add(false);
			this.accountBalances.add(0.0);
			this.accountNum = accountCount.get();
			
		}
		
	}
	
}
