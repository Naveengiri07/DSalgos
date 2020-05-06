package dsalgopracticecodes;

public class Palindrome {
	public static boolean palindrome(String str, int start, int end) {
		{if(start>end) {
			return true;
		}
		
		if(start==end) {
			return true;
		}
		
		if(str.charAt(start)!=str.charAt(end)) {
			return false;
		}
		
		return palindrome(str,++start,--end);
	}
     
  }
	public static void main(String[] args) {
		String str="naveen";
		// TODO Auto-generated method stub
		System.out.println(palindrome("naveen",0, str.length()-1));

	}
}
