package dsalgopracticecodes;

import java.util.Scanner;

public class StringToIntConversion {
	
	static double convert(String a) {
		if(a.length()==0) {
			return 0;
		}
		
		return((a.charAt(0)-'0')*Math.pow(10, a.length()-1)+convert(a.substring(1)));
	}
	

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = s.next();
		System.out.println("Interger value: "+(int)convert(str));
		
		
		

	}

}
