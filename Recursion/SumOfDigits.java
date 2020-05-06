package dsalgopracticecodes;

public class SumOfDigits {
	static int sum_Digits(int n, int sum) {
		if(n==0)
		{return sum;}
		sum+=n%10;
		n=n/10;
		
		return sum_Digits(n,sum);
	
				
	}


public static void main(String[] args){
	sum_Digits(123,0);
	System.out.println(sum_Digits(123,0));
}
}


