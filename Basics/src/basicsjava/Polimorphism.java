package basicsjava;

public class Polimorphism {
	
	public void studentdetail(String name) {
		System.out.print(name);
	}
	public void studentdetail(int mobile) {
		System.out.print(mobile);
	}
	public void studentdetail(short age) {
		System.out.print(age);
	}
	public void studentdetail(char intial ) {
		System.out.print(intial);
	}
	public static void main(String[]args) {
		System.out.println("name"+" mbl"+"   age"+" initial");
		Polimorphism student=new Polimorphism();
		student.studentdetail("Kar");
		student.studentdetail(" 63820");
		student.studentdetail(" 25");
		student.studentdetail("  K");
	}

}
