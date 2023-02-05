import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        char[] sLetter = s.toCharArray();
        for (int i = 0; i < sLetter.length; i++) {
            for (int j = 0; j < index; j++) {
                do {
                    sLetter[i] ++;
                    if (sLetter[i] > 'z') {
                        sLetter[i] = 'a';
                    }
                }while(skip.contains(String.valueOf(sLetter[i]))); 
                //sLetter[i] 값이 skip에 존재할 경우 sLetter를 계속 변경 
            }
        }
        String answer = String.valueOf(sLetter);
        return answer;    
    }
}