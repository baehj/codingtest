package java_level1;

public class test8 {
	// 문자열 내 p와 y의 개수 (정확도테스트 체크)
	
	/*
	boolean solution(String s) {
        int pCnt = 0;
        int yCnt = 0;

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if(a==('p')){
                pCnt ++;
            } else if(a==('y')){
                yCnt++;
            }
        }

        if(pCnt == yCnt){
            return true;
        } else if (pCnt==0 && yCnt==0){
            return true;
        } else {
            return false;
        } 
         
    }
	*/
	 	// 샘플케이스를 잘보자! 대소문자 구분할 필요가 있었음!
	  boolean solution(String s) {
	        int pCnt = 0;
	        int yCnt = 0;
	        
	        String[] a = s.toLowerCase().split(""); 
	         
	        for (int i = 0; i < a.length; i++) {
	            if(a[i].equals("p")){
	                pCnt ++;
	            } else if(a[i].equals("y")){
	                yCnt++;
	            }
	        }

	        if(pCnt == yCnt){
	            return true;
	        } else if (pCnt==0 && yCnt==0){
	            return true;
	        } else {
	            return false;
	        } 
	         
	    }
}
