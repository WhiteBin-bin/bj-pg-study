import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        
        Map<String, String> map = new HashMap<>();
        List<String[]> logs = new ArrayList<>();
        
        for (String r : record) {
            String[] split = r.split(" ");
            String command = split[0];
            String uid = split[1];
            
            if (command.equals("Enter") || command.equals("Change")) {
                String nickname = split[2];
                map.put(uid, nickname);
            }

            if (!command.equals("Change")) {
                logs.add(new String[]{command, uid});
            }
        }
        
        String[] arr = new String[logs.size()];
        int idx = 0;

        for (String[] log : logs) {
            String command = log[0];
            String uid = log[1];
            String nickname = map.get(uid);

            if (command.equals("Enter")) {
                arr[idx++] = nickname + "님이 들어왔습니다.";
            } else {
                arr[idx++] = nickname + "님이 나갔습니다.";
            }
        }

        return arr;
    }
}