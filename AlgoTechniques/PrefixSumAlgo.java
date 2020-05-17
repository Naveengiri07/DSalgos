package dsalgopracticecodes;

public class PrefixSumAlgo {
	
	static int  sum(int i, int j) {
		int e[] = prefix();
		int sum = e[i]-e[j];
		return sum;
	}
	
	static int [] prefix() {
		int array[] = {9,8,1,2,3,6,4};
		int sum = 0;
		for(int i=0; i<=array.length-1; i++) {
			sum+=array[i];
			array[i]=sum;
		}
		
		return array;
	}
	
	
	public static void main(String[] args) {
		int firstIndex = 2;
		int lastIndex = 4;
		System.out.println(sum(lastIndex,firstIndex));

	}

}
