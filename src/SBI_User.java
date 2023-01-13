import java.util.Objects;
import java.util.UUID;

public class SBI_User implements BankInterface {
    private String name;
    private String account_number;
    private double balance;
    private String password;
    private static double rateOfInterest;

    public SBI_User(String name, String password,double balance) {
        this.name = name;
        this.balance = balance;
        this.password = password;
        this.account_number= String.valueOf(UUID.randomUUID());
        this.rateOfInterest=5.5;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount_number() {
        return account_number;
    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static double getRateOfInterest() {
        return rateOfInterest;
    }

    public static void setRateOfInterest(double rateOfInterest) {
        SBI_User.rateOfInterest = rateOfInterest;
    }


    @Override
    public double checkBalance() {
        return balance;
    }

    @Override
    public String addMoney(int amount) {
        balance=balance+amount;
        return " Your New balance is :"+ balance;
    }

    @Override
    public String withdrawMoney(int amount, String password1) {

        if (Objects.equals(password, password1)) {
            if (amount > balance)
                return "Your Balance is low";
            else {
                balance = balance - amount;
                return "Your Remaining amount is: " + balance;
            }

        }
        return "Your password is worng";
    }

    @Override
    public double calculateInterest(int years) {

           double interest= (balance*years*rateOfInterest)/100;
            return interest;
        }
}

