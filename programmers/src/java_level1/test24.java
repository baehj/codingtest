package java_level1;

public class test24 {
	// 약수의 개수와 덧셈
	public static void main(String[] args) {
		int left = 13;
		int right = 17;
		int answer = 0;
        for(int i = left; i <= right; i++) {
            int cnt = 0;

            for(int j = 1; j <= i; j++) {
                if(i % j == 0) cnt++;
            }

            if(cnt % 2 == 0) answer += i;
            else answer -= i;
        }
        System.out.println(answer);
	}
}
