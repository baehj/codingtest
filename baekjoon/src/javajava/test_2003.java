package javajava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test_2003 {

	public static void main(String[] args) throws IOException {
		// 백준 2003번, 유형 : 투포인터
		
		// while true [설 명]
		// 1. while (true) : 무한루프(계속) 프로그램을 반복적으로 실행한다
		// 2. break; : '탈출' 구문으로 특정 조건을 만족 시 무한루프를 탈출하기 위해 사용한다

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

		int n = Integer.parseInt(stringTokenizer.nextToken());
		int m = Integer.parseInt(stringTokenizer.nextToken());

		int[] A = new int[n + 1];
		stringTokenizer = new StringTokenizer(bufferedReader.readLine());

		for (int i = 1; i <= n; i++) { // index 1부터 시작 주의
			A[i] = Integer.parseInt(stringTokenizer.nextToken());
		}

		int start = 1;
		int end = 1;
		int sum = A[1];
		int count = 0;

		while(true){
            if(sum>=m){
            	// 아래와 같은 경우 sum-=A[start] 실행 후 start++ 실행
                sum-=A[start++];
            }else if(end==n){
            // break가 여기 위치해서
            // 1) end++해서 end==n이 되었을 때도 count가 가능함
            	System.out.println("break");
                break;
            }else{
                sum+=A[end++];
            }

            if(sum==m){
                count++;
                System.out.println("/");
            }
        }
        System.out.println(count);
		
	}

}
