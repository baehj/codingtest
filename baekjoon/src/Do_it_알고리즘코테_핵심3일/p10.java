package Do_it_알고리즘코테_핵심3일;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class p10 {

	public static void main(String[] args) throws IOException {
		// 백준 11003번과 유사. 슬라이딩 도어.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int l = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		Deque<Node> mydeque = new LinkedList<>();
		
		for (int i=0; i<n; i++) {
			int now = Integer.parseInt(st.nextToken());
			
			while(!mydeque.isEmpty() && mydeque.getLast().value > now) {
				mydeque.removeLast();
			}
			mydeque.addLast(new Node(now,i));
			if (mydeque.getFirst().index <=i - l) {
				mydeque.removeFirst();
			}
			bw.write(mydeque.getFirst().value + " ");
		}
		bw.flush();
		bw.close();
	}

	
	static class Node {
		public int value;
		public int index;
		
		Node(int value, int index){
			this.value = value;
			this.index = index;
		}
	}
	
	
}
