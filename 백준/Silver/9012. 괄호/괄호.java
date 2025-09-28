import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        //입력받을 문자열 갯수
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i< T; i++){
            sb.append(solve(br.readLine())).append('\n');
        }
        System.out.println(sb);
    }

    public static String solve(String s){
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);

            //여는 괄호일 경우 스택에 넣는다.
            if(c=='('){
                stack.push(c);
            }

            //닫는 괄호일 경우
            else if (c == ')') {
                //stack이 비어있으면(즉, 짝꿍인 여는 괄호가 없으면)
                if (stack.empty()) {
                    return "NO";
                }
                //그게 아니라면(정상적이라면)
                stack.pop();
            }
        }

        if(stack.empty()){
            return "YES";
        }else {
            return "NO";
        }
    }
}