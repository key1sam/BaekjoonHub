import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num ; i++) {
            String order = br.readLine();
            if (order.contains("push")) { // push 명령일 경우
                st = new StringTokenizer(order);
                String push = st.nextToken();
                int value = Integer.parseInt(st.nextToken());
                stack.push(value);
            }
            else if (order.contains("top")) {
                try {
                    System.out.println(stack.peek());
                }
                catch (Exception e){
                    System.out.println(-1);
                }
            }

            else if (order.contains("size")) {
                    System.out.println(stack.size());
            }

            else if (order.contains("empty")) {
                if (stack.empty()) {
                    System.out.println(1);
                }
                else {
                    System.out.println(0);
                }
            }

            else if (order.contains("pop")) {
                if (stack.size() == 0) {
                    System.out.println(-1);
                }
                else {
                    System.out.println(stack.pop());
                }
            }
        }
    }
}