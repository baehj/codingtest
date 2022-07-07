package javajava;

import java.util.Scanner;

public class test_11720 {

	public static void main(String[] args) {
		
		// 11720 숫자의합 
		// N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String sNum = sc.next();
		
		/* 예제)
		 * int n = 5;
		 * int num = 54321; 를 넣어서 했을 때는 
		 * String sNum = Integer.toString(num);
		 */
		
		// string을 char 배열로
		char[] cNum = sNum.toCharArray();
		// 배열 원소의 합을 구함
		int sum = 0;
		for (int i=0; i<cNum.length; i++) {
			// cNum의 char를 int형으로 바꿔주려면 아스키코드를 참고해 '0'을 빼준다.(또는 48을빼주기)
			sum += cNum[i] - '0';
		}
		System.out.println(sum);
	}
}
