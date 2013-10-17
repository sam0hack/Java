
public class Throws {
	public static void main(String[] args){
	try {
		myexthrow();
	} catch (ArrayIndexOutOfBoundsException e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
		System.out.println("This App having ERROR");
	}
	}

	public static void myexthrow()
	 throws ArrayIndexOutOfBoundsException{
		String[] myAry = {"Hello"};
		System.out.println(myAry[1]);
	}
	
}
