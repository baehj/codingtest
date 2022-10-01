package java_level2;
	// 최댓값과 최솟값
public class test4 {
	public static void main(String[] args) {
		String s = "-1 -2 -3 -4"; 
		String answer = "";
	    String[] numbers = s.split(" ");
	    
	    int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        //Integer.MAX_VALUE, Integer.MIN_VALUE 필드는 정수의 최대값과 최소값을 표현
	    
	    for(int i = 0; i < numbers.length; i++){
            int number = Integer.parseInt(numbers[i]);
            min = Math.min(min, number);
            max = Math.max(max, number);
        }
	    
	    answer = numbers[0] +" "+numbers[numbers.length-1];
	    System.out.println(answer);
	}
}
