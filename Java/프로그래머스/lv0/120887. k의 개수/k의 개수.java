class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        String kStr = String.valueOf(k);
        
        for(int r = i; r <= j; r++) {
            String str = String.valueOf(r);
            if(str.contains(kStr)) {
                String[] array = str.split("");
                for(String a : array)
                    if(a.equals(kStr)) answer++;
            }
        }
        
        return answer;
    }
}