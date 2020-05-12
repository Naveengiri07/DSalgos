package dsalgopracticecodes;

import java.util.Scanner;

public class StarBetweenSameChar {
	
	static String insert(String a) {
		if(a.length()-1==0) {
			return a;
		}
		
		if(a.charAt(0)==a.charAt(1)){
			a=a.charAt(0)+"*"+a.charAt(1)+a.substring(2);
		}
		
		return a.charAt(0)+insert(a.substring(1));
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str = s.next();
		System.out.println(insert(str));
		
		

	}

}
