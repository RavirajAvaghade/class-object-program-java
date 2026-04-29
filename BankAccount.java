package ClassObjectPrograms;

public class BankAccount
{
	public static void main(String[]args)
	{
		Account A1 = new Account(1234,"Raviraj",9999,"current",10000);
		A1.Deposite();
		A1.DisplayBalance();
		A1.Withdraw();
	
	}

}
class Account
{
	public int accountNumber;
	public String accountHolderName;
	public int Balance;
	public String accountType;
	public int Amount;
	public Account(int accountNumber, String accountHolderName,int Balance,String accountType,int Amount)
	{
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.Balance = Balance;
		this.accountType = accountType;
		this.Amount = Amount;
	}
	public void Deposite()
	{
		System.out.println(accountHolderName+ "please Enter Your Amount to Deposite:");
        if (Amount > 0) 
        {
        	 Balance += Amount;
            System.out.println("₹" + Amount + " deposited successfully.");
        } 
        else 
        {
            System.out.println("Invalid deposit amount.");
        }
		
		
	}
	public void Withdraw()
	{
		System.out.println("Your Account is "+accountType+ "Account");
	}
	public void DisplayBalance()
	{
		System.out.println("Your Balance is"  +Balance);
	}
}
