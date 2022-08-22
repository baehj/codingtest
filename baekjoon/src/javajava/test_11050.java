package javajava;

import java.util.Scanner;

public class test_11050 {
	// 백준 11050번 문제, 유형 : 조합 기본 문제(점화식 이용)
	
	static int N, K;
	static int D[][];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		K = sc.nextInt();
		D = new int[N+1][N+1];
		// 초기화
		for(int i=0; i<=N; i++) {
			D[i][i] = 1;
			D[i][0] = 1;
			D[i][1] = i;
		}
		
		// 점화식으로 배열 완성하기 - bottom up 방식으로
		for(int i=2; i<=N; i++) { // 0,1은 초기화 된 상태.
			for(int j=1; j<i; j++) {
				D[i][j] = D[i-1][j] + D[i-1][j-1]; // 조합 점화식
			}
		}
		
		System.out.println(D[N][K]);
	}

}
