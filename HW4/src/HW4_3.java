import java.util.Scanner;
public class HW4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account[] account = new Account[10];
		for (int index = 0; index < account.length; index++) {
			account[index] = new Account(index, 100);
			/*account[index].setId(index);
			account[index].setBalance(100);*/
		}
		//無窮迴圈保證程式一直執行
		while(true) {
			System.out.print("Enter an id: ");
			Scanner input = new Scanner(System.in);
			int id = input.nextInt();
			boolean exist = true;
			//當對了跳出去,都不對不會進入另一個迴圈
			for (int index = 0; index < account.length; index++) {
				if (id == account[index].getId()) {
					System.out.println();
					break;
				}else if (index == account.length - 1) {
					exist = false;
					System.out.println("enter a correct id");
					System.out.println();
				}
			}
			//都不對不會進入
			while (exist != false) {
				System.out.println("Main menu");
				System.out.println("1: check balance");
				System.out.println("2: withdraw");
				System.out.println("3: deposit");
				System.out.println("4: exit");
				System.out.print("Enter a choice: ");
				int choice = input.nextInt();
				if (choice == 1) {
					System.out.println("The balance is " + account[id].getBalance());
					System.out.println();
				}else if (choice == 2) {
					System.out.print("Enter an amount to withdraw:");					
					double withdraw = input.nextDouble();
					account[id].withdraw(withdraw);
					System.out.println();
				}else if (choice == 3) {
					System.out.print("Enter an amount to deposit:");					
					double deposit = input.nextDouble();
					account[id].deposit(deposit);
					System.out.println();
				}else if(choice == 4) {
					System.out.println();
					break;
				}else {
					System.out.println("only \"1\" '2' '3' '4'");
					System.out.println();
				}
			}
		}		
	}

}
