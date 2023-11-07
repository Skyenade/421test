package nov11;

public class Q54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 520, 59, 65, 100, 523 };
		int[] arrcopy = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arrcopy[i] + " ");
		}

		int len = arr.length;
		for (int i = 0; i < arr.length; i++) {
			arrcopy[i] = arr[len-1];
			len--;
		}
		
		System.out.println();
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arrcopy[i] + " ");
		}

	}

}
