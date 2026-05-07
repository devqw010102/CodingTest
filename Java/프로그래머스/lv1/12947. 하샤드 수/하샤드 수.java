class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        int num = 0;
        int ha = x;
        
        while(ha > 0) {
            num += ha % 10;
            ha /= 10;
        }
        return x % num == 0 ? true : false;
    }
}