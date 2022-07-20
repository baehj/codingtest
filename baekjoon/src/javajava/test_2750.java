package javajava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class test_2750 {

	// 백준 2750번 문제 풀이1, Arrays.sort();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int [] nums = new int[n];
		for(int i=0; i<n; i++) {
			nums[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(nums);
		
		for(int i=0; i<n; i++) {
			System.out.println(nums[i]);
		}
	}

}
