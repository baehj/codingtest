package javajava;

import java.util.Scanner;

public class test_11047 {
	// 백준 11047번 문제, 유형 : 그리디 알고리즘(현재 상태에서 최선의 수를 선택해서 해를 찾는 방법)
	
	// 문제의 조건 중 '배수의 형태'라는 조건에 유의! 반례없이 문제가 해결될 수 있는 조건.
	// 반례가 있을 경우 무조건 큰수부터 처리하는 것이 최선의 수가 아닐 수도 있음.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] A = new int[N];
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		
		int count = 0;
		for(int i= N-1; i>=0; i--) { // 큰수부터 사용하니까 역순으로
			if(A[i] <= K) {
				count += (K/A[i]);
				K = K % A[i];
			}
		}
		System.out.println(count);
		
	}

}
