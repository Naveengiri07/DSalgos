package dsalgopracticecodes;

public class DutchNationalFlag {

	public static void main(String[] args) {
			int a[]= {0,1,2,0,2,0,1};
			System.out.print("Given Array ");
	 		for(int i:a) {
	 			System.out.print(" "+i);
	 		}
	 		System.out.println();
	 		dNF(a);
	 		System.out.print("Sorted Array ");
	 		for(int i:a) {
	 			System.out.print(" "+i);
	 		}
	 		
	 }
		static void dNF(int a[]){
				int low = 0 , mid = 0;
				int high = a.length-1;
				while(mid<=high) {
					switch(a[mid]) {
					case 0:
						swap(a,low,mid);
						low++;
						mid++;
						break;
					case 1:
						mid++;
						break;
					case 2:
						swap(a,mid, high);
						high--;
						break;
					}
				}
			}

		static void swap(int a[],int first, int second) {
			int t = a[first];
			a[first] = a[second];
			a[second] = t;
		}

	}


