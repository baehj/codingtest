package Do_it_알고리즘코테_핵심3일;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class p23 {
	// 백준 11724번과 유사, DFS
	
	static ArrayList<Integer>[] A;
	static boolean visited[];
	
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		A = new ArrayList[n+1];
		visited = new boolean[n+1];
		for (int i=0; i<n+1; i++) {
			A[i] = new ArrayList<Integer>(); // A배열 속 배열
		}
		for (int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			A[s].add(e); // A배열 속 배열에 인접한 에지를 더함
			A[e].add(s); // 양방향이므로 1-2이면 1,2에 모두
		}
		int count=0;
		for (int i=1; i<n+1; i++) {
			if(!visited[i]) { // 방문안했음 카운트업하고 DFS
				count++;
				DFS(i);
			}
		}
		System.out.println(count);
	}
	
	static void DFS(int v) {
		if(visited[v]) {
			return;
		}
		visited[v]=true; //  방문했음 으로 바꾸고
		for (int i : A[v]) { // v에 인접한 노드들도 방문했음으로 바꿈
			if (visited[i] == false) {
				DFS(i);
			}
		}
	}
	
}
