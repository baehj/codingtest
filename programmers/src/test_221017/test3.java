package test_221017;

public class test3 {

	public static void main(String[] args) {
		long n= 7;
		long []answer = {0,0};
        long count = n/7;
        
        if(n%7 == 0){
            answer[0] = count*2;
            answer[1] = count*2; 
        }else if(n%7 == 1){
            answer[0] = count*2;
            answer[1] = count*2+1;
        }else if(n%7 == 2){
            answer[0] = count*2;
            answer[1] = count*2+2;
        }else if(n%7 == 3){
            answer[0] = count*2;
            answer[1] = count*2+2;
        }else if(n%7 == 4){
            answer[0] = count*2;
            answer[1] = count*2+2;
        }else if(n%7 == 5){
            answer[0] = count*2;
            answer[1] = count*2+2;
        }else if(n%7 == 6){
            answer[0] = count*2+1;
            answer[1] = count*2+2;

        }
        // 정답출력
        for(int i=0; i<answer.length; i++) {
        	System.out.println(answer[i]);
        }
        

	}

}
