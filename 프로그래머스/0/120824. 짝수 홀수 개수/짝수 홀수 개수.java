class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        
        //num_list의 길이만큼 for문 동작
        for(int i=0; i<num_list.length; i++){
            if(num_list[i]%2 == 0){ //해당 num_list의 값이 2로 나눴을때 0이면(짝수이면)
                answer[0] += 1;     //answer[0]에 1을 더한다
            }else{                  //그게 아니라면(홀수 이면)
                answer[1] += 1;     //answer[1]에 1을 더한다
            }
        }
        return answer;
    }
}