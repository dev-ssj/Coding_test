import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        //첫줄 : 과목 개수
        int N = Integer.parseInt(br.readLine());

        //두번째 줄 : 점수들(공백으로 구분)
        StringTokenizer st = new StringTokenizer(br.readLine());

        //최댓값을 저장할 변수
        int max = 0;

        //점수를 저장할 배열
        int[] score = new int[N];

        //각 배열 인덱스에 점수 넣기 + 최댓값 찾기
        for(int i=0; i<N; i++){
            score[i] = Integer.parseInt(st.nextToken());
            if(score[i] > max){
                max = score[i];
            }
        }

        double sum = 0.0;
        for(int i = 0; i<N; i++){
            sum += ((double) score[i] /max) * 100;
        }

        double avg = sum / N;

        //출력
        System.out.println(avg);

    }
}