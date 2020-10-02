//program to calculate factorial.

import java.util.Scanner; //package included for Scanner

public class Factorial {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in); //taking input
        int[] num = new int[5];
        for(int i=0;i<5;i++) {
            num[i] = sc.nextInt();
            long res = factorial(num[i]);
            System.out.println(res); //printing result
        }
        sc.close();

    }
    public static long factorial(int n) {
        long fact=1;
        for(int i=1;i<=n;i++) {
            fact = fact*i; //calculating factorial
        }
        return fact;
        
    }

}


