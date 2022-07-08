package javajava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class test_11659 {
	public static void main(String[] args) throws IOException {
		// 구간 합 구하기 4
		// 수 N개가 주어졌을 때, i번째 수부터 j번째 수까지 합을 구하는 프로그램을 작성하시오.
		
		// 문제해결 팁 : 합배열
		
		// BufferedReader 를 사용한 이유 : 받는 숫자가 많을때는 scanner보다 BufferedReader를 사용하는 게 더 빠름
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		// StringTokenizer 를 사용한 이유 : n개의 숫자가 십만개 까지 가능하니까 매우 길 수 있음. 그럴 때 int형으로 받기 힘드니 사용
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		
		int suNo = Integer.parseInt(stringTokenizer.nextToken()); // N
		int quizNo = Integer.parseInt(stringTokenizer.nextToken()); // 질의의 수
		
		// 합배열에 모두 담음
		long[]S = new long[suNo+1]; // 숫자가 크고 형이 다를때는 습관적으로 long으로 선언하는 걸 추천 , i,j의 인덱스와 맞추기 위해서 +1
		stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		
		for (int i=1; i<=suNo; i++) { // index 1부터 시작 주의
			S[i] = S[i-1] + Integer.parseInt(stringTokenizer.nextToken());
		}
		
		for (int q=0; q<quizNo; q++) { // i번째 수부터 j번째 수까지 합이라서 i가 들어가야하니 S[j] - S[i-1] 임을 주의!
			stringTokenizer = new StringTokenizer(bufferedReader.readLine());
			int i = Integer.parseInt(stringTokenizer.nextToken());
			int j = Integer.parseInt(stringTokenizer.nextToken());
			System.out.println(S[j] - S[i-1]);
		}
		
	}
}
