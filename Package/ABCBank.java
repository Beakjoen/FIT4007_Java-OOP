package Package;

import java.text.NumberFormat;
import java.util.Locale;

public class ABCBank {
    public class Account {
        private long accountNumber;
        private String accountName;
        private double balance;
        public Account() {
            this.accountNumber = 0;
            this.accountName = "";
            this.balance = 0.0;
        }
        public Account(long accountNumber, String accountName, double balance) {
            this.accountNumber = accountNumber;
            this.accountName = accountName;
            this.balance = balance;
        }
        public long getAccountNumber() {
            return accountNumber;
        }
        public void setAccountNumber(long accountNumber) {
            this.accountNumber = accountNumber;
        }
        public String getAccountName() {
            return accountName;
        }
        public void setAccountName(String accountName) {
            this.accountName = accountName;
        }
        public double getBalance() {
            return balance;
        }   
        public void setBalance(double balance) {
            this.balance = balance;
        }
        @Override
        public String toString() {
            @SuppressWarnings("deprecation")
            Locale localeVN = new Locale("vi", "VN");
            NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(localeVN);
            String formattedBalance = currencyFormatter.format(balance);
            return "Account Number: " + accountNumber + "\n" +
            "Account Name: " + accountName + "\n" +
            "Balance: " + formattedBalance;
        }
    }
}
