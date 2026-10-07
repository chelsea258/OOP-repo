
    public class SavingsAccount extends Account {

        private double minimumBalance;
        private final double INTEREST_RATE = 0.05;

        public SavingsAccount(String accountNumber,
                              double balance,
                              double minimumBalance) {

            super(accountNumber, balance);
            this.minimumBalance = minimumBalance;
        }

        @Override
        public void withdraw(double amount) {

            if(balance - amount < minimumBalance){
                System.out.println("Withdrawal rejected! Minimum balance must remain $" + minimumBalance);
            }
            else{
                balance -= amount;
                System.out.println("Savings withdrawal: $" + amount);
            }
        }

        @Override
        public void endOfMonth() {

            balance += balance * INTEREST_RATE;

            System.out.println("Interest added.");
        }
    }

