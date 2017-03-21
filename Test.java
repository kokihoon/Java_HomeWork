package java_homework;

public class Test {
	public static void main(String[] args) {
		Card1 c = new Card1("Heart", 3);
		try {
			Card1 c2 = Card1.class.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Class cObj = c.getClass();
		
		System.out.println(c);
//		System.out.println(c2);
		System.out.println(cObj.getName());
		System.out.println(cObj.toGenericString());
		System.out.println(cObj.toString());
	}
}

class Card1 {
	String kind;
	int num;
	
	Card1() {
		this("space", 1);
	}
	Card1(String kind, int num) {
		this.kind = kind;
		this.num = num;
	}
	
	public String toString() {
		return kind + ":" + num;
	}
}
