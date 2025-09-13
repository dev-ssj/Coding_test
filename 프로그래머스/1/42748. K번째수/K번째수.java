import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int idx = 0; idx < commands.length; idx ++){
            int i = commands[idx][0];
            int j = commands[idx][1];
            int k = commands[idx][2];
            
            //i부터 j까지 자르기(인덱스는 0부터시작)
            int[] slices = Arrays.copyOfRange(array, i-1,j);
            
            //배열 정렬
            Arrays.sort(slices);
            
            answer[idx] = slices[k-1];
        }
        return answer;
    }
}