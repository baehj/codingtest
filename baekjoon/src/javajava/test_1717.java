package javajava;

import java.util.Scanner;

public class test_1717 {
	// 백준 1717번 문제, 유형 : 집합 표현하기, union-find, 경로압축
	// union-find !!! 1.대표노드 찾아서 연결 / 2. 리턴할 때 경로 압축 필수.
	
	static int parent[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		parent = new int[N+1];
		for(int i=0; i<N+1; i++) {
			parent[i] = i;
		}
		for (int i=0; i<M; i++) {
			int question = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(question == 0) { // 0일 때 union
				union(a,b);
			} else { // 1일 때 두 원소 같은지
				boolean result = checkSame(a,b);
				if(result) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			}
		}

	}

	private static void union(int a, int b) {
		// 대표노드를 찾아서 연결하기
		a = find(a);
		b = find(b);
		if(a!=b) {
			parent[b] = a; // 두개를 연결
		}
	}

	private static int find(int a) {
		if(a==parent[a]) return a;
		else {
			return parent[a] = find(parent[a]); // value를 index로 바꿔서 다시 찾아보기.
			// 여기서! return find(parent[a]); 가 아닌 return parent[a] = find(parent[a]);을 해야 경로압축으로 시간절약 가능.
		}
	}
	
	private static boolean checkSame(int a, int b) {
		a = find(a);
		b = find(b);
		if(a==b) return true;
		return false;
	}

}
