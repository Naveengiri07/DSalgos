package dsalgopracticecodes;

import java.util.Scanner;

public class ReplaceCharFromString {
	
	static String replace(String a, String b, String c, int i) {
		StringBuilder sb = new StringBuilder(a);
		if(i==a.length()-1) {
			if(sb.charAt(i)==b.charAt(0)) {
				sb.replace(i, i+1, c);
			}
			return sb.toString();
		}
		
		
		if(sb.charAt(i)==b.charAt(0)) {
			sb.replace(i, i+1, c);
			return replace(sb.toString(), b, c,i+1);
		}
		
		return replace(sb.toString(), b, c,i+1);
	}
	

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = s.next();
		System.out.print("Enter the character to be replaced: ");
		String oldChar = s.next();
		System.out.print("Enter the new character: ");
		String newChar = s.next();
		System.out.println("New String: "+replace(str, oldChar, newChar, 0));
		


	}

}
