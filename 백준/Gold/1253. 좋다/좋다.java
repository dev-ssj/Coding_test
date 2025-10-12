import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        //N : 수의 개수
        int N = Integer.parseInt(br.readLine());
        int count = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        long[] arr = new long[N];
        for (int i = 0; i < N; i++) {
            arr[i]= Long.parseLong(st.nextToken());
        }
        //배열 정렬
        Arrays.sort(arr);

        for(int k=0; k<N; k++){
            long find = arr[k];   //찾고자하는값
            int start = 0;
            int end = N-1;
            while (start < end){
                //합이 같으면
                if(arr[start] + arr[end] == find){
                    //find가 서로 다른 두 수의 합인지 체크 -> find가 5이고, start 0, end가 5일때와 같은 예외처리
                     if(start != k && end != k){
                         count ++;
                         break;
                     }else if(start==k){    //포인터중 하나가 타깃 k를 가리키면 그 포인터를 한칸 움직인다.
                        start ++;
                     }else if(end == k){
                         end --;
                     }
                //더한 값이 find보다 작으면 더 큰값을 만들기 위해 start++
                }else if(arr[start] + arr[end] < find){
                    start++;
                //더한 값이 find보다 크면 더 작은값을 만들기 위해 end--    
                }else{
                    end--;
                }
            }
        }
        System.out.println(count);
    }
}