import java.util.Date;
public class HW4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account(1122,20000);
		account.setAnnualInterestRate(0.045);
		account.withdraw(2500);
		account.deposit(3000);
		System.out.println("balance:" + account.getBalance() + "\n" + "monthly interest:" + account.getMonthlyInterest() + "\n" + "date:" + account.getDateCreated());
	}

}
class Account {
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated = new Date();//���o�{�b�������@�إ߱i�����
	Account(){
		
	}
	Account(int id, double balance){
		this.id = id;
		this.balance = balance;
	}
	int getId() {
		return this.id;
	}
	double getBalance() {
		return this.balance;
	}
	double getAnnualInterestRate() {
		return this.annualInterestRate;
	}
	void setId(int id) {
		this.id = id;
	}
	void setBalance(double balance) {
		this.balance = balance;
	}
	void setAnnualInterestRate(Double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	String getDateCreated() {
		return dateCreated.toString();//�إߪ�����H��r��X
	}
	double getMonthlyInterestRate() {
		return annualInterestRate/12;
	}
	double getMonthlyInterest() {
		return balance * getMonthlyInterestRate();//�b��l�B*�C�Ӥ몺�Q�v=�C��Q��
	}
	void withdraw(double withdraw) {
		balance -= withdraw;//�l�B����⪺��
	}
	void deposit(double deposit) {
		balance += deposit;
	}
}
