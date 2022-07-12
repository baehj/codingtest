package javajava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test_1940 {

	public static void main(String[] args) throws IOException {
		// 백준 1940번, 유형 : 
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		int n = Integer.parseInt(stringTokenizer.nextToken());
		
		stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		int m = Integer.parseInt(stringTokenizer.nextToken());

		int[] A = new int[n];
		stringTokenizer = new StringTokenizer(bufferedReader.readLine());

		for (int i = 0; i < n; i++) { 
			A[i] = Integer.parseInt(stringTokenizer.nextToken());
		}
		
		int cnt=0;
		
		for (int i=0; i<n; i++) {
			for (int j=i+1; j<n; j++) {
				if (A[i] + A[j] == m) {
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);
		
	}

}
