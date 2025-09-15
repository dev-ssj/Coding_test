import java.util.Scanner;

/**
 * @author : 선순주
 * @packageName :
 * @fileName : ${NAME}
 * @date : 2025-09-15
 * @description : ${DESCRIPTION}
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //과목 갯수
        int n = sc.nextInt();
        //점수 받을 배열
        double score[] = new double[n];
        //평균, 높은 점수, 합 변수
        double avg = 0, max = 0, sum = 0;

        //배열 길이 만큼 for문 실행하여 점수 받은 후 제일 높은 점수 판별
        for(int i=0;i< score.length;i++){
            score[i] = sc.nextInt();

            if(score[i]>max) {
                max = score[i];
            }
        }
        
        //제일 높은 점수로 각 점수들 나누기 *100
        for(int i=0; i<score.length; i++){
            sum += (score[i]/max)*100;
        }
        sc.close();

        //평균값 구하기
        avg = sum / n;
        System.out.println(avg);

    }
}