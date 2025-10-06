import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> m = new HashMap<>();
        for (int i = 0; i < participant.length; i++) {
            if (m.containsKey(participant[i])) {
                int n = m.get(participant[i]);
                m.put(participant[i], n + 1);
            } else {
                m.put(participant[i], 1);
            }
        }

        for (int i = 0; i < completion.length; i++) {
            if (m.containsKey(completion[i])) {
                int n = m.get(completion[i]);
                m.put(completion[i], n - 1);
            }
        }

        String answer = null;
        for (Map.Entry<String, Integer> entry : m.entrySet()) {
            if(entry.getValue() != 0){
                answer = entry.getKey();
            }
        }
        return answer;
    }
}