package java_level1;

public class test29 {
	// [1차] 비밀지도
	public static void main(String[] args) {
		int n = 6;
		int[] arr1 = {46, 33, 33, 22, 31, 50};
		int[] arr2 = {27, 56, 19, 14, 14, 10};
		
		String[] answer = new String[n];
        String[] arr1String = new String[n];
        String[] arr2String = new String[n];
        char[][] check = new char[n][n];
        
        for(int i=0; i<n; i++){ // 10진법을 2진법으로 
            arr1String[i] = Integer.toString(arr1[i],2);
            arr2String[i] = Integer.toString(arr2[i],2);
        }
        
        for(int i=0; i<n; i++){
            while(arr1String[i].length() < n){ // 2진법 숫자 5자리로 맞추기
                arr1String[i] = "0" + arr1String[i];
            }
            while(arr2String[i].length() < n){ 
                arr2String[i] = "0" + arr2String[i];
            }
        }
        
        for(int i=0; i<n; i++){
            char[] charArray1 = arr1String[i].toCharArray(); //String배열의 2진법 숫자를 char 2차배열로 쪼개 담기.
            char[] charArray2 = arr2String[i].toCharArray();  
            for(int j=0; j<n; j++){
                if(charArray1[j] == '1' || charArray2[j] == '1'){
                    check[i][j] = '1';
                } else {
                    check[i][j] = '0';
                }
            }
        }
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(j==0){
                    if(check[i][j] == '1'){
                        answer[i] = "#";
                    } else {
                        answer[i] = " ";
                    }
                } else {
                    if (check[i][j] == '1'){
                        answer[i] += "#";
                    } else {
                        answer[i] += " ";
                    }
                }
            }            
        }
        System.out.println(answer);
	}

}
