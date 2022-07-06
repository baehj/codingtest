package java_level2;

import java.util.*;

public class test2_a {

	public static void main(String[] args) {
		// Lv. 2 오픈채팅방 (정답)
		
		String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234",
				"Enter uid1111 Bae","Change uid1111 Ryan2","Leave uid1111",
				"Enter uid1234 Prodo","Change uid4567 Ryan"};
		
		ArrayList<String> chatLog = new ArrayList<>();
        HashMap<String, String> nickMap = new HashMap<>();
        // HashMaP을 사용하는 이유. 키 중복 저장이 안되니까 ID당 1개의 이름을 업데이트 시킬 수 있음. 
        // 저장 순서가 관계없고 키값으로 밸류값을 불러올때 사용.
        
        for(String log : record){
            StringTokenizer st = new StringTokenizer(log);
            // Tokenizer -> 문자열 분리기능
            // 1) StringTokenizer st = new StringTokenizer(문자열); -> 띄어쓰기 기준으로 문자열을 분리함
            // 2) StringTokenizer st = new StringTokenizer(문자열,구분자); -> 구분자를 기준으로 문자열을 분리함
            // 3) StringTokenizer st = new StringTokenizer(문자열,구분자,true/false);
            // 		-> 구분자를 기준으로 문자열을 분리할 때 구분자도 토큰에 넣을 것인지(true) 구분자는 포함 안시킬지(false)
            
            // 명령어,id,닉네임저장
            // 닉네임은 일단 null
            String command = st.nextToken();
            String userId = st.nextToken();
            String nickname = "";
            
            // 왜냐하면 Leave일 경우 닉네임이 없어서 에러남
            if(!command.equals("Leave")){
                nickname = st.nextToken();
            }
            
            // 명령어가 엔터일 경우 nickMap에 아이디를 키로, 닉네임을 벨류로 저장하고
            // chatlog에 userId + "님이 들어왔습니다." 의 내용을 순서대로 입력 
            switch(command){
                case "Enter":
                    nickMap.put(userId, nickname);
                    chatLog.add(userId + "님이 들어왔습니다.");
                    break;
                case "Leave":
                    chatLog.add(userId + "님이 나갔습니다.");
                    break;
                case "Change":
                    nickMap.put(userId, nickname);
                    break;
            }
        }
        
        // chatLog를 스트링형 answer로 출력
        String[] answer = new String[chatLog.size()];
        int logIdx = 0;
        
        for(String str : chatLog){
        // "님"으로 잘라서 id 뽑기 
        	int endOfId = str.indexOf("님");
            String userId = str.substring(0, endOfId);
        // answer배열에 chatLog의 (id를 -> 해시맵 nickMap의 해당 id의 value값인 name으로)변경하여 넣기 
            answer[logIdx++] = str.replace(userId, nickMap.get(userId));
        }
        
        System.out.println(Arrays.toString(answer));
	}
}
