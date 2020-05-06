package dsalgopracticecodes;

import java.util.Scanner;

public class StarPattern {
	
	static void Print(int i) {
		if(i==0) {
			return;
		}
	    System.out.print("*");
		Print(i-1);                                
	}
	
	static void Row(int n , int i) {
		if(n==0) {
			return;
		}
		Print(i);
		System.out.println();
		Row(n-1,i+1);                                //Row(n-1,i-1);{to print the pattern upside down}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the no. of rows: ");
		int num = s.nextInt();                       //Row(num,5);{to print the pattern upside down}
		Row(num,1);
		

	}

}
