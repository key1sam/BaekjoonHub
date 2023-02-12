import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int[] prices) {
        
        int[] answer = new int[prices.length];
        
        for (int i = 0; i < prices.length; i++) {
            int count = 0;
            int now = prices[i];
            
            for (int j = i+1; j < prices.length; j++) {
                count ++;
                if (now > prices[j]) {
                    break;
                }
                else {
                    continue;
                }
            } 
            answer[i] = count;
        }
        return answer;
    }
}

    