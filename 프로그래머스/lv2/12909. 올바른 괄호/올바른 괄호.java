import java.util.*;
import java.io.*;

class Solution {
       
    boolean solution(String s) throws IOException {
      
        Stack<Character> stack = new Stack<>();
        char[] arr = new char[s.length()];
        arr = s.toCharArray();
        
        for (int i = 0; i < s.length(); i++) {
            if (arr[i] == '(') {
                stack.push(arr[i]);
            }
            else {
                if (!stack.empty() && stack.peek() == '(') { // stack의 top은 peek()로 확인한다.
                    stack.pop();
                }
                else {
                    stack.push(arr[i]);
                }
            }
        }
        
        return stack.empty();
        
    }
}