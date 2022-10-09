package java_level1;

public class test25 {
	// 부족한 금액 계산하기
	public static void main(String[] args) {
		int price = 3;
		int money = 20;
		int count = 4;
        long answer = 0;
        for(int i=1; i<=count; i++){
            answer += price*i;
        }
        answer = answer - money;
        if(answer <= 0){
            answer = 0;
        }
        System.out.println(answer);

	}

}
