class Solution {
    public String solution(String s) {
        char[] arr = s.toCharArray();
        java.util.Arrays.sort(arr);
        
        String answer = new StringBuilder(new String(arr)).reverse().toString();
        return answer;
    }
}