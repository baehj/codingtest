package java_level2;

import java.util.Arrays;

public class test3_3 {
	public static void main(String[] args) {
		
		// 문제 : 전화번호 목록
		String [] phone_book = {"12","123","1235","567","88"};
		boolean answer = true;
		
		// 풀이 3) for문 3중
		Arrays.sort(phone_book); 
		
		for (int i=0; i<phone_book.length; i++) { // 처음부터 끝까지 비교(기준)
	        for (int j=i+1; j<phone_book.length; j++) { //
	            for (int k=0; k<phone_book[j].length(); k++) {
	        		if(phone_book[i].equals(phone_book[j].substring(0, k))) {
	        			/* return false; */
	        			answer = false;
	        			break;
	        		}
		        }
	        }
	    }
		
		System.out.println(answer);
		
	}
}
