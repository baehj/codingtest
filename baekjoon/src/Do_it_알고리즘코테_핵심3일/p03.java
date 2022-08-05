package Do_it_알고리즘코테_핵심3일;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p03 {

	public static void main(String[] args) throws IOException {
		// 백준 11659번 문제와 유사
		// 구간합을 구하는 문제는 합배열을 이용하기!
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		long[] S = new long[n+1]; // 합배열을 1부터 사용하려고.
		st = new StringTokenizer(br.readLine()); // 두번째줄을 넣고 
		
		for(int i=1; i<=n; i++) { // 구간합을 구해줌
			S[i] = S[i-1] + Integer.parseInt(st.nextToken());
		}
		
		for (int q=0; q<m; q++) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			System.out.println(S[j] - S[i-1]);
		}
		
	}
}
