package pack1;

import java.util.Arrays;

public class Q59{
	public static void main(String[] args){
		
		int[] array = {2,4,6,8,10,12,14,15,16,16,17};

        System.out.println("Original Array: " + Arrays.toString(array));

        Arrays.sort(array);

        int uniqueCount = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1]) {
                array[uniqueCount++] = array[i];
            }
        }

        array[uniqueCount++] = array[array.length - 1];

        int[] uniqueArray = Arrays.copyOf(array, uniqueCount);

        System.out.println("Array with Duplicates Removed: " + Arrays.toString(uniqueArray));

	}
}