package basicsjava;

public class Inbad implements Inba {
	public void deep() {
		System.out.println("Deepika");
	}
	public void jo() {
		System.out.println("jo");
	}
	public static void main(String[] args) {
		Inbad ob=new Inbad();
		ob.deep();
		ob.jo();
	}

}
