package nov11;

public class Q52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = { 1, 2, 3, 4, 6, 6, 7, 8, 9 };

		for (int i = 0; i < arr1.length; i++) {
			if (i == 4) {
				arr1[i] = 5;
			}
		}

		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}

	}

}
