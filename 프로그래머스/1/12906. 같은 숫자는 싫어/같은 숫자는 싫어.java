import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int i : arr) {
            if (stack.empty() || !stack.peek().equals(i)) {
                stack.push(i);
            }
        }

        //남은 스택 사이즈 만큼 배열 생성 & 배열에 값 저장
        int n = stack.size();
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            answer[i] = stack.get(i);
        }
        return answer;
    }
}