package basicsjava;

public class Partial2 extends Partial{
	public void current() {
		System.out.println("Current");
	}
	public void salary() {
		System.out.println("Salary");
	}
	public static void main(String[] args) {
		Partial2 bank=new Partial2();
		bank.current();
		bank.salary();
		bank.savings();
		
	}

}
