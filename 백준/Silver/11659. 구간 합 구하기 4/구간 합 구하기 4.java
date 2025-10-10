import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        //첫줄 : 데이터의 개수, 질의 개수
        int num = Integer.parseInt(st.nextToken());
        int quizNo = Integer.parseInt(st.nextToken());

        //인덱스의 편의성을 활용하기 위해 num+1.
        //plus[0]은 아무것도 더하지 않은값인 0으로 세팅하기 위해서
        int[] plus = new int[num+1];
        st = new StringTokenizer(br.readLine());

        //합배열 구하기
        for(int i=1; i<=num; i++){
            plus[i] = plus[i-1] + Integer.parseInt(st.nextToken());
        }

        for(int q=0; q<quizNo; q++){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            System.out.println(plus[j] - plus[i-1]);
        }
    }
}