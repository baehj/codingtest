package java_level1;

public class test30 {
	//최소직사각형
	public static void main(String[] args) {
		int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
	        int answer = 0;
	        int max1=0;
	        int max2=0;
	        for(int i=0; i<sizes.length; i++){ // 앞 숫자가 작게, 뒷 숫자가 크게 변경
	            int temp = 0;
	            if(sizes[i][0] > sizes[i][1]){
	                temp = sizes[i][0];
	                sizes[i][0] = sizes[i][1];
	                sizes[i][1] = temp;
	            }
	        }
	        for(int i=0; i<sizes.length; i++){ // 
	            if(sizes[i][0] > max1){
	                max1 = sizes[i][0];
	            } 
	            if(sizes[i][1] > max2){
	                max2 = sizes[i][1];
	            } 
	        }
	        answer = max1 * max2;
	        System.out.println(answer);
	    
	}
}
