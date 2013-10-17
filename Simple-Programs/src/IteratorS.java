import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;


public class IteratorS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>() ;	
		list.add("Hello");
		list.add("Welcome");
		list.add("to");
		list.add("My");
		list.add("world");
		System.out.println(list);
ListIterator<String> li = list.listIterator();
while (li.hasNext()) {
	String value = li.next();
	System.out.println("\n This is Iterator values " +value +"\n");
	
}
		HashMap<String, String> map = new HashMap<String , String>();
		map.put("Califoenia", "sacremanto");
		map.put("oregon", "salem");
		System.out.println(map);
	
   Set<String> keyss = map.keySet();
	
	Iterator<String> itr = keyss.iterator();
	
while (itr.hasNext()) {
	String value = itr.next();
	System.out.println("The cap of " + value + " is " +  map.get(value));
}	
	
	}

}
