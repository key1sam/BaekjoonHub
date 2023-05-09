// 오답 이유 : 모든 scoville 값을 섞더라도 K값에 도달하지 못하는 경우를 빼먹음

import java.util.*;


class Solution {
    
    static int answer = 0;
    
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(); // Min Heap 선언
        for (int i = 0; i < scoville.length; i++) {
            minHeap.add(scoville[i]); // add는 true, false를 반환한다.
        }
        
        while (minHeap.peek() < K && minHeap.size() >= 2) { // minHeap에 2개 이상이 있어야 Scoville을 섞을 수 있다.
            int num1 = minHeap.poll(); // 최소 힙에서 먼저 빠져나왔으므로 가장 작은 값
            int num2 = minHeap.poll(); // 두번째로 작은 값
            int newNum = num1 + (num2*2);
    
            minHeap.add(newNum);
            answer++;
        }
        
        if (minHeap.size() == 1) { 
            if (minHeap.peek() >= K) {
                return answer;
            }
            else { return -1; }
        }
        else {
            return answer;
        }
    }
}