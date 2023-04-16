import java.util.*;
import java.io.*;

class Solution {
    public String solution(String s) throws IOException {
        StringBuilder sb = new StringBuilder();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        StringTokenizer st = new StringTokenizer(s);
        while(st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        
        sb.append(min).append(" ").append(max);

        return sb.toString();
    }
}