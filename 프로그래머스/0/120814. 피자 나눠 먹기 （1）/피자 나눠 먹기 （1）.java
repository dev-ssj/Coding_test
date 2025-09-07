class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n >= 1 && n <= 100){
            if(n % 7 == 0){         //7로 나눴을 때 나머지가 없으면
                answer = n / 7;      //몫 출력
            }else{
                answer = (n / 7) + 1;    //나머지가 있으면 몫 + 1 출력
            }
        }
        
        return answer;
    }
}