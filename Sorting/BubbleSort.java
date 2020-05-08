package dsalgopracticecodes;

public class BubbleSort {
	
	static int[] sort(int a[], int i, int l) {
		if(l==0) {
			return a;
		}
		if(i==l) {
			return sort(a,0,l-1);
		}
		if(a[i]>a[i+1]) {
			int temp = a[i];
			a[i] = a[i+1];
			a[i+1] = temp;
		}
		return sort(a,i+1,l);
		
	}
public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {1,5,7,5,9,13,7,5,7,10};
		System.out.println("Given array");
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		array = sort(array,0,array.length-1);
		System.out.println("Sorted Array");
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
}
