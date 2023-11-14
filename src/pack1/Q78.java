package pack1;

public class Q78 {
    public static void main(String[] args ){
        int[] rotatedArray = {5, 6, 7, 8, 9, 1, 2, 3, 4};
        
        int rotationCount = findRotationCount(rotatedArray);
        
        System.out.println("Rotation count in the given rotated sorted array: " + rotationCount);
    }

    public static int findRotationCount(int[] array) {
        int length = array.length;

        // Perform binary search to find the pivot (minimum element)
        int low = 0, high = length - 1;

        while (low <= high) {
            // If the array is sorted, the first element is the minimum
            if (array[low] <= array[high]) {
                return low;
            }

            int mid = (low + high) / 2;
            int next = (mid + 1) % length;
            int prev = (mid + length - 1) % length;

            // Check if mid is the pivot
            if (array[mid] <= array[next] && array[mid] <= array[prev]) {
                return mid;
            }

            // Adjust search space based on whether the pivot is in the left or right half
            if (array[mid] <= array[high]) {
                high = mid - 1;
            } else if (array[mid] >= array[low]) {
                low = mid + 1;
            }
        }

        return -1; // This should not be reached for a valid rotated sorted array
    
    }
    
}
