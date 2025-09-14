import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int solution(String s) {
         //숫자 배열 생성
        String array[] = {"zero", "one", "two", "three", "four", "five","six","seven","eight","nine"};
        //배열 갯수만큼 for문 실행
        for(int i = 0; i < array.length; i++){
            s = s.replace(array[i], String.valueOf(i));
        }
        return Integer.parseInt(s);
    }
}