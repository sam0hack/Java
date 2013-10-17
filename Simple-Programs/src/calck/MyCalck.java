package calck;

import helpers.InputHelper;
import helpers.SimpleMathhelper;


public class MyCalck {
public static void main(String[] args)
{

			String S1 = InputHelper.getInput("Enter First Number: ");
			String a = InputHelper.getInput("What do you want to do: ");
			String S2 = InputHelper.getInput("Enter Secound Number: ");
			double rslt = 0;
			
			if(a.equals("+")){
			
				 rslt = SimpleMathhelper.sumVal(S1, S2);
				
			}
			else if(a.equals("-")){
				
				rslt = SimpleMathhelper.substractVal(S1, S2);
				
				}
	else if(a.equals("*")){
				
				rslt = SimpleMathhelper.multiVal(S1, S2);
				
				}
	else if(a.equals("/")){
		
		rslt = SimpleMathhelper.divideVal(S1, S2);
		
		}
	else if(a.equals("%")){
		
		rslt=SimpleMathhelper.remVal(S1, S2);
		
		}

			else
			{
				System.out.println("UnXpected Value");
			return;
			}
	System.out.println("The Answer is " + rslt);	
}
}



