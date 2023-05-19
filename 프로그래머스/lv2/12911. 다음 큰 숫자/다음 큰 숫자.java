// 문제를 푼 원리
// n을 2진수로 변환한 후, 1의 개수를 체크. n을 1씩 증가시키면서 1의 개수가 동일할 경우 return!
// 해당 문제에서 배운 점
// 10진수를 2진수 문자열로 바꾸는법 : Integer.toBinaryString(num); 


import java.util.*;

class Solution {
    
    static int count = 0;
    static int now = 0;
    
    public int solution(int n) {
        now = n;
        String binaryN = toBinary(n); // N을 2진수로 변환하여 String 형태로 저장
        int countN = countNum(binaryN); // N을 2진수로 변환한 후 1의 개수를 저장
       
        while(true) {
            now = ++n; // n++을 하게 될 경우, n+1이 대입되어야하는데, n이 대입되게 된다! 따라서 ++n
            String binaryNextNum = toBinary(now);
            int countNextNum = countNum(binaryNextNum);
            if (countN == countNextNum) {
                break;
            }
        }
        
        return now;
    }
    
    public String toBinary(int n) {
        String binaryString = Integer.toBinaryString(n);
        return binaryString;
    }
    
    public int countNum(String binaryNum) {
        int count = 0;
        char[] charArr = binaryNum.toCharArray();
        for (int i = 0; i < binaryNum.length(); i++) {
            if (charArr[i] == '1') {
                count ++; 
            }        
        }
        return count;
    }
}