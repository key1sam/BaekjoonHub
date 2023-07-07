// char배열로 만든 후, char를 Integer 형태로 변환 시, 유니코드로 변경되므로 주의해야한다.
// String 형태로 변경하여 더하는 것이 바람직하다!

class Solution {
    public int solution(int n) {
        int answer = 0;
        String num = Integer.toString(n);
        String[] array = num.split("");
        
        for (String digit : array) {
            answer += Integer.parseInt(digit);
        }
        
        return answer;
    }
}
