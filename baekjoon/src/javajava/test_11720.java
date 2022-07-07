package javajava;

public class test_11720 {

	public static void main(String[] args) {
		
		// N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
		int n = 5;
		int num = 54321;
		
		//int -> string으로 형변환 
		String sNum = Integer.toString(num);
		// string을 char 배열로
		char[] cNum = sNum.toCharArray();
		// 배열 원소의 합을 구함
		int sum = 0;
		for (int i=0; i<cNum.length; i++) {
			sum += cNum[i] - '0';
		}
		System.out.println(sum);
	}
}
