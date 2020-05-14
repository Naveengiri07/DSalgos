package dsalgopracticecodes;

public class ZigZagArray {
	
	static void arrange(int a[]) {
	int i=0;
	while(i<a.length-1) {
		if(i%2==0) {
		   if(a[i]>a[i+1]) {
			int temp = a[i];
		        a[i]=a[i+1];
			a[i+1]=temp;
		    }
		}
		else{
		   if(a[i]<a[i+1]) {
		       int temp = a[i];
		       a[i]=a[i+1];
		       a[i+1]=temp;
		    }
	        }
		i++;
	  }
      }

      public static void main(String[] args) {
		int array[] = {4,3,7,8,6,2,1};
		arrange(array);
		for(int i:array) {
			System.out.print(i+" ");
		}
       }
}
