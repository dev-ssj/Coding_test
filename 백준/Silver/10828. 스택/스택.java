import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

/**
 * @author : 선순주
 * @packageName :
 * @fileName : ${NAME}
 * @date : 2025-09-14
 * @description : ${DESCRIPTION}
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();

        //입력받을 문자열 갯수
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();   //스택 정의

        for(int i=0;i<n; i++){
            String line = br.readLine();    //명령어 입력받음
            if(line.startsWith("push")){
                //명령어가 push로 시작하면 push 이후 뒷부분(6번째 글자부터)자르고, 그 값을 stack에 넣는다
                stack.push(Integer.parseInt(line.substring(5).trim()));
            }else if(line.equals("pop")){
                //stack.empty() : 스택이 비었으면 true, 아니면 false
                //스택이 비어있으면 -1 + 개행, 비어있지않으면 pop()으로 맨 위 원소 꺼내고
                //StringBuilder에 결과와 개행을 붙여서 버퍼링(나중에 한번에 출력)
                out.append(stack.empty()? -1 : stack.pop()).append('\n');
            }else if(line.equals("size")){
                out.append(stack.size()).append('\n');
            }else if(line.equals("empty")){
                out.append(stack.empty()? 1 : 0).append('\n');
            }else if(line.equals("top")){
                out.append(stack.empty()? -1 : stack.peek()).append('\n');
            }
        }
        System.out.println(out.toString());
    }
}