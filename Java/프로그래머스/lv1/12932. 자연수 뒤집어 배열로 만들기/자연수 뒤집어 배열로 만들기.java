import java.util.*;

class Solution {
    public int[] solution(long n) {
        
        ArrayList<Integer> list = new ArrayList<>();
        String str = n + "";
        
        for(int i = str.length() - 1; i >= 0; i--) {
            list.add(Integer.parseInt(str.charAt(i) + ""));
        }
        
        
        int[] answer = list.stream().mapToInt(x -> x).toArray();
        return answer;
    }
}