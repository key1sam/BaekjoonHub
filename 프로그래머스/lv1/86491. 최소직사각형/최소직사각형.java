// 직관적으로 이해가 되지 않아서 어려웠던 문제!
// 더 길다른쪽을 가로로 둔 후, 세로의 MAX를 구하면 된다.

import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        
       int[] width = new int[sizes.length];
       int[] height = new int[sizes.length];
        
       for(int i = 0; i < sizes.length; i++) {
           if (sizes[i][0] < sizes[i][1]) { // 세로가 가로보다 길 경우, 둘의 자리를 교체 
               int temp = sizes[i][1];
               sizes[i][1] = sizes[i][0];
               sizes[i][0] = temp;
           }
           width[i] = sizes[i][0];
           height[i] = sizes[i][1];
       }
        
        Arrays.sort(width); // 배열에서 가장 높은 값을 정렬을 통해 찾아낼 수 있다!
        Arrays.sort(height);
        
        return width[sizes.length - 1] * height[sizes.length - 1];
    }
}  

