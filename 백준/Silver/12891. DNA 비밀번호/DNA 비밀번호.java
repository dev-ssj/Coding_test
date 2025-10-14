import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    static int checkArr[];
    static int myArr[];
    static int checkSecret;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        //DNA 문자열의 길이
        int S = Integer.parseInt(st.nextToken());
        //부분 문자열의 길이
        int P = Integer.parseInt(st.nextToken());
        //정답 값 저장받을 변수
        int Result = 0;
        //비밀번호 체크 배열(A가 몇개 필요한지, G가 몇개 필요한지 등 기준 저장 하는 배열. 예시에서는 2 0 1 1)
        checkArr = new int[4];
        //현재 상태 저장할 배열(현재 A가 몇개있고, G가 몇개 있고.. myArr의 값이 checkArr와 같으면 조건 충족되는것 ->checkSecret++)
        myArr = new int[4];
        //4개중 현재 몇개가 비밀번호 요건에 충족되는지 카운트 하는 변수 -> checkSecret이 4면 result ++
        checkSecret = 0;
        //문자열을 입력받을 배열
        char[] A = bf.readLine().toCharArray();

        st = new StringTokenizer(bf.readLine());
        //각각의 dna가 몇개 필요한지 입력 받는 for문(2 0 1 1)
        for (int i = 0; i < 4; i++) {
            checkArr[i] = Integer.parseInt(st.nextToken());
            //checkArr[i]가 0이면 해당 DNA는 없어도됨 -> 이미 조건이 충족되었으니 checkSecret++
            if (checkArr[i] == 0)
                checkSecret++;
        }

        //초기(첫번째) 부분 문자열 처리 부분
        for (int i = 0; i < P; i++) {
            Add(A[i]);
        }

        //checkSecret이 4 -> 조건 모두 충족하여 유효한 비밀번호임
        if (checkSecret == 4)
            Result++;

        // 슬라이딩 윈도우 처리 부분
        //end : 한칸씩 오른쪽으로 옮기면서 추가할 부분(end_index라고 생각하면됨)
        //start : 한칸씩 오른쪽으로 옮기면서 삭제할 부분(start_index)
        for (int end = P; end < S; end++) { //예시) S가 4, P가 2라면 end는 A[2]의 값을 추가하고, start는 2-2=0 으로 A[0]의 값을 제거한다.
            int start = end - P;
            Add(A[end]);
            Remove(A[start]);
            if (checkSecret == 4)
                Result++;
        }
        System.out.println(Result);
        bf.close();
    }

    //새로 들어운 문자를 처리해주는 메서드
    //각각의 문자열 중 같은게 있으면 myArr[]에 1을 더해주고, myArr[]과 checkArr[]가 같다면 checkSecret++
    private static void Add(char c) {
        switch (c) {
            case 'A':
                myArr[0]++;
                if (myArr[0] == checkArr[0])
                    checkSecret++;
                break;
            case 'C':
                myArr[1]++;
                if (myArr[1] == checkArr[1])
                    checkSecret++;
                break;
            case 'G':
                myArr[2]++;
                if (myArr[2] == checkArr[2])
                    checkSecret++;
                break;
            case 'T':
                myArr[3]++;
                if (myArr[3] == checkArr[3])
                    checkSecret++;
                break;
        }
    }

    //제거되는  문자를 처리해주는 메서드
    //각각의 문자열 중 같은게 있으면 myArr[]에 1을 빼주고, myArr[]과 checkArr[]가 같다면 checkSecret--
    private static void Remove(char c) { 
        switch (c) {
            case 'A':
                if (myArr[0] == checkArr[0])
                    checkSecret--;
                myArr[0]--;
                break;
            case 'C':
                if (myArr[1] == checkArr[1])
                    checkSecret--;
                myArr[1]--;
                break;
            case 'G':
                if (myArr[2] == checkArr[2])
                    checkSecret--;
                myArr[2]--;
                break;
            case 'T':
                if (myArr[3] == checkArr[3])
                    checkSecret--;
                myArr[3]--;
                break;
        }
    }
}