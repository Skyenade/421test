package nov11;

public class Q71 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {52,65,23,98,70};
		
		boolean check = check(arr);
		
		if(check) {
			System.out.println("The numbers are in the array");
		}
		
	}

	public static boolean check(int[]arr) {
		boolean checker = false;
		
		for(int i = 0;i<arr.length;i++) {
			if (arr[i] == 65 || arr[i] == 70) {
				checker = true;
			}
		}
		return checker;
	}
	
}
