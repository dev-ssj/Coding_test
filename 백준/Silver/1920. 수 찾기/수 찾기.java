import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        //입력받을 정수의 갯수
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");


        for(int i=0; i < m; i++){
            if(Arrays.binarySearch(arr, Integer.parseInt(st.nextToken()))>= 0){
                sb.append(1).append('\n');
            }else{
                sb.append(0).append('\n');
            }
        }
        System.out.println(sb);

    }

}