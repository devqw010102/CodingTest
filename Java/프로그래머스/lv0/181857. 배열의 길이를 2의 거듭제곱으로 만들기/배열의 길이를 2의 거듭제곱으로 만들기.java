class Solution {
    public int[] solution(int[] arr) {

        int length = arr.length;
        int n = 1;
        
        while(n < length) {
            n *= 2;
        }
        
        int[] answer = new int[n];
        System.arraycopy(arr, 0, answer, 0, length);
        
        return answer;
    }
}