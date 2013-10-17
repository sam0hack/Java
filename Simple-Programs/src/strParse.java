
public class strParse {
	public static void main(String[] args) {
	String s1= "Welcome to my world";
	String s2= s1.trim();
	int pos = s2.indexOf("world");
	System.out.println(pos);
	String sub= s1.substring(14);
	
	System.out.println(sub);
	}
}
