package entities;

public class BusinessAccount extends Account {

		private Double loanLimit;
		
		public BusinessAccount () {
			super ();
		}

		public BusinessAccount(Integer number, String holder, Double balance, Double loanlimite) {
			super(number, holder, balance);
			this.loanLimit = loanlimite;
		}

		public Double getLoanLimite() {
			return loanLimit;
		}

		public void setLoanLimite(Double loanLimite) {
			this.loanLimit = loanLimit;
		}
		
		public void loan (double amount) {
		    if (amount <= loanLimit) {
		    	balance += amount - 10.0;
		    }
		    
		}
}

		    