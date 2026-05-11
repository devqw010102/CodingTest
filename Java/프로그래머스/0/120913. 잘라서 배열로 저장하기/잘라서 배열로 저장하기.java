import java.util.*;
class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = {};
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < my_str.length(); i += n) {
            list.add(my_str.substring(i, Math.min(my_str.length(), i + n)));
        }
        return list.toArray(new String[0]);
    }
}