import java.util.ArrayList;
public class MYArrayList {

	public static void main(String[] args) {
ArrayList<String> list = new ArrayList<String>() ;	
list.add("Hello");
list.add("Welcome");
list.add("to");
list.add("My");
list.add("world");
System.out.println(list);

int pos = list.indexOf("Welcome");
System.out.println(pos);

String st = list.get(4); 	
System.out.println(st);

list.remove("to");
System.out.println(list);
	
	}

}
