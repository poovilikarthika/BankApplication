import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       Scanner sc= new Scanner(System.in);
       System.out.println("Enter Name, Password,balance to create a account");
       String name=sc.next();
       String password=sc.next();
       double balance= sc.nextDouble();
       SBI_User user=new SBI_User(name,password,balance);
     System.out.println(" Enter your amount to add");
     int amount=sc.nextInt();
     System.out.println(user.addMoney(amount));

     System.out.println("Enter the amount to withdraw");
     int money= sc.nextInt();
     System.out.println("Enter the password");
     String pass_word= sc.next();
        System.out.println(user.withdrawMoney(money,pass_word));
    }
}