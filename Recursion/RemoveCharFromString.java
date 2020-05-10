package dsalgopracticecodes;

import java.util.Scanner;

public class RemoveCharFromString {
	
	static String remove(String a, String b, int i) {
		
		StringBuilder sb = new StringBuilder(a);
		if(i==a.length()-1) {
			if(sb.charAt(i)==b.charAt(0)) {
				sb.deleteCharAt(i);
			}
			return sb.toString();
		}
		
		
		if(sb.charAt(i)==b.charAt(0)) {
			sb.deleteCharAt(i);
			return remove(sb.toString(),b,i+1);
		}
		 return remove(sb.toString(),b,i+1);
		
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = s.next();
		System.out.print("Enter the character to be removed: ");
		String character = s.next();
		System.out.println("New String: "+remove(str,character,0));
		

	}

}
