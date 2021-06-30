package Org.abc;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class UserDefindMap {
	
public static void main(String[] args) {
	
	Map<Integer,Employe> m = new LinkedHashMap<>();
	Employe e1 = new Employe();
	e1.setId(10);
	e1.setName("nikhil");
	e1.setPhone(1234567l);
	
Employe e2 = new Employe();
e2.setId(100);
e2.setName("nikhilReddy");
e2.setPhone(456789);
Employe e3 = new Employe();
e3.setId(1000);
e3.setName("vontarinikhilReddy");
e3.setPhone(8500);

m.put(1, e1);
m.put(2, e2);
m.put(3, e3);

Set<Entry<Integer, Employe>> entrySet = m.entrySet();
for (Entry<Integer, Employe> x : entrySet) {
	System.out.println(x.getKey());
	System.out.println(x.getValue().getId());
	System.out.println(x.getValue().getName());
	System.out.println(x.getValue().getPhone());
	
	
}
	

	
}

}
