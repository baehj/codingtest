package test_221017;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class test1 {

	public static void main(String[] args) {
		String[] orders = {"알렉스뭐시기"};
	        String[] answer = {};
	        
	        //HashMap<String, String> map = new HashMap<>();
	        HashMap<String, Set<String>> map = new HashMap<>();
	        for(int i=0; i<orders.length; i++){
	            String name = orders[i].split(" ")[0];
	            int count = 0;
	            for (int j=0; j<orders[i].length(); j++) {
	                if (orders[i].charAt(j) == 32) {
	                    count++;
	                }
	            }
	            // 만약 name을 key로 갖는 값이 있으면? 해당이름의 value인 set에 menu를 put하고
	            if(map.containsKey(name)){
	                Set<String> set = map.get(name);
	                for(int j=1; j<count+1; j++){ // 공백의 개수 만큼 
	                    String menu = orders[i].split(" ")[j]; // 메뉴
	                    set.add(menu);
	                }
	                map.replace(name, set);
	            // 만약 name을 key로 갖는 값이 없으면? 새로 이름,menu set을 put 하고.
	            } else {
	                Set<String> set = new HashSet<String>();
	                for(int j=1; j<count+1; j++){ // 공백의 개수 만큼 
	                    String menu = orders[i].split(" ")[j]; // 메뉴
	                    set.add(menu);
	                }
	                map.put(name, set);
	            }
	        }

	        int max = 0;
	        ArrayList<String> list = new ArrayList<>();
	        for (String key : map.keySet()) {
	            Set<String> set = map.get(key);
	            if(set.size() > max) {
	                list.clear();
	                list.add(key);
	                max = set.size();
	            } else if (set.size() == max){
	                list.add(key);
	            }
	        }
	        Collections.sort(list);
	        answer = list.toArray(new String[list.size()]);
	        System.out.println(answer);

	}

}
