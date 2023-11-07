package pack1;

public class Q56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        String[] strings = {"apple", "banana", "cherry", "apple", "date", "banana"};

        for (int i = 0; i < strings.length; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                if (strings[i].equals(strings[j])) {
                    System.out.println("Duplicate string found: " + strings[i]);
                }
            }
        }
	}

}