package Org.abc;

public class Mood implements SupperMood {
	@Override
	public void test() {
	System.out.println("printing");
	}
	@Override
	public void nikhil() {
		System.out.println("coading");
	}
	@Override
	public void butterfly() {
		System.out.println("heart");
	}
	@Override
	public void cheater() {
	System.out.println("word");
	}
	public static void main(String[] args) {
		
		Mood m = new Mood();
		m.butterfly();
		m.test();
		m.cheater();
		m.nikhil();
	}

}


