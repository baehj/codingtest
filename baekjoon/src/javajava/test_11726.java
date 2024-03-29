package javajava;

import java.util.Scanner;

public class test_11726 {
	// 백준 11726번 문제, 유형 : 다이나믹프로그래밍
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long D[] = new long[1001];
		D[1] = 1; // N = 1 일 때 타일 채우는 경우의 수
		D[2] = 2; // N = 2 일 때 타일 채우는 경우의 수
		
		for(int i =3; i<= N; i++) {
			D[i] = (D[i-1] + D[i-2]) % 10007;
		}
		
		System.out.println(D[N]);
	}
	

}
