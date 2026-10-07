public abstract class Account {

        protected String accountNumber;
        protected double balance;

        public Account(String accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        // Concrete method
        public void deposit(double amount) {

            if(amount <= 0){
                System.out.println("Deposit must be greater than zero.");
                return;
            }

            balance += amount;
            System.out.println("Deposited $" + amount);
        }

        // Concrete method
        public double getBalance(){
            return balance;
        }

        // Abstract methods
        public abstract void withdraw(double amount);

        public abstract void endOfMonth();
    }

