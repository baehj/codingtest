package java_level1;

public class test2 {
	// 나머지가 1이 되는 수 찾기

	public static void main(String[] args) {
		
		int n = 10;
		int answer = 0;
        
        for(int i=1; i<999999; i++){
            if(n%i==1){
                answer = i;
                break;
            }
        }
        
        System.out.println(answer);
        
	}

}
