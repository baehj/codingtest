package java_level1;

import java.util.Arrays;

public class test28 {
	// 예산
	public static void main(String[] args) {
		int[] d = {1,3,2,5,4};
		int budget = 9;
		int answer = 0;
        int sum = 0;
        Arrays.sort(d);
        for(int i=0; i<d.length; i++){
            sum += d[i];
            answer = i+1;
            if (sum > budget){
                sum = sum - d[i];
                answer = i;
                break;
            }
        }
        System.out.println(answer);
	}

}
