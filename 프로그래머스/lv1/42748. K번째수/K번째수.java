import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int a = 0;
        for(int[] idx : commands){
            int i = idx[0];
            int j = idx[1];
            int k = idx[2];

            int[] buffer = Arrays.copyOfRange(array,i-1,j);
            Arrays.sort(buffer);
            answer[a] = buffer[k-1];
            a++;
        }
        return answer;
    }
}