package pack1;

public class Q57{
    public static void main(String[] args ){
        String [] ar1 = {"Rio","Brasilia","SP"};
		String [] ar2 = {"Floripa","PA","SP"};
		
		for (int i = 0; i<ar1.length;i++) {
			if(ar1[i] == ar2[i]) {
				System.out.println("Duplicate found: " + ar1[i] + " in index " + i); 
			}
		}
    }
}
