package dsalgopracticecodes;

import java.util.Scanner;

public class FirstOccurance {
	
	static int findIndex(int a[], int i, int value) {
		if(a.length==i) {
			return -1;
		}
		if(a[i]==value) {
			return i;
		}
		int answer = findIndex(a,i+1,value);
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the value: ");
		int element = s.nextInt();
		int array[] = {1,5,7,18,9,13,7,12,7,10};
		System.out.println(findIndex(array,0,element));
		
	}

}
