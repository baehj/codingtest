package java_level1;

public class test9 {
	//하샤드 수

	public static void main(String[] args) {
		
		int x = 1;
		int originalX = x;
		boolean answer = false;
        int sum = 0;
        while(x != 0){
            int s = x%10;
            sum = sum + s;
            x = x/10;
        }
        
        if (sum != 0 && originalX%sum == 0){
        	answer = true;
        }
        System.out.println(answer);
        
	}

}
