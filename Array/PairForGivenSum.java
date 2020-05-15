package dsalgopracticecodes;

import java.util.Scanner;

public class PairForGivenSum {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the required sum: ");
		int sum = s.nextInt();
		int array[] = {2,9,6,3,1,10,9};
		
		int i = 0;
		while(i<array.length-1) {
			int num = sum -array[i];
			int j=0;
			while(j<array.length-1) {
				if(num==array[j]) {
					int number= num;
					System.out.println(number);
				}
				j++;
			}
		i++;
		}
	}

}
