import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int last = -1;

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            String line = br.readLine();

            switch (line.charAt(0)) {
                case 'p': // push or pop
                    // "push X" 또는 "pop"
                    if (line.charAt(1) == 'u') { // "push"
                        int val = Integer.parseInt(line.substring(5)); // "push " 이후 숫자
                        queue.offer(val);
                        last = val;
                    } else { // "pop"
                        sb.append(queue.isEmpty() ? -1 : queue.poll()).append('\n');
                    }
                    break;
                case 's': // size
                    sb.append(queue.size()).append('\n');
                    break;
                case 'e': // empty
                    sb.append(queue.isEmpty() ? 1 : 0).append('\n');
                    break;
                case 'f': // front
                    sb.append(queue.isEmpty() ? -1 : queue.peek()).append('\n');
                    break;
                case 'b': // back
                    sb.append(queue.isEmpty() ? -1 : last).append('\n');
                    break;
                default:
                    // (입력 포맷이 정해져 있으므로 도달하지 않음)
                    break;
            }
        }

        System.out.print(sb.toString());
    }
}