package javajava;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class test_220826 {
	// test
	public static void main(String[] args) {
		
		int answer = 1;
		String[] user_scores = { aa1, aa2, aa3, aa4, aa5};
		int[] rank = new int[3];
		
		HashMap<String, Integer> map = new HashMap<>();
        List<Map.Entry<String, Integer>> entryList = new LinkedList<>(map.entrySet());
        
       
        String nameScore = user_scores[0];
        int index = nameScore.indexOf(" ");
        String name = nameScore.substring(0, index);
        String scoreS = nameScore.substring(index+1);
        int score = Integer.parseInt(scoreS);
        
        map.put(name, score);
        
        for(int i=1; i<user_scores.length; i++){
            nameScore = user_scores[i];
            index = nameScore.indexOf(" ");
            name = nameScore.substring(0, index);
            scoreS = nameScore.substring(index+1);
            score = Integer.parseInt(scoreS);

            Integer min = Collections.min(map.values());
            String findKey = "";
            for(String key : map.keySet()) {
                if(map.get(key).equals(min)) {
                  findKey = key;
                  break;
                }
            }
            
            System.out.println("min"+min);

            
            if (map.containsKey(name) && map.get(name) < score){
                map.remove(name);
                map.put(name, score);
                entryList.sort(Map.Entry.comparingByValue());
                answer = answer + 1;
                System.out.println("3:"+i);
            } else if (!map.containsKey(name) && map.size()<K) {
            	System.out.println("ms:"+map.size());
            	 map.put(name, score);
            	 answer = answer + 1;
            	 System.out.println("1:"+i);
            } else if (!map.containsKey(name) && score > min && map.size()>K){
            	map.remove(findKey); 
                map.put(name, score);
                entryList.sort(Map.Entry.comparingByValue());
                answer = answer + 1;
                System.out.println("2:"+i);
            } 
            
            
        }

        System.out.println(answer);
        
	}
	

}
