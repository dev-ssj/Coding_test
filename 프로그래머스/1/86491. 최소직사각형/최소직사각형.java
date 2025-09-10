import java.util.*;
/* 각 명함은 가로/세로 90도 돌릴 수 있다. 명함마다 큰쪽이 garo, 작은쪽이 sero
* 직사각형의 가로길이는 모든 명함의 큰 쪽들 중 최대값, 세로길이는 모든 명함의 작은 쪽들 중 최대값
*/
class Solution {
    public int solution(int[][] sizes) {
        int garo = 0;
        int sero = 0;
        for(int i = 0; i<sizes.length; i++){
            //현재 명함에서 더 큰 값을 저장
          int max_now = Math.max(sizes[i][0], sizes[i][1]);
            //현재 명함에서 더 작은 값을 저장
          int min_now = Math.min(sizes[i][0], sizes[i][1]);
            
            //지금까지의 가로 최댓값 갱신
            garo =  Math.max(garo, max_now);
            //지금까지의 세로 최댓값 갱신
            sero =  Math.max(sero, min_now);
        }
        return garo*sero;
    }
}