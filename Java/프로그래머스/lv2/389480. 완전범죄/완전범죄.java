import java.util.Arrays;

class Solution {
    
	private final int INF = 9999999;
	private int n, m;		// A의 한계, B의 한계
	private int[][] memo;	// 갈래 마다 결과 저장
	private int[][] info;	// Input
	
	public int solution(int[][] info, int n, int m) {  
        
		this.info = info;
		this.n = n;
		this.m = m;
		
		this.memo = new int[info.length][m];
        
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }

        int result = dfs(0, 0);

        // A의 흔적이 n 이상이면 불가능하므로 -1 리턴
        return (result >= n) ? -1 : result;
        
        
    }
    
	private int dfs(int idx, int sumB) {
		
		// 1. 모든 물건을 다훔침
		if(idx == info.length)
			return 0;
		
		// 2. 이미 계산한적이 있음
		if(memo[idx][sumB] != -1) 
			return memo[idx][sumB];
		
		
		// A가 훔친다.
		int choiceA = info[idx][0] + dfs(idx + 1,sumB);
		
		// B가 훔친다.
		int choiceB = INF;
		// B의 한계치가 넘지 않을 때 만
		if(sumB + info[idx][1] < m) {
			choiceB = dfs(idx + 1, sumB + info[idx][1]);
		}
	
		// 둘중 더 작은 길(A의 흔적이 최소)을 선택
		memo[idx][sumB] = Math.min(choiceA, choiceB);
		
		// 최소값 리턴
		return memo[idx][sumB];
	}
}