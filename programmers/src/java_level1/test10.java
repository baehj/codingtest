package java_level1;

import java.util.Arrays;
	// 정수 내림차순으로 배치하기
public class test10 {

	public static void main(String[] args) {
		
		long n = 118372;
		String beforeS = Long.toString(n);
		char[] arr = beforeS.toCharArray();
		Arrays.sort(arr);
		String longS = "";
		for (int i=arr.length-1; i>=0; i--) {
			longS = longS + arr[i];
		}
		long answer = Long.parseLong(longS);
        System.out.println(answer);
	}

}
