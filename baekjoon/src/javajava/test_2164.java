package javajava;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class test_2164 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Queue<Integer> myQueue = new LinkedList<>();
		int N = sc.nextInt();
		for (int i=1; i<=N; i++) {
			myQueue.add(i);
		}
		
		while(myQueue.size()>1) {
			myQueue.poll(); // 처음꺼 버리기
			myQueue.add(myQueue.poll()); // 그 다음꺼는 뽑아서 맨뒤에 추가.
		}
		System.out.println(myQueue.poll());
	}

}

/*
 * Queue에 대한 정리 (<-> stack)
 * 
 * 1) 선언 Queue<Integer> q = new LinkedList<>();
 * 
 * 2) 값 추가
 * - q.add(x); 해당 큐 맨 뒤(오래된)에 값 삽입 / 값 추가 성공 시 true 반환 / 큐가 꽉 찬 경우 / IllegalStateException 에러 발생
 * - q.offer(x); 해당 큐 맨 뒤에 값 삽입 / 값 추가 성공 시 true 반환 /값 추가 실패 시 false 반환
 * 
 * 3) Queue에 값 제거
 * - q.remove(); 큐 맨 앞(최신의)에 있는 값 반환 후 삭제 / 큐가 비어 있는 경우 / NoSuchElementException 에러 발생
 * - q.poll(); 큐 맨 앞에 있는 값 반환 후 삭제 / 큐가 비어있을 경우 null 반환
 * - q.clear(); 큐 비우기
 * 
 * 4) Queue의 맨 앞 값 확인
 * - q.element(); 큐의 맨 앞에 있는 값 반환 / 큐가 비어 있는 경우 / NoSuchElementException 에러 발생
 * - q.peek(); 큐의 맨 앞에 있는 값 반환 / 비어있을 경우 null 반환
 * 
 * 값 추가,제거에 여러 메서드가 제공되는데 문제상황에서 어떤 값을 받을지에 따라서 골라 사용하면 됨.
 * 
 * 내용 출처 : https://cocoon1787.tistory.com/774
 * 
 */




