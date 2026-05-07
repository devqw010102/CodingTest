import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = n % 2 == 0 ? new int[n / 2] : new int[n / 2 + 1];
        
        ArrayList<Integer> list = new ArrayList<>();
        if(n == 1) answer[0] = 1;
        else {
            for(int i = 1; i <= n; i += 2) {
                list.add(i);
            }
            answer = list.stream().mapToInt(x -> x).toArray();
        }
        return answer;
    }
}