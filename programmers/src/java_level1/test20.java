package java_level1;

public class test20 {
	//월간 코드 챌린지 시즌1 내적 
	public static void main(String[] args) {
		
		int[] a = {1,2,3,4};
		int[] b = {-3,-1,0,2};
		int answer = 0;
	       for(int i=0; i<a.length; i++){
	           answer += a[i]*b[i];
	       }
	    System.out.println(answer);

	}

}
