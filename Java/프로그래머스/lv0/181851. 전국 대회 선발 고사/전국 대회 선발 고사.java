import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < rank.length; i++) {
            if(attendance[i]) {
                map.put(rank[i], i);
            }
        }
        
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list);
        
        return map.get(list.get(0)) * 10000 + map.get(list.get(1)) * 100 + map.get(list.get(2));
    }
}