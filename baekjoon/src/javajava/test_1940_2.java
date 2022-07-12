package javajava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class test_1940_2 {

	public static void main(String[] args) throws IOException {
		// 백준 1940번, 유형 : 투포인터 
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bufferedReader.readLine());
		int m = Integer.parseInt(bufferedReader.readLine());
		int[] A = new int[n];
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		for (int i = 0; i < n; i++) { 
			A[i] = Integer.parseInt(stringTokenizer.nextToken());
		}
		
		Arrays.sort(A); // 투포인터 문제는 데이터 정렬을 해야하는 경우, 정렬해서 주는 경우가 90%.
		int cnt = 0;
		int i=0;	// 시작과 (min값)
		int j=n-1;  // 끝에 포인터 위치. (max값)
		
		while(i<j) {
			if(A[i]+A[j]<m) i++; // 합이 작으면 시작포인터 왼쪽으로 이동. 값이 커짐.
			else if(A[i]+A[j]>m) j--; // 합이 크면 끝포인터를 왼쪽으로 이동. 값 작아짐.
			else {
				cnt++;
				i++;
				j--;
			}
		}
		
		System.out.println(cnt);
		
	}

}
