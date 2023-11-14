package nov11;

public class Q84 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] array = {1,3,5,7,9};
		
		System.out.println("Original array: ");
		for(int i = 0; i<array.length;i++) {
			System.out.print(i + " ");
		}
		
		elements(array);
		
		System.out.println("\nNew array: ");
		for(int i = 0; i<array.length;i++) {
			System.out.print(i + " ");
		}
		
		
	}
	
	public static void elements(int[] array) {
		int len = array.length;
		int [] newarray = new int [len];
		
		for (int i = 0; i<len; i++) {
			newarray[i] = array[i] + 1;
		}
		
		for (int i = 0; i<array.length;i++) {
			array[i] = newarray[i];
		}
	}
	

}
