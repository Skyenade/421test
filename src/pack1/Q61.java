package pack1;

public class Q61{
	public static void main(String[] args){
		int[] arr1 = {2, 5, 7, 3, 10};
        int[] arr2 = new int[2];
        int maxcount = 0;
        int secondmaxcount = 0;
        
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > maxcount) {
                secondmaxcount = maxcount;
                maxcount = arr1[i];
            } else if (arr1[i] > secondmaxcount) {
                secondmaxcount = arr1[i];
            }
        }

        System.out.println("The biggest number is " + maxcount);
        System.out.println("The second biggest number is " + secondmaxcount
	}
}