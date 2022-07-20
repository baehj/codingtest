package javajava;

import java.util.Scanner;

public class test_2750_2 {

	public static void main(String[] args) {
		
		// 백준 2750번 문제 풀이2, 버블정렬
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		for(int i=0; i<N; i++){
			A[i] = sc.nextInt();
		}
		
		// 버블 정렬을 구현하는 영역
		for(int i=0; i<N-1; i++){
			for(int j=0; j<N-1-i; j++) {
				if(A[j]<A[j+1]) {
					int temp = A[j];
					A[j] = A[j+1];
					A[j+1] = temp;
				}
			}
		}
		
		for(int i=0; i<N; i++) {
			System.out.println(A[i]);
		}
		
	}

}
