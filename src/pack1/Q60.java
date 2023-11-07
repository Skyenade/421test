package pack1;

public class Q60{
    public static void main(String[]args ){
        int[]arr1 = {2,5,7,3,10};
        int[]arr2 = new int [4];
        int i =0;
        int maxcount = arr1[0];
        int secondmaxcount = arr2[0];
        
        for (i = 1; i<4; i++){
            if (arr1[i] > maxcount){
                maxcount = arr1[i];
            }
        }
        
        while(arr1[i] != maxcount){
            i = 0;
            arr2[i] = arr1[i];
            i++;
        }
        
        for (i = 1; i<4; i++){
            if (arr2[i] > secondmaxcount){
                secondmaxcount = arr2[i];
            }
        }
        
        System.out.println("The biggest number is " + maxcount);
        System.out.println("The second biggest number is " + secondmaxcount);
    }
}