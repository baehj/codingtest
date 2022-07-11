package javajava;

import java.util.Scanner;

public class test_2018 {

	public static void main(String[] args) {
		
		// 백준 2018번 문제, 유형 : 투포인터
		// 투포인터 : start_idx와 end_idx를 잘 이동해가면서 답을 구해가는 알고리즘
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 1;
		int start_idx = 1;
		int end_idx = 1;
		int sum = 1;
		
		while(end_idx != n) {
			if(sum == n) {
				count ++;
				end_idx ++;
				sum += sum + end_idx;
			} else if (sum > n) {
				sum = sum - start_idx;
				start_idx++;
			} else {
				end_idx++;
				sum = sum + end_idx;
			}
		}
		
		System.out.println(count);

	}

}
