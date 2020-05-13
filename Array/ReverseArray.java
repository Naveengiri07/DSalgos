package dsalgopracticecodes;

public class ReverseArray {
	
	public static void main(String[] args) {
		int array[]= {1,2,3,4,5,6,7,8,9};
		
		reverse(array);
		for(int i:array) {
		    System.out.print(i+" ");
		}
	}


    static void reverse(int a[]) {
		int i = 0;
		int j = a.length-1;
		while(i<j) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;
		}
		
   }	

}
