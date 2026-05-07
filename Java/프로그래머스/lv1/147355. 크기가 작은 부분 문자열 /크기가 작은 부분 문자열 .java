class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long consider = Long.parseLong(p);
        
        for(int i = 0; i <= t.length() - p.length(); i++) {
            String str = t.substring(i, i + p.length());
            long strLong = Long.parseLong(str);
            
            if(strLong <= consider)
                answer++;
        }
        return answer;
    }
}