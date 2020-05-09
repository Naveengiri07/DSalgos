package dsalgopracticecodes;

import java.util.Scanner;

public class SumOfGPSeries {
	
	static int sum = 0;
	
	static int sum(int a, int r, int n) {
		if(a==0) {
			return 0;
		}
		
		if(n==0) {
			return -1;
		}
		sum = sum+a;
		sum(a*r, r, n-1);
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the first element of GP series: ");
		int a = s.nextInt();
		System.out.print("Enter the commom ratio: ");
		int r = s.nextInt();
		System.out.print("Enter the number of elements: ");
		int n = s.nextInt();
		
		System.out.println(sum(a,r,n));
	}

}
