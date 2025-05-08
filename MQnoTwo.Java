public class MQnoTwo {

    static class BankAccount {
        String accountHolderName;
        String accountNumber;
        double balance;

        public BankAccount(String accountHolderName, String accountNumber, double balance) {
            this.accountHolderName = accountHolderName;
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        public void deposit(double amount) {
            balance += amount;
            System.out.println("Deposited: " + amount + ", New Balance: " + balance);
        }

        public void withdraw(double amount) {
            if (amount > balance) {
                System.out.println("Insufficient balance. Withdrawal failed.");
            } else {
                balance -= amount;
                System.out.println("Withdrew: " + amount + ", New Balance: " + balance);
            }
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("Khatri", "123456789", 500.00);
        account.deposit(200.00);
        account.withdraw(100.00);
        account.withdraw(700.00);
    }
}
