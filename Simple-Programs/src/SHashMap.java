import java.util.HashMap;


public class SHashMap {
	public static void main(String[] args) {
	
	HashMap<String, String> map = new HashMap<String , String>();
	map.put("Califoenia", "sacremanto");
	map.put("oregon", "salem");
	System.out.println(map);
	
	String cap = map.get("oregon");
	System.out.println("The cap of oregon is " + cap);
	
	}
}
