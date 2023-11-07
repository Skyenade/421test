package pack1;

public class Q55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int[] num = {1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 8};

        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] == num[j]) {
                    System.out.println("Duplicate value found: " + num[i]);
                }
            }
        }
	}

}
