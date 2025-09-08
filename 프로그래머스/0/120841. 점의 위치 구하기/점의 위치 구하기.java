class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        if(dot[0] > 0){         //x의 좌표가 양수
            if(dot[1] > 0){     //y의 좌표가 양수
                answer = 1;
            }else{              //y의 좌표가 음수
                answer = 4;
            }        
        }else{                  //x의 좌표가 음수
            if(dot[1] > 0){     //y의 좌표가 양수
                answer = 2;
            }else{              //y의 좌표가 음수
                answer = 3;     
            }
        }
        return answer;
    }
}