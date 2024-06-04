package basicsjava;

public class Task1a implements Task1 {
	public void addition() {
		int a=5;
		int b=7;
		System.out.println(a+b);
	}
	public void subtraction() {
		int a =5;
		int b=7;
		System.out.println(a-b);
	}
	public void multiplication() {
		int a=5;
		int b=7;
		System.out.println(a*b);
	}
	public void division() { 
		int a=4;
		int b=2;
		System.out.println(a/b);
	}
	public void modulo() {
		int a=4;
		int b=2;
		System.out.println(a%b);
	}
	public static void main(String[]args) {
		Task1a obj=new Task1a();
		obj.addition();
		obj.subtraction();
		obj.multiplication();
		obj.division();
		obj.modulo();
	}

}
