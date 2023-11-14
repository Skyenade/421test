package pack1;

public class Q74 {
    public static void main(String[] args ){
        int [] array = {1,2,4,5,6};
        int counting = countTo3(array);
        System.out.println("There are a total of " + counting + " combinations that sum up to 6");


    }

    public static int countTo3(int[]array ){
        int counting  = 0;

        for(int i = 0;i<array.length;i++){
            for(int j = 0;j<array.length; j++){
                if((array[i] + array[j]) == 6){
                counting++;
                System.out.println("The sum of the elements at the index " + i + " and at the index " + j + " sum to 6");
                }
            }
            
        }

        return counting;
    }
    
}
