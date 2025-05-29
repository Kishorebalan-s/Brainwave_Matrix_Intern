import java.util.Scanner; 
 
public class SimpleATM { 
    public static void main(String[] args) {         Scanner scanner = new Scanner(System.in);         int balance = 1000; // starting balance         int choice; 
 
        while (true) { 
            System.out.println("\n*** ATM Menu ***"); 
            System.out.println("1. Check Balance"); 
            System.out.println("2. Deposit"); 
            System.out.println("3. Withdraw"); 
            System.out.println("4. Exit"); 
            System.out.print("Enter your choice: ");             choice = scanner.nextInt(); 
 
            switch (choice) {                 case 1: 
                    System.out.println("Your balance: $" + balance); 
                    break;                 case 2: 
                    System.out.print("Enter amount to deposit: ");                     int deposit = scanner.nextInt();                     balance += deposit; 
                    System.out.println("Deposited: $" + deposit); 
                    break;                 case 3: 
                    System.out.print("Enter amount to withdraw: ");                     int withdraw = scanner.nextInt();                     if (withdraw <= balance) {                         balance -= withdraw;                         System.out.println("Withdrawn: $" + withdraw); 
                    } else { 
                        System.out.println("Insufficient balance."); 
                    }                     break;                 case 4: 
                    System.out.println("Thank you for using the ATM!"); 
                    scanner.close();                     return;                 default: 
                    System.out.println("Invalid choice. Try again."); 
            } 
        } 
    } 
} 
 
