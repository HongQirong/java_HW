
public class HW5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] split = new String["ab#1?2#453".length()];
		split = split("ab#12#453", "#");
		for (int index = 0; index < split.length; index++) {
			System.out.println(split[index] + ",");
		}
		split = split("a?b?gf#e", "[?#]");
		
		for (int index = 0; index < split.length; index++) {
			System.out.println(split[index] + ",");
		}
		

	}

	public static String[] split(String s, String regex) {
		int size = 1;
		int origin = 0;
		int store = 0;
		//決定陣列大小
		for(int token = 0; token < regex.length() && s.length() >= 1; token++) {
			for(int repeattoken = 0; repeattoken < s.length(); repeattoken++) {
				if (s.charAt(repeattoken) == regex.charAt(token)) {
					size += 2;
				}
			}
		}
		String[] result = new String[size];
		//找到 regex, 並按順序放入陣列
		for(int repeattoken = 0; repeattoken < s.length(); repeattoken++) {
			for(int token = 0; token < regex.length(); token++) {
				if (s.charAt(repeattoken) == regex.charAt(token)) {
					result[store] = s.substring(origin, repeattoken);
					store += 1;
					if (store >= size) {
						break;
					}
					result[store] = s.substring(repeattoken, repeattoken + 1);
					store += 1;
					origin = repeattoken + 1;
					break;
				}else if(repeattoken == s.length() - 1 && token == regex.length() - 1 && store < size) {
					result[store] = s.substring(origin, repeattoken + 1 );					
				}
			}
			
		}
		return result;
	}
}
