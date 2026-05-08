import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {

        Queue<String> card1 = new LinkedList<>();
        Queue<String> card2 = new LinkedList<>();
        
        for(String c : cards1) {
            card1.offer(c);
        }
        for(String c : cards2) {
            card2.offer(c);
        }
        
        for(String word : goal) {
            if(word.equals(card1.peek())) {
                card1.poll();
            }
            else if(word.equals(card2.peek())) {
                card2.poll();
            }
            else {
                return "No";
            }
        }
        return "Yes";
    }
}