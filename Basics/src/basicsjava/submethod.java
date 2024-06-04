package basicsjava;

public class submethod {
	public void name() {
		System.out.println("Skr");
	}
	public void age() {
		System.out.println(22);
	}
	public void number() {
		System.out.println(100);
	}
	public static void main(String[]args) {
		submethod obj = new submethod();
		obj.name();
		obj.age();
		obj.number();
	}

}
