package pack1;

public class Q72{
    public static void main(String[] args){
        int[] array = {20, 20, 30, 40, 50, 50, 50};
        int newLength = removeDuplicates(array);
        
        System.out.println("New length of the array: " + newLength);
    }

    public static int removeDuplicates(int[] array) {
        if (array.length == 0) {
            return 0;
        }

        int uniqueIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[uniqueIndex]) {
                uniqueIndex++;
                array[uniqueIndex] = array[i];
            }
        }

        return uniqueIndex + 1;
    } 
}