class Solution {
    public long solution(int balls, int share) {
        long answer = 1;
        
        //5C3 -> 5x4 / 2x1
        for(int i = 0; i<share; i++){
            answer *= (balls - i);  //분자
            answer /= (i+1);    //분모
        }
        
        return answer;
    }
}