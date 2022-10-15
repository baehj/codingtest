package java_level1;

import java.util.ArrayList;

public class test35 {
	// 폰켓몬
	public static void main(String[] args) {
		int[] nums = {3,3,3,2,2,4};
		ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(!list.contains(nums[i])){
                list.add(nums[i]);
            }
        }
        int answer = 0;
        if(nums.length/2 < list.size()){
            answer = nums.length/2;
        }else{
            answer = list.size();
        }
        System.out.println(answer);
		
	}

}
