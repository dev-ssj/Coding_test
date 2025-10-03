import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int prev = -1;

        for (int x : arr) {
            if (x != prev) {
                list.add(x);
                prev = x;
            }
        }

        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) ans[i] = list.get(i);
        return ans;
    }
}