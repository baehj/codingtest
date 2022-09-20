package java_level1;

public class test4 {
	// 자릿수 더하기
	public static void main(String[] args) {
			
		int n = 987;
	    int answer = 0;
	    
	    int a = 0;
		for(; n>0; ){
		    a = n % 10;
		    n = n/10;
		    answer += a;
		}
		System.out.println(answer);
	}
	
}


