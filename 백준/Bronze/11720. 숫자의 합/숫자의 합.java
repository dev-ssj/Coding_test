import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        //입력받을 정수의 갯수
        int N = Integer.parseInt(br.readLine());

        //N개의 숫자가 붙어있는 문자열
        String nums = br.readLine().trim();

        int sum = 0;
        for(int i=0; i<N; i++){
            int c = nums.charAt(i)-'0'; //문자 -> 숫자 변환
            sum += c;
        }

        //출력
        System.out.println(sum);

    }
}