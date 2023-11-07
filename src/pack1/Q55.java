package nov11;

public class Q55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 520, 59, 65, 100, 523, 59 };
				
		System.out.println();
		
		int samenumber = 0;
		for (int i = 1; i<arr.length; i++) {
			samenumber = arr[i];
			for (int j = 1; j<arr.length; j++) {
				if (arr[i] == samenumber) {
					System.out.print(samenumber);
				} 
			}
		}
		
	}

}
