import java.util.Arrays;
class Solution {
    public int[] solution(int n) {
        //1. 먼저 약수의 갯수를 구한다.
        int num = 0;
        for(int i = 1; i <= n; i ++){
            if(n%i == 0) num ++;
        }
        
        //2. 구한 약수의 갯수로 배열 생성
        int[] answer = new int[num];
        
        int k = 0;  //배열 인덱스용 int 변수
        
        //3. 약수를 배열에 집어넣음(자동으로 오름차순으로 담아진다-> sort필요없음)
        for(int i = 1; i<= n; i++){
            if(n%i == 0){
                answer[k] = i;
                k++;
            }
        }
        
        return answer;
    }
}