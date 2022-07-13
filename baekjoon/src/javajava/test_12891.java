package javajava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test_12891 {

	// 백준 12891번, 유형 : 슬라이딩 윈도우
	
	static int myArr[]; // 비밀번호 조건
	static char checkArr[]; // 전체문자열
	static int checkSecret;
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int S = Integer.parseInt(st.nextToken()); // DNA 문자열의 길이
		int P = Integer.parseInt(st.nextToken()); // 부분문자열의 길이
		int Result = 0;
		checkArr = new char[4]; // 비밀번호 체크 조건 배열 
		myArr = new int[4]; // 내가 체크할 배열
		char A[] = new char[S]; // 전체문자열
		checkSecret = 0; // 조건만족했는지 체크. 조건이 4개이므로 4가되어야 함.
		
		A = bf.readLine().toCharArray();
		st = new StringTokenizer(bf.readLine());
		
		for(int i=0; i<4; i++) {
			myArr[i] = Integer.parseInt(st.nextToken());
			if(myArr[i] == 0) {
				checkSecret++;
			}
		}
		
		for(int i=0; i<P; i++) { //부분문자열 처음 받을 때 세팅
			Add(A[i]);
		}
		
		if(checkSecret == 4) Result++;
		
		//슬라이딩 윈도우, i=P인 이유 : 이미 한 칸 밀린 상태로 시작하기 때문에 P로. 
		for(int i=P; i<S; i++) {
			int j = i-P;
			Add(A[i]);
			Remove(A[j]);
			if(checkSecret == 4) {
				Result++;
			}
			
			System.out.println(Result);
			bf.close();
		}
		
	}
	
	private static void Add(char c){
		switch(c) {
		case 'A':
			myArr[0]++;
			if(myArr[0]==checkArr[0]) checkSecret++;
			break;
		case 'C':
			myArr[1]++;
			if(myArr[1]==checkArr[1]) checkSecret++;
			break;
		case 'G':
			myArr[2]++;
			if(myArr[2]==checkArr[2]) checkSecret++;
			break;
		case 'T':
			myArr[3]++;
			if(myArr[3]==checkArr[3]) checkSecret++;
			break;
		}
	}
	
	private static void Remove(char c){
		switch(c) {
		case 'A':
			if(myArr[0]==checkArr[0]) checkSecret--;
			myArr[0]--;
			break;
		case 'C':
			if(myArr[1]==checkArr[1]) checkSecret--;
			myArr[1]--;
			break;
		case 'G':
			if(myArr[2]==checkArr[2]) checkSecret--;
			myArr[2]--;
			break;
		case 'T':
			if(myArr[3]==checkArr[3]) checkSecret--;
			myArr[3]--;
			break;
		}
	}
}
