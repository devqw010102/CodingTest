import java.util.*;

class Solution {
    public int[] solution(int n) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        if(n == 1)
            return new int[] {1};
        else {
            for(int i = 1; i < n / 2; i++) {
                if(n % i == 0){
                    list.add(i);
                    list.add(n / i);
                }
            }
            Collections.sort(list);
            
            return list.stream().distinct().mapToInt(x -> x).toArray();
        }
    }
}