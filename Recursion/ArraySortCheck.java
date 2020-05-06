package dsalgopracticecodes;

public class ArraySortCheck {
	
	static boolean check(int a[],int i){
		if(i==a.length-1) {
			return true;
		}
		if(a.length==1) {
			return true;
		}
		if(a[i]>a[i+1]) {
			return false;
		}
		
		return check(a,i+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array1[] = {1,13,2,6,98,36,40};
		int array2[] = {9,15,23,31,47,69};
		
		
		System.out.println(check(array1,0));
		System.out.println(check(array2,0));
		
		

	}

}
