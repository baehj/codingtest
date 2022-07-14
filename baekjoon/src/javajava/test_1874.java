package javajava;

import java.util.Scanner;
import java.util.Stack;

public class test_1874 {
	
	public static void main(String[] args) {
		
		// 백준 1874번 스택 수열
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 몇 개의 숫자
		int A[] = new int[N]; // 주어진 배열 
		for (int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		
		Stack<Integer> stack = new Stack<>();
		int num = 1;
		boolean result = true;
		StringBuffer bf = new StringBuffer();
		
		for (int i=0; i<A.length; i++) {
			int su = A[i]; // 순서에 해당하는 배열의 값을 su라고 할때
			
			if (su >= num) { // num은 1부터 시작. su가 num보다 크면?
				while(su>=num) { // su가 sum과 같거나 클때까지 
					stack.push(num++); // stack에 num 값을 증가시켜서 넣어주기. 
					bf.append("+\n"); // bf에 + 더하기
				}
				stack.pop(); // num=su 까지 넣어줬으니 마지막에 넣어준 값을 빼주기. pop
				bf.append("-\n"); // 그리고 빼줬으니 bf에 - 더하기 
				
			} else { //su가 num보다 작다면?
				int n = stack.pop(); // 일단 맨 위에꺼를 꺼내. 그게 n이야.
				
				if (n > su) { // n이 su보다 크다면? 
					System.out.println("NO"); // NO 출력해.
					result = false; 
					break; // 그리고 STOP!
				} else {
					bf.append("-\n"); // 숫자가 안맞아도 내려가면서 -갯수가 맞춰질테니. 하나만 빼주면 됨.
				}
			}
		}
		if(result) System.out.println(bf.toString());
		
	}

}
