package java_level1;

public class test13 {
	// 서울에서 김서방 찾기
	public static void main(String[] args) {
		String[] seoul = {"Park" , "Lee", "Bae", "Kim"};
		
		int order = 0;
        for(int i=0; i<seoul.length; i++){
             if(seoul[i].equals("Kim")){
                order = i;   
            }
        }
        String answer = "김서방은 " + order + "에 있다";
        System.out.println(answer);
     
	}

}
