package dsalgopracticecodes;

public class QuickSort {
	
	static void sort(int arr[], int low, int high) {
		if(low>=high) {
			return;
		}
		int mid = (high+low)/2;
		int pivot = arr[mid];
		int left = low;
		int right = high;
		while(left<=right) {
			while(arr[left]<pivot) {
				left++;
			}
			while(arr[right]>pivot) {
				right--;
			}
			if(left<=right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}
		sort(arr,low,right);
		sort(arr,left,high);
		
	}

	public static void main(String[] args) {
		int array[] = {40,20,50,30,60,10};
		System.out.println("Given Array: ");
		for(int i:array) {
			System.out.print(i+" ");
		}
		sort(array,0,array.length-1);
		System.out.println();
		System.out.println("Sorted Array: ");
		for(int i: array) {
			System.out.print(i+" ");
		}
	}

}
