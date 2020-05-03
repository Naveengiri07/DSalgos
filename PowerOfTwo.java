package dsalgopracticecodes;

import java.util.Scanner;

public class PowerOfTwo {
	
	
	static int Power(int n) {
		if(n==0) {
			return 1;
		}
		int output;
		output = 2*Power(n-1);
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the power of 2: ");
		int power = s.nextInt();
		int answer = Power(power);
		System.out.println("Answer is "+answer);

	}
}

