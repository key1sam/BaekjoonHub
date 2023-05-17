import java.util.*;

class Solution {

        static int count = 0;

        public int[] solution(int[] progresses, int[] speeds) {
            ArrayList<Integer> arr = new ArrayList<>();

            for (int i = 0; i < progresses.length; i++) {
                if (progresses[i] < 100) {
                    while (progresses[i] < 100) {
                        for (int j = i; j < progresses.length; j++) {
                            progresses[j] += speeds[j];
                        }
                    }
                    for (int k = i; k < progresses.length; k++) {
                        if (progresses[k] >= 100) {
                            count ++;
                        }
                        else {
                            break;
                        }
                    }
                    arr.add(count);
                    count = 0;
                }
            }
            return  arr.stream().mapToInt(Integer::intValue).toArray();
        }
    }