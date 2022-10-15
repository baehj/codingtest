package java_level1;
import java.util.*;

public class test34 {
	// 두 개 뽑아서 더하기
	public static void main(String[] args) {
		
			int[] numbers = {2,1,3,4,1};
	
	        int[] answer = {};
	        ArrayList<Integer> list = new ArrayList<>();
	        
	        for(int i=0; i<numbers.length; i++){
	            for(int j=i+1; j<numbers.length; j++){
	                if(!list.contains(numbers[i]+numbers[j])){
	                    list.add(numbers[i]+numbers[j]);
	                }
	            }
	        }
	        Collections.sort(list);
	        answer = list.stream().mapToInt(i->i).toArray();
	        
	        System.out.println(answer);
		

	}

}
