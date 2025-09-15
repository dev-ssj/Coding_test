import java.util.HashSet;
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

        HashSet<Integer> h = new HashSet<Integer>();

        for(int i=0; i<10; i++){
            h.add(sc.nextInt()%42);
        }
        sc.close();
        System.out.println(h.size());
    }
}