package java_level1;

public class test27 {
	// 시저 암호
	public static void main(String[] args) {
		String s = "a B z";
		int n = 4;
		char[] sChar = s.toCharArray();
        for(int i=0; i<s.length(); i++){
            if(sChar[i]!=32){ // 공백이 아닐때
                if (sChar[i] > 64 && sChar[i] < 91) { // 대문자라면
                    sChar[i] += n;
                    if(sChar[i] > 90){
                        sChar[i] -= 26;
                    }
                } else if (sChar[i] > 96) { // 소문자라면
                    sChar[i] += n;
                    if(sChar[i] > 122){
                        sChar[i] -= 26;
                    }
                }
            }
        }
        String answer = String.valueOf(sChar);
        System.out.println(answer);
	}

}
