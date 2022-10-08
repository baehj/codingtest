package java_level1;

public class test22 {
	public static void main(String[] args) {
		
			String s = "a234";
	        boolean answer = false;
	        char[] sChar = s.toCharArray();
	        if(sChar.length == 4 || sChar.length == 6){
	            for(int i=0; i<sChar.length; i++){
	                if ( sChar[i]-'0' >= 0 && sChar[i]-'0' < 10){
	                    answer = true;    
	                } else {
	                    answer = false;
	                    break;
	                }
	            }
	        }
	        System.out.println(answer);
		
	}
}
