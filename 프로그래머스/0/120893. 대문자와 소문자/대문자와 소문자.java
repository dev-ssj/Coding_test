class Solution {
    public String solution(String my_string) {
        String answer = "";
        for (int i = 0; i< my_string.length(); i++){
            if(Character.isUpperCase(my_string.charAt(i))){             //i의 값이 대문자일경우(true 반환)
                answer += Character.toLowerCase(my_string.charAt(i));   //소문자로 변환 후 answer에 저장
            }else{
                answer += Character.toUpperCase(my_string.charAt(i));
            }
        }
        return answer;
    }
}