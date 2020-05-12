package dsalgopracticecodes;

import java.util.Scanner;

public class PIValueConversion {
	
	static String convert(String a, int i) {
		StringBuilder sb = new StringBuilder(a);
		
		if(i==a.length()-1) {
			return sb.toString();
		}
		
		if(sb.charAt(i)=='p' && sb.charAt(i+1)=='i'){
			sb.replace(i, i+2, "3.14");
			return convert(sb.toString(),i+1);
		}
		
		return convert(sb.toString(),i+1);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = s.next();
		System.out.println(convert(str,0));
		

	}

}
