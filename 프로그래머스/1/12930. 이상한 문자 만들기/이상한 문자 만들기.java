//스트링 빌더
//1. 문자열 s 갯수만큼 for문 돌리기
//2. 홀수면 대문자로 바꾸고, 짝수면 소문자
//3. 공백 나오면 공백도 저장하고 0으로 바꾸기.(문자열 카운트)


class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int num = 0;
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == ' '){
                num = 0;
                sb.append(c);
            }else{
                if( num %2 == 0){
                    sb.append(Character.toUpperCase(c));
                }else{
                    sb.append(Character.toLowerCase(c));
                }
                num ++;
            }
            
        }
        return sb.toString();
    }
}