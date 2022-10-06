package java_level1;
//없는 숫자 더하기

public class test17 {
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,6,7,8,0};
		int sum1 = 0;
        int sum2 = 0;
        
        for(int i=0; i<10; i++){
            sum1 += i;
        }
        for(int i=0; i<numbers.length; i++){
            sum2 += numbers[i];
        }
        
        int answer = sum1 - sum2;
        System.out.println(answer);
	}
}
