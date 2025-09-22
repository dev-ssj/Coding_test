import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        //입력받을 문자열 갯수
        int n = Integer.parseInt(br.readLine());
        int last = -1;

        //큐 정의
        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0; i<n; i++){
            String line = br.readLine();
            if(line.startsWith("push")){
                //offer : 큐에서 주어진 값을 넣는 명령어
                int val = Integer.parseInt(line.substring(5).trim());
                queue.offer(val);
                last = val; //마지막 값 갱신
            }else if(line.equals("pop")){
                //poll : 큐에서 값 하나를 출력하고 그 값을 큐에서 제거
                sb.append(queue.isEmpty()? -1 : queue.poll()).append('\n');
            }else if(line.equals("size")){
                //size : 큐에 들어있는 데이터의 개수 출력
                sb.append(queue.size()).append('\n');
            }else if(line.equals("empty")){
                //isEmpty : 큐가 비어있는지 확인. 비어있으면 true
                sb.append(queue.isEmpty() ? 1 : 0).append('\n');
            }else if(line.equals("front")){
                //peek : 큐에서 값 하나 출력 제거는 안함.
                sb.append(queue.isEmpty()? -1 : queue.peek()).append('\n');
            }else if(line.equals("back")){
                sb.append(queue.isEmpty()? -1 : last).append('\n');
            }
        }
        System.out.println(sb.toString());
    }
}