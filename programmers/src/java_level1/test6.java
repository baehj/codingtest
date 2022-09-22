package java_level1;

import java.util.ArrayList;

public class test6 {
	//자연수 뒤집어 배열로 만들기
	public static void main(String[] args) {
			long n = 12345;
			ArrayList<Integer> list = new ArrayList<Integer>();
			do {
	            int num = (int) (n % 10);
	            list.add(num);
	            n = n/10;
	        } while(n!=0);
			int answer[] = list.stream().mapToInt(i->i).toArray();
    }
}
