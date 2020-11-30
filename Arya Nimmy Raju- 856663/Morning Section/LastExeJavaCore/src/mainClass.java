import java.util.List;
import java.util.Scanner;


public class mainClass {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		function service =new function();
		String choice;
		
		do {
			System.out.println("Enter your option");
			 choice = s.next();
			switch (choice) {
			case "a": {
				System.out.println("Enter account id : ");
				int accId = s.nextInt();
				s.nextLine();
				System.out.println("Enter account number : ");
				String name = s.next();
				System.out.println("Enter balance : ");
				double amount = s.nextDouble();
				Account account = new Account(accId, name, amount);
				System.out.println(account);
				try {
					service.addAccount(account);
				} catch (AccountAlreadyException e) {
					e.printMessage();
				}
				break;
				
			}
			case "b":{
				System.out.println("Enter the account number you want to remove : ");
				String accNumber = s.next();
				try {
					service.removeAccount(accNumber);
				} catch (AccountNotFoundException e) {
					e.printMessage();
				}
				break;
			}
			case "c":{
				System.out.println("Enter the account number of the account you want to display : ");
				String accNumber = s.next();
				try {
					service.displayAccount(accNumber);
				} catch (AccountNotFoundException e) {
					e.printMessage();
				}
				break;						
			}
			case "d":{
				 System.out.println("All the Account Details");
				 List<Account> a=service.displayAll();
				 for(Account account :a)
				 {
					 account.toString();
				 }
			}
			case "e":{
				service.displayAccountsWithAmountLessThan1000();
				break;
			}
			
			
			}
		} while (choice !="f");
	}

}
