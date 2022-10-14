package java_level1;

public class test31 {
	// 문자열 내 마음대로 정렬하기
	public static void main(String[] args) {
			String[] strings = {"sun", "bed", "car"};
			int n = 1;
	        String[] strings2 = strings;
	        String temp = "";
	        for(int i=strings.length-1; i>0; i--){
	            for(int j=0; j<i; j++){
	                if(strings2[j].charAt(n) > strings2[j+1].charAt(n)){
	                    temp = strings2[j];
	                    strings2[j] = strings2[j+1];
	                    strings2[j+1] = temp;
	                }else if(strings2[j].charAt(n) == strings2[j+1].charAt(n)){
	                    if((strings2[j].compareTo(strings2[j+1])) > 0){ // j+1이 더 크면 -
	                        temp = strings2[j];
	                        strings2[j] = strings2[j+1];
	                        strings2[j+1] = temp;
	                    }
	               }
	           }
	       }

	}

}
