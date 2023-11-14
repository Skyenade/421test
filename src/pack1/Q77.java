package pack1;

public class Q77 {
    public static void main(String[] args){
        int[] array = {1, 2, 3, 4, 5};
        
        System.out.println("Original Array: ");
        printArray(array);
        
        rotateClockwise(array);
        
        System.out.println("\nArray after cyclically rotating clockwise by one: ");
        printArray(array);
    }

    public static void rotateClockwise(int[] array) {
        if (array.length <= 1) {
            return;
        }

        int lastElement = array[array.length - 1];

        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }

        array[0] = lastElement;
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
    
}
