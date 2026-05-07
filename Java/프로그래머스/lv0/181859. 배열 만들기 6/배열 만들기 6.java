import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        
        while(i < arr.length) {
            
            if(list.isEmpty()) {
                list.add(arr[i]);
                i++;
            }
            else if(list.get(list.size() - 1) == arr[i]) {
                list.remove(list.size() - 1);
                i++;
            }
            else if(list.get(list.size() - 1) != arr[i]) {
                list.add(arr[i]);
                i++;
            }
            
        }
        
        if(list.isEmpty()) {
            return new int[]{-1};
        }
        else {
            int[] answer = list.stream().mapToInt(x -> x).toArray();
            return answer;
        }
    }  
}