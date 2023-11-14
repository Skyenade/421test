package pack1;

public class Q82 {
    public static void main(String[] args) {
        int[] array = {0, 1, 0, 1, 1, 0, 0, 1, 1, 0};
        
        System.out.println("Original Array: ");
        printArray(array);
        
        separateZerosAndOnes(array);
        
        System.out.println("\nArray after separating 0s and 1s: ");
        printArray(array);
    }

    public static void separateZerosAndOnes(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            while (array[left] == 0 && left < right) {
                left++;
            }

            while (array[right] == 1 && left < right) {
                right--;
            }

            if (left < right) {
                array[left] = 0;
                array[right] = 1;
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
