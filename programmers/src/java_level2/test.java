package java_level2;

public class test {

	public static void main(String[] args) {
		// Lv. 2 문자열 압축
		
		String s = "aabbaccc";
		
		// 1개단위 0,1 / 1,2 / 2,3 / 3,4 / 4,5 / 5,6 / 6,7 
        // 2개단위 0,2 / 2,4 / 4,6
        // 3개단위 0,3 / 3,6
		// 4개단위 0,4 / 4,8
		
		for (int i=1; i<=s.length()/2; i++){
            for (int j=0; j<=s.length(); j++){
                if(s.substring(j) == s.substring(j+i)) {
                	
                }
            }
        }
		
	}
}
