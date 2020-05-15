package dsalgopracticecodes;

public class NonRepeatingElement {

	public static void main(String[] args) {
	  int array[] = {1,1,2,2,3,3,4,5,5,6,6,7,7};
	  System.out.println("Non Repeating Number is:");
	  int a = array[0];
	  for(int i=1; i<array.length; i++){
		  a = a^array[i];
	  }
	  System.out.println(a);
	}

}
