package javajava;

import java.util.Arrays;
import java.util.Scanner;

public class test_1920 {
	// 백준 1920번 문제, 유형 : 이진탐색
	// 단순 반복문으로는 시간초과함에 유의.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		Arrays.sort(A);
		int M = sc.nextInt();
		for(int i=0; i<M; i++) {
			boolean find = false;
			int target = sc.nextInt();
			int start = 0;
			int end = A.length - 1;
			while (start <= end) {
				int mid_index = (start+end)/2;
				int mid_value = A[mid_index];
				if(mid_value < target) {
					end = mid_index - 1;
				} else if (mid_value < target) {
					start = mid_index + 1;
				} else {
					find = true;
					break;
				}
			}
			if(find)System.out.println(1); //(find == true)
			else System.out.println(0);
		}

	}

}
