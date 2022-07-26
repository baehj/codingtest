package javajava;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
//백준 1260번 문제, 유형 : DFS와 BFS
public class test_1260 {
	
	//함수에서 사용할 변수들
	  static int[][] check; //간선 연결상태
	  static boolean[] checked; //확인 여부
	  static int n; //정점개수
	  static int m; //간선개수
	  static int start; //시작정점
	  
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		start = sc.nextInt();

		check = new int[1001][1001]; //좌표를 그대로 받아들이기 위해 +1해서 선언
		checked = new boolean[1001]; //초기값 False
		
		//간선 연결상태 저장
		  for(int i = 0; i < m; i++) {
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    
		    check[x][y] = check[y][x] = 1;
		  }
		  
		  
		  ////////// 이 부분은 check에 어떻게 담기는지 확인하기 위해서 넣어봄. n,m,v가 4,5,1일때 기준으로 확인함.
		  for (int i = 0; i < 6; i++)    // 2차원 배열의 세로 크기만큼 반복
			{
				for (int j = 0; j < 6; j++)    // 2차원 배열의 가로 크기만큼 반복
					{
					System.out.print(check[i][j]); // 2차원 배열의 인덱스에 반복문의 변수 i, j를 지정
					}
				System.out.println("\n");                // 가로 요소를 출력한 뒤 다음 줄로 넘어감
			}
		  //////////

		  
		  dfs(start); //dfs호출
		  
		  checked = new boolean[1001]; //확인상태 초기화
		  System.out.println(); //줄바꿈
		  
		  bfs(); //bfs호출
		  }

	
	 public static void dfs(int i) {
		    checked[i] = true;
		    System.out.print(i + " ");
		    
		    for(int j = 1; j <= n; j++) {
		      if(check[i][j] == 1 && checked[j] == false) {
		        dfs(j);
		      }
		    }
		  }
		  
	 
	  public static void bfs() {
	    Queue<Integer> queue = new LinkedList<Integer>();
	    queue.offer(start); //시작점도 Queue에 넣어야 함
	    checked[start] = true;
	    System.out.print(start + " ");
	    
	    //Queue가 빌 때까지 반복. 방문 정점은 확인, 출력 후 Queue에 넣어 순서대로 확인
	    while(!queue.isEmpty()) {
	      int temp = queue.poll();
	      
	      for(int j = 1; j <= n; j++) {
	        if(check[temp][j] == 1 && checked[j] == false) {
	          queue.offer(j);
	          checked[j] = true;
	          System.out.print(j + " ");
	        }
	      }
	    }
	  }

}

