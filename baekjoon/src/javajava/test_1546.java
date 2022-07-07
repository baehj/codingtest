package javajava;

public class test_1546 {
	public static void main(String[] args) {
		
		int n = 9;
		int[] score = {10, 20, 30, 40, 50, 60, 70, 80, 90};
		
		// 로직 
		// 바뀐 점수의 평균식을 구하면 
		// -> score의 총합 * 100 / n * n의 최대값  
		
		long sum=0;
		long max=0;
		
		for (int i=0; i<score.length; i++) {
			sum += score[i];
			max = Math.max(max, score[i]);
		}
		
		// 여기서 100.0을 하면 결과값이 소수점형으로 나옴. 굳!
		double answer = ((sum * 100.0)/(n * max));
		
		System.out.println(answer);
		
	}
}
