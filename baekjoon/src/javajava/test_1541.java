package javajava;

import java.util.Scanner;

public class test_1541 {
	// 백준 1541번 문제, 유형 : 그리디
	
	static int answer = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String example = sc.nextLine();
		String[] str = example.split("-");
		for(int i =0; i<str.length; i++) {
			int temp = mySum(str[i]);
			if(i==0)answer = answer + temp;
			else answer = answer - temp;
		}
		System.out.println(answer);

	}

	private static int mySum(String a) {
		int sum = 0;
		String[] temp = a.split("[+]"); // split할때 +는 []안에 적어야 잘 인식함
		for(int i =0; i<temp.length; i++) {
			sum = sum + Integer.parseInt(temp[i]);
		}
		return sum;
	}
}
