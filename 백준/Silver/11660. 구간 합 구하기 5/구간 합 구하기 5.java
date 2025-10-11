import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //N : 배열 크기, M : 질의 갯수
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] A = new int[N+1][N+1];

        //1. 원본 배열 저장
        for(int i=1; i<=N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<=N; j++){
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[][] D = new int[N+1][N+1];
        //2. 합배열 저장
        for(int i=1; i<=N; i++){
            for(int j=1; j<=N; j++){
                D[i][j] = D[i-1][j] + D[i][j-1] + A[i][j] - D[i-1][j-1];
            }
        }

        //3. 질의 계산 및 출력
        for(int i = 0; i<M; i++){
            //질의 입력받기
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            //구간 합 배열로 질의 계산 하기
            int result = D[x2][y2] - D[x1-1][y2] - D[x2][y1-1] + D[x1-1][y1-1];
            System.out.println(result);
        }
    }
}