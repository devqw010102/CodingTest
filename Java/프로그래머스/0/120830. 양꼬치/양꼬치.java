class Solution {
    public int solution(int n, int k) {
        int answer = n / 10;
        return n * 12000 + (k - answer) * 2000;
    }
}