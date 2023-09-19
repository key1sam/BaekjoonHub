// h번 이상 인용된 논문, h번 이하 인용된 논문의 개수가 같아야한다!
import java.util.*;


class Solution {
    
    public static int answer = 0;
    
    public int solution(int[] citations) {
        Arrays.sort(citations);
        for (int i = 0; i < citations.length; i++) {
            int hIndex = (citations.length)-i;
            
            if (citations[i] >= hIndex) {
                answer = hIndex;
                break;    
             }  
        }
        return answer;
    }
}