import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        ArrayList<Integer> answer = new ArrayList<>();

        int y_width, y_height;
        for (int i = 1; i <= yellow; i++) {
            if (yellow % i == 0) {
                y_width = yellow / i;
                y_height = i;

                if (y_width * 2 + y_height * 2 + 4 == brown) {
                    answer.add(y_width + 2);
                    answer.add(y_height + 2);
                    break; // 결과를 찾았으므로 루프를 종료합니다.
                }
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}