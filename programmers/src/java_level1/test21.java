package java_level1;

import java.util.Arrays;

public class test21 {
	// 연습문제 문자열 내림차순으로 배치하기 
	public static void main(String[] args) {
			String s = "Zbcdefg";
			char[] sChar = s.toCharArray();
	        Arrays.sort(sChar);
	        //String answer = new StringBuilder(new String(sChar)).reverse().toString();
	        StringBuilder answer = new StringBuilder(new String(sChar)).reverse();
	        // String st = new String(sChar); char배열을 문자열로 변환
	        System.out.println(answer);
	    
	}

}
