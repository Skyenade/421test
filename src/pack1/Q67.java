package nov11;

public class Q67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		int [] arr = {1,2,3,4,5,6,7,8,9,10,11};
	
		int maxOfArray = findMax(arr);
		int minOfArray = findMin(arr);
		
		System.out.println("Max is " + maxOfArray);
		System.out.println("Min is " + minOfArray);
		
		int difference = maxOfArray - minOfArray;
		
		System.out.println("The difference between max and min is " + difference);
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
