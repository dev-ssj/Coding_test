import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //N : 입력 받을 수의 갯수, M : 나눌 수
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        //합배열과 같은 나머지 인덱스 카운트 배열
        long[] S = new long[N];
        long[] C = new long[M];
        long answer = 0;

        //합배열 생성
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            //인덱스가 0이면 0-1시 예외발생하므로 if문으로 0인지 체크
            if(i==0){
                S[i] = Long.parseLong(st.nextToken());
            }else {
                S[i] = S[i - 1] + Long.parseLong(st.nextToken());
            }
        }
        //합배열의 모든값에 %M 하기
        for(int i=0; i<N; i++){
            int reminder = (int) (S[i] % M);
            //나머지가 0이면 결과값에 1씩 더하기
            if(reminder == 0) {
                answer += 1;
            }
            //나머지가 같은 인덱스의 개수 카운트하기(ex. 나머지가 1인 수가 3개면 C[1] = 3
            C[reminder]+=1;
        }

        for(int i=0; i<M; i++){
            //나머지가 같은 인덱스중 2개를 뽑는 경우의 수 이므로 인덱스의 값이 2이상인거만
            //ex. 6개면 6C2 -> 6*5 / 2 -> 15개.
            if(C[i] > 1){
                answer = answer + (C[i] *(C[i]-1)/ 2);
            }
        }
        System.out.println(answer);
    }
}