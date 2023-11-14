package pack1;

public class Q73 {
    public static void main (String[] args ){
        int[] array = {49, 1, 3, 200, 2, 4, 70, 5};
        int length = longestConsecutiveSequenceLength(array);

        System.out.println("Length of the longest consecutive sequence: " + length);
    }

    public static int longestConsecutiveSequenceLength(int[] array) {
        if (array.length == 0) {
            return 0;
        }

        int maxLength = 1;
        int currentLength = 1;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1] + 1) {
                currentLength++;
            } else if (array[i] != array[i - 1]) {
                currentLength = 1;
            }

            maxLength = Math.max(maxLength, currentLength);
        }

        return maxLength;
    }
}
