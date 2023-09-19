// h번 이상 인용된 논문, h번 이하 인용된 논문의 개수가 같아야한다!
// 구현하기가 너무 어렵다..
import java.util.*;

class Solution {
    
    public static int hIndex = 0;
    
    public int solution(int[] citations) {
        
        Arrays.sort(citations);

        int n = citations.length; // hIndex 후보의 최대 값
        int hIndex = 0;

        // 배열을 뒤에서부터 탐색하면서 H-Index 계산
        for (int i = n - 1; i >= 0; i--) {
            // 현재 논문의 인용 횟수와 현재 위치에서의 인덱스를 비교
            // 인덱스 - i는 hIndex의 후보 (1,2,3,4,5... 처럼 올라감)
            if (citations[i] >= n - i) { 
                hIndex = n - i;
            } else {
                break; // 인덱스 + 1이 인용 횟수보다 크지 않으면 루프 종료
            }
        }

        return hIndex;
    }
    
}