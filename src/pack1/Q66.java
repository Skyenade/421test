package nov11;

public class Q66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {1,2,3,4,5,6,7,8,9,10,11};
		
		System.out.println("The amount of even numbers is: " + evenCount(arr));
		System.out.println("The amount of odd numbers is: " + oddCount(arr));
		
	}

	public static int evenCount(int[]arr) {
		int len = arr.length;
		int ecount = 0;
		for (int i = 0; i<len;i++) {
			if(arr[i] %2 == 0) {
				ecount++;
			}
		}		
		return ecount;
	}
	
	public static int oddCount(int[]arr) {
		int len = arr.length;
		int ocount = 0;
		for (int i = 0; i<len;i++) {
			if(arr[i] %2 != 0) {
				ocount++;
			}
		}	
		return ocount;
	}
	
}
