package pack1;

public class Q75 {
    public static void main(String[] args){
        int [] array = {1,2,4,5,6};
        int counting = countTo3(array);
        System.out.println("There are a total of " + counting + " combinations that sum up to 12");


    }

    public static int countTo3(int[]array ){
        int counting  = 0;

        for(int i = 0;i<array.length;i++){
            for(int j = 0;j<array.length; j++){
                for(int k = 0;k<array.length;k++){
                    for(int l = 0;l<array.length;l++){
                        if((array[i] + array[j] + array[k] + array[l]) == 12){
                        counting++;
                        System.out.println("The sum of the elements at the indexes  " + i + ", " + j + ", " + k + " and " + l + " sum up to 12");
                        }
                    }
                }
            }
            
        }

        return counting;
    }
}
