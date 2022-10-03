package java_level1;

public class test12 {
	// 콜라츠 추측
	public static void main(String[] args) {
		 
		int num = 50;
		int count = 0;
	    int answer = 0;
	        
	     if (num != 0){
	         while(num!=1 && count < 502){
	        	 if(num%2==1){
	        		num = (num*3)+1;
	                count ++;
                }else{
                    num = num/2;
                    count ++;
                }
            }
            if(count >= 501){
                answer = -1;
            }else {
                answer = count;
            }
        } else {
            answer = 0;
        }
	      
	    System.out.println(answer);

	}

}
