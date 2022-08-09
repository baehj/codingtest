package javajava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test_11403 {
	// 백준 11403번 문제, 유형 : 그래프이론 / 플로이드-와샬
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int [][] check = new int[n][n];
		
		for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
            	check[i][j] = Integer.parseInt(st.nextToken());
            }
        }
		
		// k, i, j를 3중 반복문을 통해 탐색하며,
		// 만약 i -> k로 갈 수 있고 k -> j로도 갈 수 있다면, i -> j로 가는 경우가 가능하기 때문에 true로 값을 변경해준다.
		
		for (int k = 0; k < n; k++) { 
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (check[i][k] == 1 && check[k][j] == 1) {
                    	check[i][j] = 1;
                    }
                }
            }
        }
		
		StringBuilder sb = new StringBuilder(); // 또는 2중for문으로 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb.append(check[i][j] + " ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
		
	}

}
