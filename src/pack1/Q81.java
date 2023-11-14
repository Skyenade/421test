package pack1;

import java.util.Arrays;

public class Q81 {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 5, 6};
        
        System.out.println("Original Array: ");
        printArray(array);
        
        sortMaxMinAlternately(array);
        
        System.out.println("\nArray after sorting alternately: ");
        printArray(array);
    }

    public static void sortMaxMinAlternately(int[] array) {
        int n = array.length;
        int[] tempArray = Arrays.copyOf(array, n);

        Arrays.sort(tempArray);

        int left = 0, right = n - 1;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                array[i] = tempArray[right];
                right--;
            } else {
                array[i] = tempArray[left];
                left++;
            }
        }
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
