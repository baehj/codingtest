package Do_it_알고리즘코테_핵심3일;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class p26 {
	// 백준 1260번과 유사, DFS & BFS
	
	static boolean visited[];
	static ArrayList<Integer>[] A;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int Start = sc.nextInt();
		A = new ArrayList[N+1];
		for (int i = 1; i<=N; i++) {
			A[i] = new ArrayList<Integer>();
		}
		for (int i = 0; i < M; i++) {
			int S = sc.nextInt();
			int E = sc.nextInt();
			A[S].add(E);
			A[E].add(S);
		}
		
		for (int i = 1; i <= N; i++) {
			Collections.sort(A[i]);
		}
		visited = new boolean[N+1];
		DFS(Start);
		System.out.println();
		
		visited = new boolean[N+1];
		BFS(Start);
		System.out.println();
	}
	
	public static void DFS(int Node) {
		System.out.println(Node + " ");
		visited[Node] = true;
		for(int i : A[Node]) {
			if(!visited[i]) {
				DFS(i);
			}
		}
	}
	
	private static void BFS(int Node) { // 왜 BFS는 private로?
		Queue<Integer> que = new LinkedList<Integer>();
		que.add(Node);
		visited[Node] = true;
		
		while(!que.isEmpty()) {
			int now_Node = que.poll();
			System.out.println(now_Node + " ");
			for (int i : A[now_Node]) {
				if(!visited[i]) {
					visited[i] = true;
					que.add(i);
				}
			}
		}
	}
}
