package gradedGroupProject.nonPrincipledDesign.v2;

import java.util.List;

public class DeleteBankAccount {
	private int accountNumber;
	private List<Integer> accountNumbers;
	private List<String> accountTypes;
	private List<Boolean> accountVerified;
	private List<Double> accountBalances;
	
	public DeleteBankAccount(int accountNumber, List<Integer> accountNumbers, List<String> accountTypes, List<Boolean> accountVerified, List<Double> accountBalances) {
		this.accountNumber = accountNumber;
		this.accountNumbers = accountNumbers;
		this.accountTypes = accountTypes;
		this.accountVerified = accountVerified;
		this.accountBalances = accountBalances;
		int pos = 0;
		for (pos = 0; pos < this.accountNumbers.size(); ++pos) {
			if (this.accountNumbers.get(pos) == this.accountNumber) {
				break;
				
			}
			
		}

		if (pos >= 0 && pos < this.accountNumbers.size()) {
			this.accountNumbers.remove(pos);
			this.accountTypes.remove(pos);
			this.accountVerified.remove(pos);
			this.accountBalances.remove(pos);
			
		}
		
	}
}
