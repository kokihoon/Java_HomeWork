package java_homework;

public class W06P01 {
	public static void main(String[] args) {
		Member member = new Member("KSM-1234");
		member.chargeMoney(30000);
		try {
			member.buy(new Product("A4 (1 box)", 20000));
		} catch(Exception e){}
		try {
			member.buy(new Product("keyboard", 10000));
		} catch(Exception e){}
		try {
			member.buy(new Product("HDMI cable", 5000));
		} catch(Exception e){}
		try {
			member.buy(new Product("Eraser", 1000));
		} catch(Exception e){}
		System.out.println(member);
	}
}
class Product {
	String Product_name;
	int money;

	public Product(String Product_name, int money) {
		this.Product_name = Product_name;
		this.money = money;
	}
}
class Member{
	int count  = 0;
	String member;
	int money;
	Product pro = new Product("", 1);
	public Member(String member) {
		this.member = member;
	}
	public void buy(Product product) {
		if(product.money < this.money){
			count++;
			this.money -= product.money;
			this.money += (product.money*0.1);
			pro.Product_name = product.Product_name;
			pro.money = product.money;
		}
	}
	public String toString() {
		return "회원ID : " + member +"\n잔고 : " + money+ "\n거래횟수 : "+ count + "\n최근구매상품 : ["+pro.Product_name+","+pro.money+"]";
	}
	public void chargeMoney(int money) {
		this.money += money;
	}
	
}