
public class TwoDArray {

	public static void main(String[] args) {
String[][] states = new String[4][2];
states[0][0] = "California";

states[0][1]= "sacramento";

states[1][0] = "Oregon";

states[1][1]= "Salem";
		
states[2][0] = "Washington";

states[2][1]= "Olympia";

states[3][0] = "Extra";

states[3][1]= "VALUE";


for (int i = 0; i < states.length; i++) {
	StringBuilder sb = new StringBuilder();
	for (int j = 0; j < states[i].length; j++) {
		if (j == 0) {
			sb.append("The State of ");
		}
		else{
			sb.append(" is " );
		}
		sb.append(states[i][j]);
	}
System.out.println(sb);

}
//	for (int i = 0; i < states.length; i++) {
//		//System.out.println(i);
//		for (int j = 0; j < states[i].length; j++) {
//			System.out.println(states[i][j]);
//		}
//	}	

	}

}
