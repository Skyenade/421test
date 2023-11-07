package pack1;

public class Q58{
	public static void main (String[] args){
		int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};

        System.out.print("Common elements between the two arrays: ");
        for (int i : array1) {
            for (int j : array2) {
                if (i == j) {
                    System.out.print(i + " ");
                }
            }
        }
	}
}