package Org.abc;

import java.util.LinkedHashSet;
import java.util.Set;

public class UserDefindSet {
	public static void main(String[] args) {
		Set<Integer> s = new LinkedHashSet<>();
		s.add(40);
		s.add(50);
		s.add(70);
		
		System.out.println(s);
		int size = s.size();
		System.out.println(size);
	s.add(90);
	System.out.println(s);
	s.remove(50);
	System.out.println(s);
		
	}

}
