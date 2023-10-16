package CodeAlpha_Task;

import java.util.Scanner;

public class Simple_Banking_Application {
	
	    public static void main(String[] args) {
	        double balance = 5000.0;  
	        Scanner scanner = new Scanner(System.in);
	        int choice;

	        do {
	            System.out.println("Choose an option:");
	            System.out.println("1. Deposit");
	            System.out.println("2. Withdraw");
	            System.out.println("3. Check Balance");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter the deposit amount: ");
	                    double depositAmount = scanner.nextDouble();
	                    balance += depositAmount;
	                    break;
	                case 2:
	                    System.out.print("Enter the withdrawal amount: ");
	                    double withdrawalAmount = scanner.nextDouble();
	                    if (withdrawalAmount <= balance) {
	                        balance -= withdrawalAmount;
	                    } else {
	                        System.out.println("Insufficient balance!");
	                    }
	                    break;
	                case 3:
	                    System.out.println("Balance: " + balance);
	                    break;
	                case 4:
	                    System.out.println("Exiting the program. Goodbye!");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        } while (choice != 4);
	        
	        scanner.close();
	    }
	}
