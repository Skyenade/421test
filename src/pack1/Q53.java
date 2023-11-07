package nov11;

public class Q53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 520, 59, 65, 100, 523 };
		int maxcounter = 0;
		int mincounter = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > maxcounter) {
				maxcounter = arr[i];
			}
		}
		System.out.println("The max number is " + maxcounter);

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < mincounter) {
				mincounter = arr[i];
			}
		}
		System.out.println("The min number is " + mincounter);

	}

}
