package helpers;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputHelper {
	public static String getInput(String Prompt) {
		
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
