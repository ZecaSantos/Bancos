package programm;

import java.util.Locale;
import java.util.Scanner;
import entities.Client;

public class App {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();		
		System.out.print("Enter account holder: ");
		String accountHolder = sc.next();
		System.out.print("Is there na initial deposit (y/n): ");
		char option = sc.next().charAt(0);
						
		System.out.print("Enter initial deposit value: ");
		double date = sc.nextDouble();
			
		Client client = new Client(accountNumber, accountHolder, date, option);
			
		System.out.print("Account data: ");
		System.out.printf("Account %.2f, Holder: %.2f, Balance: $ %.2f", client.getAccountNumber(), " ", client.getAccountHolder(), " ", client.getDate());
		
		System.out.print("Enter a deposit value: ");
		System.out.println("Update account date: ");
		System.out.printf("");
		
		System.out.print("Enter a withdraw value: ");
		System.out.println("Update account date: ");
		System.out.printf("");
		

		sc.close();
	}

}
