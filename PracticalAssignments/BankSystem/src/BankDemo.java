public class BankDemo {

    public static void main(String[] args) {

        Account[] accounts = {

                new SavingsAccount("S001",1000,500),
                new SavingsAccount("S002",700,500),

                new CurrentAccount("C001",500,300),
                new CurrentAccount("C002",200,500)

        };

        System.out.println("===== Initial Transactions =====");

        accounts[0].withdraw(200);

        accounts[1].withdraw(300);

        accounts[2].withdraw(700);

        accounts[3].withdraw(800);

        System.out.println();

        System.out.println("===== End Of Month =====");

        for(Account account : accounts){

            account.endOfMonth();

            System.out.println("Balance = $" + account.getBalance());

            System.out.println("---------------------");
        }

    }

}
