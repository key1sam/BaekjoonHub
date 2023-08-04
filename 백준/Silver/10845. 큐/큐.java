import java.sql.Array;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < num; i++) {
            String order = br.readLine();
            if (order.contains("push")) {
                StringTokenizer st = new StringTokenizer(order);
                String push = st.nextToken();
                int number = Integer.parseInt(st.nextToken());
                deque.offer(number);
            }
            else if (order.contains("front")) {
                if (deque.peekFirst() == null) {
                    System.out.println(-1);
                }
                else {
                    System.out.println(deque.peekFirst());
                }
            }
            else if (order.contains("back")) {
                if (deque.peekLast() == null) {
                    System.out.println(-1);
                }
                else {
                    System.out.println(deque.peekLast());
                }
            }
            else if (order.contains("size")) {
                System.out.println(deque.size());
            }
            else if (order.contains("pop")) {
                try {
                    System.out.println(deque.removeFirst());
                }
                catch (Exception e) {
                    System.out.println(-1);
                }
            }
            else if (order.contains("empty")) {
                if (deque.isEmpty()) { // 결과가 True, False로 출력됨
                    System.out.println(1);
                }
                else {
                    System.out.println(0);
                }
            }
        };
    }
}