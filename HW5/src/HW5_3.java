import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class HW5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		System.out.println("enter a sequence");
		Integer value = input.nextInt();
		//0時不再輸入
		while(value != 0) {
			list.add(value);
			value = input.nextInt();
		}
		System.out.println("min: " + min(list));

	}
	public static Integer min(ArrayList<Integer> list) {
		Collections.sort(list);//排序
		return list.get(0);//最小值在0
	}


}
