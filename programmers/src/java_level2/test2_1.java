package java_level2;

import java.util.ArrayList;
import java.util.Arrays;

public class test2_1 {

	public static void main(String[] args) {
		// Lv. 2 오픈채팅방 (셀프문풀) -> 오답. 정확도 28.1
		
		String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234",
							"Enter uid1111 Bae","Change uid1111 Ryan2","Leave uid1111",
							"Enter uid1234 Prodo","Change uid4567 Ryan"};
		
		// 로직
		// 1. Leave의 경우 Enter 때의 네임을 더해줌
		// 2. 네임 변경 시(케이스2가지) 이전 내역의 이름들을 모두 바꿔줌 + 이후 내역 중 Leave 액션에 대해서도 이름 바꿔줌.
		// 3. 리스트를 만들어서 Enter일때 Leave일때 -님 들어왔습니다. 문장으로 순서대로 넣어줌. Change는 제외.
	
		// 1. Leave의 경우 Enter 때의 네임을 더해줌
		for(int i=0; i<record.length; i++) {
			int idx1 = record[i].indexOf(" "); 
			int idx_1 = record[i].lastIndexOf(" "); 
			String id1 = record[i].substring((idx1)+1, idx_1);
			String name1 = record[i].substring(idx_1+1);
			
			for(int j=0; j<record.length; j++) {
				int idx2 = record[j].indexOf(" ");
				int idx_2 = record[j].lastIndexOf(" "); 
				if (record[j].substring(0, idx2).equals("Leave")) {
					String id2 = record[j].substring((idx2)+1);
					if(id2.equals(id1) ) { // && (idx2==idx_2)
						record[j] = record[j] + " " + name1;
					}
				}
			}
		}	
		
		// 2. 네임 변경 시(케이스2가지) 이전 내역의 이름들을 모두 바꿔줌 + 이후 내역 중 Leave 액션에 대해서도 이름 바꿔줌.
		for(int i=0; i<record.length; i++) {
			int idx1 = record[i].indexOf(" "); 
			int idx_1 = record[i].lastIndexOf(" "); 
			String id1 = record[i].substring((idx1)+1, idx_1);
			String name1 = record[i].substring(idx_1+1);
			
			if (!record[i].substring(0, idx1).equals("Leave")) {
				for(int j=0; j<=i; j++) {
					int idx2 = record[j].indexOf(" "); 
					int idx_2 = record[j].lastIndexOf(" "); 
					String id2 = record[j].substring((idx2)+1, idx_2);
					String name2 = record[j].substring(idx_2+1);
					
					if(id2.equals(id1)) {
					record[j]= record[j].replace(name2, name1);
					}
				}
				for(int k=i; k<record.length; k++) {
					int idx2 = record[k].indexOf(" "); 
					int idx_2 = record[k].lastIndexOf(" "); 
					String id2 = record[k].substring((idx2)+1, idx_2);
					String name2 = record[k].substring(idx_2+1);
				
					if (record[k].substring(0, idx2).equals("Leave") && id2.equals(id1)) {
						record[k]= record[k].replace(name2, name1);
					}
				} 
			}
		}
		
		// 3. 리스트를 만들어서 Enter일때 Leave일때 -님 들어왔습니다. 문장으로 순서대로 넣어줌. Change는 제외.
		ArrayList<String> list = new ArrayList<String>();
		
		for(int i=0; i<record.length; i++) {
			int idx = record[i].indexOf(" "); 
			int idx_ = record[i].lastIndexOf(" ");
			String act = record[i].substring(0, idx);
			String name = record[i].substring(idx_+1);
			
			if (act.equals("Enter")) {
				list.add(name+"님이 들어왔습니다.");
			} else if (act.equals("Leave")) {
				list.add(name+"님이 나갔습니다.");
			} 
		}
		
		String[] answer = new String[list.size()];
		int i=0;
		for(String temp : list){
			 answer[i++] = temp ;
		}
	
		System.out.println(Arrays.toString(answer));
	}
}
