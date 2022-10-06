package java_level1;
// 수박수박수박수박수박수?
public class test18 {
	public static void main(String[] args) {
		int n = 3;
		String answer = "";
        if(n%2==1){
            for(int i=0; i<n/2; i++){
                answer += "수박";
            }
            answer += "수";
        } else {
            for(int i=0; i<n/2; i++){
                answer += "수박";
            }
        }
        System.out.println(answer);
	}
}
