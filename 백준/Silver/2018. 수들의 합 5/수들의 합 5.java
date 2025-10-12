import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //N : 입력 받을 수의 갯수
        int N = Integer.parseInt(st.nextToken());

        //예시의 경우, 15처럼 연속된 수가 아닌 하나의 수로도 합을 나타낼수 있기때문에 미리 1세팅
        int count = 1;
        //start와 end가 1로 시작하므로, sum도 1로 초기값 세팅
        int sum = 1;
        int start = 1;
        int end = 1;
        //end가 N이 아닐때까지 출력
        // (end가 N일때는 마지막 값에서 하나의 수로도 합을 나타낼 수 있기 때문에-> 이 경우는 이미 count = 1로 미리 세팅해둠)
        while (end != N){
            //sum과 n이 같으면 count ++, end 한칸 뒤로 옮긴 후 그값을 sum에 더해줌
            if(sum==N){
                count++;
                end ++;
                sum = sum + end;
            
            //sum이 N보다 크면 sum에서 start를 빼주고, start 한칸 뒤로 옮김    
            }else if (sum > N){
                sum = sum - start;
                start++;
             
            //sum이 N보다 작으면 end를 한칸 뒤로 옮기고, sum에 end를 더함    
            }else {
                end++;
                sum=sum+end;
            }
        }
        System.out.println(count);
    }
}