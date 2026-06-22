using System.Collections.Generic;
using System;
using System.Linq;

public class Solution {
    public int[] solution(int n) {
        int[] answer = new int[] {};
        
        List<int> list = new List<int>();
        
        for(int i = 2; i <= n; i++) {
            while(n % i == 0) {
                list.Add(i);
                n /= i;
            }
        }
        
        answer = list.Distinct().ToArray();
        
        return answer;
    }
}