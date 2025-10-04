import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        //큐 정의
        Queue<Integer> queue = new LinkedList<Integer>();

        //1부터 N까지 차례대로 큐에 넣기
        for(int i = 1; i <= N; i++) {
            queue.add(i);
        }

        while (queue.size() > 1){
            queue.poll();
            int temp = queue.poll();
            queue.offer(temp);

        }
        System.out.println(queue.poll());
    }
}