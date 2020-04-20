package dsalgopracticecodes;

import java.util.Scanner;

public class Factorial {
	
	static int factorial(int n) {
		int output;
		if (n==1) {
			return 1;
		}
		output = factorial(n-1)*n;
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		System.out.print("Enter the number:");
		int num = scanner.nextInt();
		int factorial = factorial(num);
		System.out.println("Factorial is:"+factorial);
		

	}

}
