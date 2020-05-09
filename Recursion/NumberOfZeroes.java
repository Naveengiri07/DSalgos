package dsalgopracticecodes;

import java.util.Scanner;

public class NumberOfZeroes {
	
	static int count(String a, int i, int count) {
		if(a.length()==i) {
			return count;
		}
		
		if(a.charAt(i)=='0') {
			count++;
		}
		
		return count(a,i+1,count);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = s.nextInt();
		String number = String.valueOf(num);
		System.out.println(count(number,0,0));
	
		

	}

}
