package Org.abc;

public class OverLoad {
	
	public void hello(int a) {
		System.out.println("nikhil");
	}
	public void hello(int a, char c) {
	System.out.println("nikhilreddy");
	}
	
	public void hello() {
		System.out.println("vontari nikhilreddy");
	}
	
	public static void main(String[] args) {
		
		OverLoad m = new OverLoad();
		m.hello();
		m.hello(1, 'a');
		m.hello(1);
	
	}
	
	}
	
	

	

