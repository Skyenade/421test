package pack1;

public class Q63{
	public static void main(String[] args){
	    int [] ar1 = {1,2,3,4,5};
        int [] ar2 = {1,2,3,4,5};
     
        boolean equal = false;
        int count = 0;
      
        while (ar1[count] == ar2[count]){
            equal = true;
            count++;
        }
        System.out.println(equal);		
            
	}
}