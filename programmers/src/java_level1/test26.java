package java_level1;

public class test26 {
	// 최대공약수와 최소공배수
	public static void main(String[] args) {
	 	int n = 3;
	 	int m = 12;
		int[] answer = new int[2];
        
        int big = Math.max(n, m);
        int small = Math.min(n, m);
        
        answer[0] = gcd(big, small); // 최대공약수
        answer[1] = big*small/answer[0]; // 최소공배수 : 두수를 곱해서 최대공약수로 나눔.
        System.out.println(answer);
    }
	    
		
	static int gcd(int a, int b) {
	    if(a % b == 0) {
	        return b;
	    }
	    return gcd(b, a%b);
	}

}
