package nov11;

public class Q70 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]arr = {10,20,50,10,60,10};
		
		int addition = sum(arr);
		boolean isSum = true;
		
		if(addition != 30) {
			isSum = false;
		} else {
			System.out.println("The sum is " + addition);
		}
		
		
		
	}

	public static int sum(int[]arr) {
		int add = 0;
		for(int i = 0;i<arr.length;i++) {
			if (arr[i] == 10) {
				add += arr[i];
			}
		}
		
		return add;
	}
}
