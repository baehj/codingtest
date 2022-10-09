package java_level2;

import java.util.Arrays;

public class test6 {
	// 최솟값 만들기 : 최소값 * 최대값을 더하면 곱의 합이 최소값이 됨.
	public static void main(String[] args) {
		int []A = {1,4,2};
		int []B = {5,4,4};
		int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        for(int i = 0; i < A.length; i++) {
            answer += A[i] * B[B.length - 1 - i];
        }
        System.out.println(answer);
	}

}
