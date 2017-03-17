package java_homework;

public class W06P04 {
	public static void main(String[] s) {
		int sum = 0;
		for(String s1 : s) {
			try {
				sum += Integer.parseInt(s1);
				
			}catch(Exception e) {
				
			}
		}
		System.out.println(sum);
	}
}
