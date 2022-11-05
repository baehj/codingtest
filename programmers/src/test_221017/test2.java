package test_221017;

import java.util.Stack;

public class test2 {

	public static void main(String[] args) {
		 int[] arr = {1,3,2};
		 boolean answer = true;
	        Stack<Integer> stack = new Stack<>();
	        int num = 1;
	        for(int i=0; i<arr.length; i++){
	          if(arr[i] >= num){ // arr[i]의 값까지 push
	              while(arr[i] >= num){
	                  stack.push(num++);
	              }
	              stack.pop(); // arr
	          } else {
	              int n = stack.pop();
	              if (n > arr[i]){
	                  answer = false;
	                  break;
	              }
	          }
	        }
	        System.out.println(answer);

	}

}
