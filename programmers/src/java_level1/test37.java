package java_level1;

import java.util.*;

public class test37 {

	public static void main(String[] args) {
		
  		int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for (int i : ingredient) {
            list.add(i);
        }
        for(int i=list.indexOf(1); i<list.size()-3; i++){
            if(list.get(i) == 1 && list.get(i+1) == 2 && list.get(i+2) == 3 && list.get(i+3) == 1){
                list.remove(i);
                list.remove(i);
                list.remove(i);
                list.remove(i);
                answer ++;
                int frequency = Collections.frequency(list, 1);
                if(frequency > 1){
                    i = list.indexOf(1)-1;
                } else {
                    break;
                }
            }
        }
        System.out.println(answer);
    	}

}
