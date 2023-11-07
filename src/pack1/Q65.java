package pack1;

public class Q65{
	public static void main(String[] args){
		int[] array = {1, 0, 2, 0, 3, 0, 4, 5, 0};
        
        int length = array.length;
        int nonZeroCount = 0;
        
        // Move all non-zero elements to the front
        for (int i = 0; i < length; i++) {
            if (array[i] != 0) {
                array[nonZeroCount] = array[i];
                nonZeroCount++;
            }
        }
	}
}