import java.util.*;
import java.io.*;

class Solution {
    public String solution(String s) throws IOException {
        s = s.toLowerCase(); //처음부터 다 소문자로 바꿔버리기

		StringTokenizer st = new StringTokenizer(s, " ", true); // 세번째 매겨변수의 경우 " " 또한 token에 포함시킬지 여부를 정하는 것 (True여서 포함)
		StringBuilder sb = new StringBuilder();
		while (st.hasMoreTokens()) {
			String word = st.nextToken();
			// 만약 단어가 공백이면 그대로 출력해주고
			if (word.equals(" ")) {
                sb.append(word);
            }
			else { 
				sb.append(word.substring(0, 1).toUpperCase() + word.substring(1));
			}
		}
		return sb.toString();
	}
}