package java_level1;

import java.util.HashMap;
	//성격 유형 검사하기

public class test1 {

	public static void main(String[] args) {
		String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
		int[] choices = {5, 3, 2, 7, 5};
		
		HashMap<String, Integer> count = new HashMap<>();
		
		count.put("A", 0);
		count.put("N", 0);
		count.put("C", 0);
		count.put("F", 0);
		count.put("M", 0);
		count.put("J", 0);
		count.put("R", 0);
		count.put("T", 0);
		
		for(int i=0; i<survey.length; i++){
            if(choices[i] < 4){ //비동의
               String a = survey[i].substring(0,1);
               count.replace(a, count.get(a)+(4-choices[i]));
            } else if(choices[i] > 4) { //동의
               String b =survey[i].substring(1,2);
               count.replace(b, count.get(b)+(choices[i]-4));
            }
        }
		
		String answer = "";
		
		if(count.get("R") > count.get("T")) {
			answer += "R";
		} else if(count.get("R") < count.get("T")) {
			answer += "T";
		} else {
			answer += "R";
		}
		
		if(count.get("C") > count.get("F")) {
			answer += "C";
		} else if(count.get("C") < count.get("F")) {
			answer += "F";
		} else {
			answer += "C";
		}
		
		if(count.get("J") > count.get("M")) {
			answer += "J";
		} else if(count.get("J") < count.get("M")) {
			answer += "M";
		} else {
			answer += "J";
		}
		
		if(count.get("A") > count.get("N")) {
			answer += "A";
		} else if(count.get("A") < count.get("N")) {
			answer += "N";
		} else {
			answer += "A";
		}
		
		System.out.println(answer);

	}

}
