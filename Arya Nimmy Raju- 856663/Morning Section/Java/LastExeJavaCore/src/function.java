import java.util.ArrayList;
import java.util.List;


public class function {
	List<Account> list = new ArrayList<>();
	
	
	public void addAccount(Account account) throws AccountAlreadyException {
		for(Account acc : list) {
			if(acc.getId() == account.getId()) {
				throw new AccountAlreadyException();
			}
		}
		list.add(account);
		
	}
	
	public void removeAccount(String accNo) throws AccountNotFoundException {
		int count = 0;
		for(Account account : list) {
			if(account.getAccountNumber() == accNo) {
				count = 1;
				list.remove(account);
				System.out.println(account);
			}
		}
		if(count == 0) {
			throw new AccountNotFoundException();
		}
		
	}
	
	public void displayAccount(String accountNumber)throws AccountNotFoundException {
		int count = 0;
		for(Account account : list) {
			if(account.getAccountNumber() == accountNumber) {
				count++;
				System.out.println(account);
			}
		}
		if(count == 0) {
			throw new AccountNotFoundException();
		}
		
	}
	public List<Account> displayAll()
	{
		return list;
	}
	public void displayAccountsWithAmountLessThan1000() {
		for(Account account : list) {
			if(account.getBalance() < 1000) {
				System.out.println(account);
			}
		}
		
	}
	

}
