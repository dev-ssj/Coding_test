import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //N : 재료의 갯수
        int N = Integer.parseInt(br.readLine());

        //M : 갑옷이 완성되는 번호의 합
        int M = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i]= Integer.parseInt(st.nextToken());
        }
        //배열 정렬
        Arrays.sort(arr);

        int count = 0;
        int start = 0;
        //배열 인덱스는 0부터 시작이므로 끝 값은 N-1
        int end = N-1;
        
        //start가 end보다 작을때까지
        while(start<end){
            if(arr[start]+arr[end] < M){
                start++;
            }else if(arr[start]+arr[end] > M){
                end--;
            }else{
                count++;
                start++;
                end--;
            }
        }
        System.out.println(count);
    }

}