import java.io.*;


public class test {
	

	public static void main(String[] args){
		String S1 = getInput("Enter First Number: ");
		String a = getInput("What do you want to do: ");
		String S2 = getInput("Enter Sound Number: ");
		double d1 = Double.parseDouble(S1);
		double d2 = Double.parseDouble(S2);
		
		if(a.equals("+")){
		
		double rslt= d1 + d2;
		System.out.println(rslt);
		}
		else if(a.equals("-")){
			
			double rslt= d1 - d2;
			System.out.println(rslt);
			}
else if(a.equals("*")){
			
			double rslt= d1 * d2;
			System.out.println(rslt);
			}
else if(a.equals("/")){
	
	double rslt= d1 / d2;
	System.out.println(rslt);
	}
else if(a.equals("%")){
	
	double rslt= d1 % d2;
	System.out.println(rslt);
	}

		else
		{
			System.out.println("UnXpected Value");
		}
	}

	private static String getInput(String Prompt) {
		
		 BufferedReader stdin = new BufferedReader(
				new InputStreamReader(System.in));
		System.out.print(Prompt);
		System.out.flush();
		try{
			return stdin.readLine();
		}catch (Exception e){
			return "ERROR" + e.getMessage();
		}
		}

}
