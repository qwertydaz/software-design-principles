package gradedGroupProject.nonPrincipledDesign.v2;

import java.util.List;

public class MoneyTransfer {
	private int fromAccountNumber;
	private int toAccountNumber;
	private double amount;
	private List<Integer> accountNumbers;
	private List<String> accountTypes;
	private List<Boolean> accountVerified;
	private List<Double> accountBalances;
	
	public MoneyTransfer(int fromAccountNumber, int toAccountNumber, double amount, List<Integer> accountNumbers, List<String> accountTypes, List<Boolean> accountVerified, List<Double> accountBalances) {
		this.fromAccountNumber = fromAccountNumber;
		
		this.accountNumbers = accountNumbers;
		this.accountTypes = accountTypes;
		this.accountVerified = accountVerified;
		this.accountBalances = accountBalances;
		
		int from = 0;
		for (from = 0; from < this.accountNumbers.size(); ++from) {
			if (this.accountNumbers.get(from) == this.fromAccountNumber) {
				System.out.println("\tFrom accountNumber: " + this.accountNumbers.get(from));
				System.out.println("\ttFrom accountType: " + this.accountTypes.get(from));
				System.out.println("\ttFrom accountVerified: " + this.accountVerified.get(from));
				System.out.println("\ttFrom accountBalance: " + this.accountBalances.get(from));
				
			}
			
		}

		int to = 0;
		for (to = 0; to < this.accountNumbers.size(); ++to) {
			if (this.accountNumbers.get(to) == this.toAccountNumber) {
				System.out.println("\tTo accountNumber: " + this.accountNumbers.get(to));
				System.out.println("\tTo accountType: " + this.accountTypes.get(to));
				System.out.println("\tTo accountVerified: " + this.accountVerified.get(to));
				System.out.println("\tTo accountBalance: " + this.accountBalances.get(to));
				
			}
			
		}

		if (from >= 0 && from < this.accountNumbers.size() && to >= 0 && to < this.accountNumbers.size() && this.accountBalances.get(from) >= this.amount) {
			this.accountBalances.set(from, this.accountBalances.get(from) - this.amount);
			this.accountBalances.set(to, this.accountBalances.get(to) + this.amount);
			System.out.println("Transfer is completed");
			
		}
		else {
			System.out.println("Transfer cannot be made");
			
		}
		
	}
}
