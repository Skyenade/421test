package pack1;

public class Q80 {
    public static void main(String[] args) {
        int[] array = {-5, 8, -3, 2, -10, 6, -7, 1};
        
        System.out.println("Original Array: ");
        printArray(array);
        
        arrangePositivesAndNegatives(array);
        
        System.out.println("\nArray after arranging positives and negatives: ");
        printArray(array);
    }

    public static void arrangePositivesAndNegatives(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            // Find the first negative element from the left
            while (left <= right && array[left] >= 0) {
                left++;
            }

            // Find the first positive element from the right
            while (left <= right && array[right] < 0) {
                right--;
            }

            // Swap the positive and negative elements
            if (left <= right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
