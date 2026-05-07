class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        
        // OR = ∨
        // AND = ∧
        
        boolean answer = true;
        
        boolean first;
        boolean second;
        
        first = x1 || x2 ? true : false;
        second = x3 || x4 ? true : false;
        answer = first && second ? true : false;
        
        return answer;
    }
}