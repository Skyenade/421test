package pack1;

public class Q83 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] array = {1,2,3,4,5,6,7};
		
		System.out.print("Original array: ");
		for (int num : array) {
			System.out.print(" " + num);
		}
		
		oddeven(array);

		System.out.print("\nNew array: ");
		for (int num : array) {
			System.out.print(" " + num);
		}
		
	}

	public static void oddeven(int [] array) {
		int length = array.length;
		
		int evenCount = 0;
		
		for(int num : array) {
			if(num%2 == 0) {
				evenCount++;
			}
		}
		
		int [] resultArray = new int [length];
		int evenIndex = 0;
		int oddIndex = evenCount;
		
		for(int num : array) {
			if (num%2 == 0) {
				resultArray[evenIndex++] = num;
			} else {
				resultArray[oddIndex++] = num;
			}
			
		}
		
		for(int i = 0; i<length;i++) {
			array[i] = resultArray[i];
		}		
		
	}
}
