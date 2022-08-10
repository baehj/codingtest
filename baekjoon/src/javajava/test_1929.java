package javajava;

import java.util.Scanner;

public class test_1929 {

	public static void main(String[] args) {
		// 백준 11403번 문제, 유형 : 에라토스테네스 방법
		
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		int []A = new int[N+1];
		for(int i=1; i<=N; i++) { // 1부터 시작
			A[i] = i;
		}
		
		// 아래 i의 범위가 i<=Math.sqrt(N); 인 이유. (=N의 제곱근까지인 이유)
		// N이 a*b라고 가정했을 때, a와 b모두 N의 제곱근보다 클 수 없습ㄴ디ㅏ. 따라서 N의 제곱근까지만 확인해도 전체 범위의 소수를 판별 가능
		// 만약 16까지의 소수를 구한다고 치면 16의 제곱근은 4이고 16은 4보다 작은 약수를 갖게되게 때문에 제곱근까지만 설정해도 가능하다는 뜻.
		
		for(int i=2; i<=Math.sqrt(N); i++) { //1은 소수가 아니니 2부터 시작, 제곱근 보다 작은 범위까지.
			if (A[i] == 0) continue; // 소수가 아니라면 continue
			for (int j=i+i; j<=N; j=j+i) { // j는 i의 2배수 부터~N까지. i의 배수단위로 뜀
				A[j] = 0; // 소수의 배수는 소수가 아니므로 0으로.
			}
		}
		
		for(int i=M; i<=N; i++) {
			if(A[i]!=0) {
				System.out.println(A[i]);
			}
		}
		
	}

}
