import java.util.ArrayList;
import java.util.Scanner;

public class HW5_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<String> list1, list2;
		list1 = new ArrayList<>();
		list2 = new ArrayList<>();
		System.out.println("Enter three strings for list1: ");
		for(int i = 0; i < 3; i++) {
			list1.add(input.next());
		}
		System.out.println("Enger three strings for list2: ");
		for(int i = 0; i < 3; i++) {
			list2.add(input.next());
		}
		System.out.print("The combined list is " );
		for(int index = 0; index < 6; index++) {
			
			System.out.print(union(list1, list2).get(index) + "\t");
		}
		

	}
	public static ArrayList<String> union(ArrayList<String> list1, ArrayList<String> list2){
		ArrayList<String> union = list1;
		//list2¬Ò¦blist1«á­±
		for (int index = 0; index < list2.size(); index++) {
			union.add(list2.get(index));

		}
		return union;
	}

}
