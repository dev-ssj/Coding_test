import java.util.*;
class Solution {
    public ArrayList<Integer> solution(int[] progresses, int[] speeds) {
        Queue<Integer> q = new LinkedList<Integer>();
        ArrayList<Integer> answer = new ArrayList<Integer>();

        //큐에 작업일수 저장
        for (int i = 0; i < progresses.length; i++) {
            q.add((int) Math.ceil((100.0 - progresses[i]) / speeds[i]));
        }

        //큐가 비어있을 때까지 while문 실행
        while (!q.isEmpty()) {
            //큐에서 꺼낸값을 minDays에 저장 후 , count의 초기값 1로 지정(count : 함께 배포되는 기능의 수)
            int minDays = q.poll();
            int count = 1;

            //큐가 비어있지 않고, 현재 큐의 첫번째 값이 minDays보다 작거나 같을 때 q에서 제거 후 count 증분
            while (!q.isEmpty() && q.peek() <= minDays) {
                q.poll();
                count++;
            }
            //count값을 answer에 추가
            answer.add(count);
        }
        return answer;
    }
}