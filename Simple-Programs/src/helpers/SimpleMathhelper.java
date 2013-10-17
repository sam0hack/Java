package helpers;

public class SimpleMathhelper {
	
	public static double sumVal(String S1, String S2)
	{
		double d1 = Double.parseDouble(S1);
		double d2 = Double.parseDouble(S2);
		double rslt= d1 + d2;
		return rslt;
	}
	
	public static double substractVal(String S1, String S2)
	{
		double d1 = Double.parseDouble(S1);
		double d2 = Double.parseDouble(S2);
		double rslt= d1 - d2;
		return rslt;
	}
	
	public static double multiVal(String S1, String S2)
	{
		double d1 = Double.parseDouble(S1);
		double d2 = Double.parseDouble(S2);
		double rslt= d1 * d2;
		return rslt;
	}
	
	public static double divideVal(String S1, String S2)
	{
		double d1 = Double.parseDouble(S1);
		double d2 = Double.parseDouble(S2);
		double rslt= d1 / d2;
		return rslt;
	}
	
	public static double remVal(String S1, String S2)
	{
		double d1 = Double.parseDouble(S1);
		double d2 = Double.parseDouble(S2);
		double rslt= d1 % d2;
		return rslt;
	}
	
	
}
