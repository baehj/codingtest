package java_level1;

public class test19 {

	public static void main(String[] args) {
		String s = "abcsde";
		String answer = "";
        if(s.length()%2 == 1){
           answer = String.valueOf(s.charAt(s.length()/2));
        }else {
           answer =  String.valueOf(s.charAt(s.length()/2-1)) +  String.valueOf(s.charAt(s.length()/2));
        }
        System.out.println(answer);
	}

}
