package nov11;

public class Q68 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {1,2,3,4};
		
		int max = findMax(arr);
		int min = findMin(arr);
		int add = 0;
		
		for (int i = 0; i<arr.length;i++) {
			if (arr[i] != max && arr[i] != min) {
				add = add + arr[i];
			}
		}
		
		System.out.println("The sum of the numbers without max and min is " + add);
		}
	
	
		public static int findMax(int[]arr) {
			int maxcounter = arr[0];
			
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] > maxcounter) {
					maxcounter = arr[i];
				}
			}		
			return maxcounter;
		}
	
		public static int findMin(int[]arr) {
			int mincounter = arr[0];
			for (int i = 1; i < arr.length; i++) {
				if (arr[i] < mincounter) {
					mincounter = arr[i];
				}
			}		
			return mincounter;
		}
		
}
