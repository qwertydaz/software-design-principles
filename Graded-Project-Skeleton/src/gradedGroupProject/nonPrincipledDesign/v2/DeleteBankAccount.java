package gradedGroupProject.nonPrincipledDesign.v2;

import java.util.List;

public class DeleteBankAccount {
	private int accountNumber;
	private List<Integer> accountNumbers;
	private List<String> accountTypes;
	private List<Boolean> accountVerified;
	private List<Double> accountBalances;
	
	public DeleteBankAccount(int accountNumber) {
		this.accountNumber = this.accountNumber;
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
