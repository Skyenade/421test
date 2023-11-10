package pack1;

public class Q64{
	public static void main(String[] args){
		int [] ar1 = {1,2,3,0,5};
        
        for (int i = 0;i<4; i++){
            if (ar1[i] == 0){
                System.out.println("index " +  i + " is missing ");
            }
        }
	}
}