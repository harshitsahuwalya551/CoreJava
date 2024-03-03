package StringClass;

class BankAccount{
	private int accNo;
	private double balance;
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}

public class PracticeEncapsultaion2 {

	public static void main(String[] args) {
		BankAccount ba = new BankAccount();
		ba.setAccNo(3258);
		ba.setBalance(1500.25);
		
		System.out.println(ba.getAccNo());
		System.out.println(ba.getBalance());
	}

}
