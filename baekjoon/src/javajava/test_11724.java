package javajava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class test_11724 {
	
	static boolean visited[];
	static ArrayList<Integer>[] A;
	
	public static void main(String[] args) throws IOException {
		// 백준 11724번 문제, 유형 : DFS(트리완전 탐색을 할때 사용),재귀함수
		// 이 문제는 문제 자체가 이해하기 어려웠음 ㅠㅠ
		
		// 연결요소 (Connected Component)란? 아래 링크를 참고!
		// https://velog.io/@polynomeer/%EC%97%B0%EA%B2%B0-%EC%9A%94%EC%86%8CConnected-Component
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 정점의 개수
		int m = Integer.parseInt(st.nextToken()); // 노드의 개수
		visited = new boolean[n+1]; //0번째 배열을 쓰지 않을 계획이라 n+1사이즈로
		A = new ArrayList[n+1];
		
		for (int i=1; i<n+1; i++){ // 정점의 개수만큼 배열A를 만들어줌.
			A[i] = new ArrayList<>();
		}
		
		for (int i=0; i<m; i++){
			st = new StringTokenizer(br.readLine()); // st는 간선의 양 끝점  ex) 1 2
			int s = Integer.parseInt(st.nextToken()); // 시작점
			int e = Integer.parseInt(st.nextToken()); // 끝점
			A[s].add(e); // A[1] 배열에 2를 담음
			A[e].add(s); // A[2] 배열에 1을 담음
		}
		int count = 0;
		for(int i=1; i<n+1; i++) { // 1부터 n까지 돌면서
			if(!visited[i]) { // visited[i]가 F면
				count++; // 카운트 올리고 
				DFS(i); // DFS 실행
			}
		}
		System.out.println(count);
	}

	private static void DFS(int v) {
		if(visited[v]) { // visited[i]가 T면 리턴
			return;
		}
		visited[v] = true; // visited[i]가 F면 T로 바꾸고
		for(int i : A[v]) { //A(연결되어있는 수들이 모두 있음)의 배열을 돌면서 
			if(!visited[i]) { // 해당하는 visited배열을 F에서 T로 변경
				DFS(i);
			}
		}
		
	}
	
}
