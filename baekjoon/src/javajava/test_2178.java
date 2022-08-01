package javajava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class test_2178 {
	// 백준 2178번 문제, 유형 : 미로탐색,BFS
	
	// 좌표를 x,y축으로 이동하기 위해
	static int[] dx = {0,1,0,-1};
	static int[] dy = {1,0,-1,0};
					//  하,우,상,좌 로이동 (그래프가 아니고 배열위치)
	static boolean[][] visited;
	static int[][] A;
	static int N,M;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		A = new int[N][M];
		visited = new boolean[N][M];
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			String line = st.nextToken();
			for(int j=0; j<M; j++) {
				A[i][j] = Integer.parseInt(line.substring(j,j+1)); // line을 쪼개서 배열A로
			}
		}
		
		BFS(0,0);
		System.out.println(A[N-1][M-1]);
	}
	
	private static void BFS(int i, int j) {
		Queue<int[]>queue = new LinkedList<>();
		queue.offer(new int[] {i,j}); // 들어온 데이터를 queue에 넣어주기.
		visited[i][j] = true;
		while(!queue.isEmpty()){
			int now[] = queue.poll(); // remove
			for(int k=0; k<4; k++) { //상하좌우 탐색을 위해서
				int x = now[0] + dx[k];
				int y = now[1] + dy[k];
				// 상하좌우 탐색 후 아래 2가지 조건 체크
				if(x>=0 && y>=0 && x<N && y<M) { //조건 배열을 넘어가서는 안됨
					if(A[x][y]!=0 && visited[x][y]) { //0이여서 갈 수 없거나 방문했던 배열이면 안됨
						//위 두개의 if가 아니라면? 이제 갈 수 있는 곳
						visited[x][y] = true; //방문체크
						A[x][y] = A[now[0]][now[1]] + 1; //depth
						queue.add(new int[] {x,y});
					}
				}
			}
		}
		
	}
	
	
}
