package java_level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class test14 {
	// 나누어 떨어지는 숫자 배열

	public static void main(String[] args) {
		int[] arr = {5, 9, 7, 10};
		int divisor = 5;
		int[] answer = {};
	    
		ArrayList<Integer> list = new ArrayList<>();
	    for(int i=0; i<arr.length; i++){
	        if(arr[i]%divisor == 0){
	        	list.add(arr[i]);
	        }
        }
        if(list.size()==0){
            answer = new int[1];
            answer[0] = -1;
        }else {
            answer = new int[list.size()];
            Collections.sort(list);
            for(int i=0; i<list.size(); i++){
	                answer[i] = list.get(i);
            }
        }
        System.out.println(Arrays.toString(answer));
	}

}
