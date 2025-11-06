import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(bf.readLine());
    int[] A = new int[N];
    for (int i = 0; i < N; i++) {
      A[i] = Integer.parseInt(bf.readLine());
    }
    Stack<Integer> stack = new Stack<>();
    StringBuffer sb = new StringBuffer();
    int num = 1; // 오름차순 수
    boolean result = true;
    for (int i = 0; i < A.length; i++) {
      int su = A[i]; // 현재 수열의 수
      if (su >= num) { //현재 수열 값 >= 오름차순 자연수 : 값이 같아 질 때까지 push()수행
        while (su >= num) { // push()
          stack.push(num++);
          sb.append("+\n");
        }
        stack.pop();
        sb.append("-\n");
      }
      else {  //현재 수열 값 < 오름차순 자연수: pop()을 수행하여 수열 원소를 꺼냅니다
        int n = stack.pop();
        // 스택의 가장 위의 수가 만들어야 하는 수열의 수 보다 크다면 수열 출력 불가능
        if (n > su) {
          System.out.println("NO");
          result = false;
          break;
        } //
        else {
          sb.append("-\n");
        }
      }
    }
    if (result) System.out.println(sb.toString());
  }
}