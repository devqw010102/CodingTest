class Solution {
    public int solution(int[][] signals) {
        int[] start = new int[signals.length];
		int[] end = new int[signals.length];
		int[] sum = new int[signals.length];
		
		for(int i = 0; i < signals.length; i++) {
			for(int j = 0; j < signals[i].length; j++) {
				sum[i] += signals[i][j];
			}
				start[i] = signals[i][0] + 1;
				end[i] = signals[i][0] + signals[i][1];
		}
		
		int answer = -1;

		for(int i = 1; i < 10000000; i++) {
			boolean isAllYellow = true;
			
			for(int j = 0; j < signals.length; j++) {
				int remain = i % sum[j];
				
				if(remain == 0)
					remain = sum[j];
				
				if(remain < start[j] || remain > end[j]) {
					isAllYellow = false;
					break;
				}
			}
			
			if(isAllYellow) {
				answer = i;
				break;
			}
		}
        return answer;
    }
}