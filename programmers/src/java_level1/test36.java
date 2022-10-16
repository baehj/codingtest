package java_level1;
import java.util.*;
public class test36 {

	public static void main(String[] args) {
		// 모의고사

    	int[] answers = {1,2,3,4,5};
        
        int[] spj1 = {1, 2, 3, 4, 5};
        int[] spj2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] spj3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] cnt = new int[3];
        
        for(int i = 0; i < answers.length; i++){
            if(spj1[i % 5] == answers[i]){ cnt[0]++;}
            if(spj2[i % 8] == answers[i]){ cnt[1]++;}
            if(spj3[i % 10] == answers[i]){ cnt[2]++;}
        }
        
        int max = Math.max(Math.max(cnt[0], cnt[1]),cnt[2]); // max값 구하기
        ArrayList<Integer> list = new ArrayList<>();
        if(max==cnt[0]) list.add(1); 
        if(max==cnt[1]) list.add(2);
        if(max==cnt[2]) list.add(3);
        
        int[] answer = new int[list.size()];
        
        for(int i =0; i<answer.length; i++) {
        	answer[i] = list.get(i);
        }
        System.out.println(answer);

	}

}
