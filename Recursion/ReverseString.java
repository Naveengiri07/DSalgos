package dsalgopracticecodes;

import java.util.Scanner;

public class ReverseString {
	
	static String reverse = "";
	
	static String reverse(String a, int i) {
		if(a.isEmpty()) {
			return a;
		}
		if(i==-1) {
			return reverse;
		}
		reverse = reverse+a.charAt(i);
		return reverse(a,i-1);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = s.next();
		System.out.println("Reversed String: "+reverse(str,str.length()-1));
		
		

	}

}
