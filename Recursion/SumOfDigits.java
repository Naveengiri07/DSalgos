package dsalgopracticecodes;

import java.util.Scanner;

public class SumOfDigits {
	static int sum_Digits(int n, int sum) {
		if(n==0)
		{return sum;}
		sum+=n%10;
		n=n/10;
		
		return sum_Digits(n,sum);
	
				
	}


public static void main(String[] args){
	Scanner s =new Scanner(System.in);
	System.out.print("Enter the number: ");
	int num = s.nextInt();
	
	System.out.println(sum_Digits(num,0));
}
}


