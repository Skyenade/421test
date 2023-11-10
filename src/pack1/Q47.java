package pack1;

public class Q47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []arr1 = {1,2,3};
		double average = 0;
		double count = 0;
		for(int i = 0;i<arr1.length;i++) {
			count = count + arr1[i];
		}
		average = count / arr1.length;
		System.out.println("the average is " + average);
	}

}
