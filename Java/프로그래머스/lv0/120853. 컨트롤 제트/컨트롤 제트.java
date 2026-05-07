import java.util.Stack;
import java.util.LinkedList;

class Solution {
    public int solution(String s) {
        
        int answer = 0;
        Stack<String> stack = new Stack<>();
        
        for(String str : s.split(" ")) {
            if(!str.equals("Z")) {
                stack.push(str);
            }
            else {
                stack.pop();
            }
        }
        
        while(!stack.empty()) {
            answer += Integer.parseInt(stack.pop());
        }
        
        
        return answer;
    }
}