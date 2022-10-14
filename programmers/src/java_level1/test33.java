package java_level1;

public class test33 {
	// 숫자 문자열과 영단어
	public static void main(String[] args) {
		String s = "one4seveneight";
        int answer = 0;
        String answer1 = "";
        char[] sChar = s.toCharArray();
        String number = "";
        for(int i=0; i<s.length(); i++){
            if(sChar[i] > 57){
                number += String.valueOf(sChar[i]);
                switch(number) {
                    case "zero" : answer1 += 0; number = ""; break;
                    case "one" : answer1 += 1; number = ""; break;
                    case "two" : answer1 += 2; number = ""; break;
                    case "three" : answer1 += 3; number = ""; break;
                    case "four" : answer1 += 4; number = ""; break;
                    case "five" : answer1 += 5; number = ""; break;
                    case "six" : answer1 += 6; number = ""; break;
                    case "seven" : answer1 += 7; number = ""; break;
                    case "eight" : answer1 += 8; number = ""; break;
                    case "nine" : answer1 += 9; number = ""; break;
                }
                //System.out.println(number);
            } else{
                answer1 += sChar[i];
            }
        }
        answer = Integer.parseInt(answer1);
        System.out.println(answer);
    }
}
