package java_level2;

import java.util.Arrays;

public class test3_1 {
	public static void main(String[] args) {
		
		// 문제 : 전화번호 목록
		String [] phone_book = {"12","123","1235","567","88"};
		boolean answer = true;
		
		// 풀이 1) for문, startsWith
		Arrays.sort(phone_book); // -> sorting을 굳이 한 이유 : 접두어 포함된 번호가 붙어나와 빨리 찾을 수 있을 것 같아서.
		
		for (int i = 0; i < phone_book.length - 1; i++) {
	        if (phone_book[i + 1].startsWith(phone_book[i])) {
	        	/* return false; */
	        	answer = false;
				break;
	        }
	    }
		
		System.out.println(answer);
		
	}
}
