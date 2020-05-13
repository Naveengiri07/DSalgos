package dsalgopracticecodes;

public class RotateArray {

	public static void main(String[] args) {
		int array[]= {90,1,20,2,4,6,100};
		int temp = array[0];
		array[0]=array[1];
		array[1]= temp;
		reverse1(array);
		reverse2(array);
		for(int i: array) {
			System.out.print(i+" ");
		}
		
	}
	
	static void reverse1(int a[]) {
		int i=2, j=a.length-1;
		while(i<j) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;
		}
	}
	
	static void reverse2(int a[]) {
		int i=0, j=a.length-1;
		while(i<j) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;
		}
	}

}
