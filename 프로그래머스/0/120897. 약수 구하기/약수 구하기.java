import java.util.Arrays;
class Solution {
    public int[] solution(int n) {
        //1. 먼저 약수의 갯수를 구한다.
        int num = 0;
        for(int i = 1; i <= n; i ++){
            if(n%i == 0) num ++;
        }
        int[] answer = new int[num];
        
        int k = 0;
        for(int i = 1; i<= n; i++){
            if(n%i == 0){
                answer[k] = i;
                k++;
            }
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}