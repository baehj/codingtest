package java_level1;

public class test8 {
	// 문자열 내 p와 y의 개수 (정확도테스트 체크)

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

}
