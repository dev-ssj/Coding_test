import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < T; i++){
            int x = Integer.parseInt(br.readLine().trim());
            if(x == 0){
                stack.pop();
            }else{
                stack.push(x);
            }
        }
        int sum = 0;
        for(int i : stack){
            sum += i;
        }
        System.out.println(sum);
    }
}