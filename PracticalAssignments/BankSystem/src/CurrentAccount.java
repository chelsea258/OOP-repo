public class CurrentAccount extends Account {

    private double overdraftLimit;
    private final double MONTHLY_FEE = 15;

    public CurrentAccount(String accountNumber,
                          double balance,
                          double overdraftLimit) {

        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {

        if(balance - amount < -overdraftLimit){

            System.out.println("Overdraft limit exceeded!");

        }else{

            balance -= amount;

            System.out.println("Current withdrawal: $" + amount);
        }

    }

    @Override
    public void endOfMonth() {

        balance -= MONTHLY_FEE;

        System.out.println("Monthly fee deducted.");
    }

}