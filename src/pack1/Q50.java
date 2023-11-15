package pack1;

public class Q50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] MyArray = { 10, 20, 30, 40, 50 };

		int[] newArray = null;
		int index = -1;
		int remove = 30;

		for (int i = 0; i < MyArray.length; i++) {
			if (MyArray[i] == remove) {
				index = i;
				break;
			}
		}

		while (index != -1) {
			newArray = new int[MyArray.length - 1];
			int newIndex = 0;
			for (int i = 0; i < MyArray.length; i++) {
				if (i != index) {
					newArray[newIndex] = MyArray[i];
					newIndex++;
				}			}
		}

		for (int i = 0; i < MyArray.length; i++) {
			System.out.println("1st array " + MyArray[i]);
		}

		for (int i = 0; i < newArray.length; i++) {
			System.out.println("2nd array " + newArray[i]);
		}		

	}

}
