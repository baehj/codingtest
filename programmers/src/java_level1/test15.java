package java_level1;


import java.util.ArrayList;
import java.util.Arrays;

public class test15 {
	// 제일 작은 수 제거하기

	public static void main(String[] args) {
		int[] arr = {4,3,2,1};
		int[] arr2 = arr.clone();
		int[] answer = {};
    	if(arr.length == 1){
            answer = new int[1];
            answer[0] = -1;
        } else {
            Arrays.sort(arr2);
        	ArrayList<Integer> list = new ArrayList<>();
            for (int element : arr) {
                if(element != arr2[0]){
                    list.add(element);
                }
            }
            answer = new int[arr.length-1];
	        answer = list.stream().mapToInt(i -> i).toArray();
    	}
    	System.out.println();
    	
	}
}