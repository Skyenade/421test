package pack1;

public class Q76 {
    public static void main(String[] args){
        int [] array = {2,4,1,7,4,9,12,6,8};

        int comb = triangles(array);
        System.out.println("The number of  combinations is " + comb);


    }
    
    public static int triangles(int array[]){
        int combination = 0;

        for (int i = 0; i<array.length;i++){
            for(int j = 0; j<array.length; j++){
                for(int k = 0; k<array.length;k++){
                    if ((array[i] + array[j]) == array[k] ){
                        System.out.println("The sum of " + array[i] + " and " + array[j] + " are the possible triangles of " + array[k]);
                        combination++;
                    } else if ((array[k] + array[j]) == array[i]){
                        System.out.println("The sum of " + array[k] + " and " + array[j] + " are the possible triangles of " + array[i]);
                        combination++;
                    } else if ((array[k] + array[i]) == array[j]){
                        System.out.println("The sum of " + array[k] + " and " + array[i] + " are the possible triangles of " + array[j]);
                        combination++;
                    }
                }
            }
        }
        return combination;
    }
}
