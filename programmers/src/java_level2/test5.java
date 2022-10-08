package java_level2;

import java.util.ArrayList;

public class test5 {
	// JadenCase 문자열 만들기
	public static void main(String[] args) {
		
		String s = "3people unFollowed me";

	    ArrayList<Integer> list = new ArrayList<>();
	    list.add(-1);
	    for (int i=0; i < s.length()-1; i++) {
	      if (s.charAt(i) == ' ') {
	          list.add(i);
	      }
	    }
	        
	    s = s.toLowerCase();
	    char[] sChar = s.toCharArray();
	    for (int i=0; i<list.size(); i++){

	        if(sChar[list.get(i)+1]-'0'> 9){
	            sChar[list.get(i)+1] =  Character.toUpperCase(sChar[list.get(i)+1]);
	        }
	    }
	    String answer = new String(sChar);

	    System.out.println(answer);
    }
}
