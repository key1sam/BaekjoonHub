import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<Value> queue = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            queue.add(new Value(priorities[i], i));
        }

        int order = 0;
        while (!queue.isEmpty()) {
            Value current = queue.poll();
            boolean hasHigherPriority = false;

            for (Value value : queue) {
                if (value.getPriority() > current.getPriority()) {
                    hasHigherPriority = true;
                    break;
                }
            }

            if (hasHigherPriority) {
                // 현재 프로세스의 우선순위보다 높은 우선순위가 있는 경우 다시 큐에 넣음
                queue.add(current);
            } else {
                // 현재 프로세스의 우선순위가 가장 높거나 동일한 경우 실행
                order++;
                if (current.getIndex() == location) {
                    return order;
                }
            }
        }

        return -1; // 에러 상황 처리 등에 따라 다른 값으로 변경 가능
    }

    public class Value {
        private int priority;
        private int index;

        public Value(int priority, int index) {
            this.priority = priority;
            this.index = index;
        }

        public int getPriority() {
            return priority;
        }

        public int getIndex() {
            return index;
        }
    }
}
