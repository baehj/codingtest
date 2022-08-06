package Do_it_알고리즘코테_핵심3일;

import java.util.Scanner;

public class p15 {
		// 백준 2750번 문제와 유사. 버블정렬(두개씩 비교하여 위치변경)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[]A = new int[N];
		for (int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		for (int i=0; i<N-1; i++) { // 5개의 숫자가 있으면 4개의 숫자만 오른쪽의 숫자와 비교함
			for(int j=0; j<N-1-i; j++) { // 이미 정렬된 데이터 전까지만 비교하면 됨
				if (A[j] > A[j+1]) {
					int temp = A[j];
					A[j] = A[j+1];
					A[j+1] = temp;
				}
			}
		}
		for (int i=0; i<N; i++) {
			System.out.println(A[i]);
		}

	}

}
