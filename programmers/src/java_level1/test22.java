package java_level1;

public class test22 {
	//문자열 다루기 기본
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
	        
	        // OR
	        
	        if(s.length() == 4 || s.length() == 6){
	            try{
	                int x = Integer.parseInt(s);
	                answer = true;
	            } catch(NumberFormatException e){
	            	answer = false;
	            }
	        }
	        else answer = false;
			
	        System.out.println(answer);
		
	}
}
