package javajava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class test_11286 {
	// 절댓값 힙 구현하기 (백준 11286), 유형 : 우선순위 큐 
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> myQueue = new PriorityQueue<>((o1,o2)->{ // o1,o2 -> 비교
			// 절대값이 작은 데이터 우선
			// 첫번째 숫자. 입력 애 부터 시작. 
			
			int first_abs = Math.abs(o1); // Math.abs(o1); 은 o1의 절대값을 구함
			System.out.println(o1 + "first_abs = " + first_abs);
			int second_abs = Math.abs(o2);
			System.out.println(o2 + "second_abs = " + second_abs);
			
			if (first_abs == second_abs) { // 절대값이 같은 경우 음수 우선
				return o1 > o2 ? 1 : -1; // -1이면 위치 바꾸기. 
			}
			
			return first_abs - second_abs; // 첫번째 숫자의 절대값이 크다면? 양수리턴(그대로) / 작다면 - 음수리턴(위치이동) 
		});
	
		
		for (int i=0; i<N; i++) {
			int request = Integer.parseInt(br.readLine());
			if (request == 0) {
				if(myQueue.isEmpty()) {
					System.out.println("0");
				} else {
					System.out.println(myQueue.poll());
				}
			} else {
				myQueue.add(request);
			}
		}
				
		
	}
	
}



