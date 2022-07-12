package java_level2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class test3_2 {
	public static void main(String[] args) {
		
		// 문제 : 전화번호 목록
		String [] phone_book = {"12","123","1235","567","88"};
		boolean answer = true;
		
		// 풀이 2) HashMap
		Arrays.sort(phone_book);
		Map<String, Integer> map = new HashMap<>();
		
		for (int i = 0; i < phone_book.length; i++) {
	         map.put(phone_book[i], i);
		}
	        
	    // ** containsKey 값을 가지고 있는 지 확인.
	    for (int i = 0; i < phone_book.length; i++) {
	        for (int j = 0; j < phone_book[i].length(); j++) {
	            if (map.containsKey(phone_book[i].substring(0, j))) {
	            	/* return false; */
	            	answer = false;
	            	break;
	            }
	        }
	    }
	
	    System.out.println(answer);
	    
	}
}
