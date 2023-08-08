import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < num; i++) {
            String order = br.readLine();
            StringTokenizer st = new StringTokenizer(order);
            if (st.countTokens() > 1) { // push_back, push_front
                String push = st.nextToken();
                int number = Integer.parseInt(st.nextToken());

                if (push.contains("back")) {
                    deque.offerLast(number);
                }
                else if (push.contains("front")) {
                    deque.offerFirst(number);
                }
            }

            else if (order.equals("front")) { // 뒤에 pop_front의 경우 cotains를 활용 중이기에, 여기에서는 등호로 동일한 경우에만 front 함수 활용
                if (deque.isEmpty()) {
                    System.out.println(-1);
                }
                else {
                    System.out.println(deque.peekFirst());
                }
            }
            else if (order.equals("back")) {
                if (deque.isEmpty()) {
                    System.out.println(-1);
                }
                else {
                    System.out.println(deque.peekLast());
                }
            }
            else if (order.contains("size")) {
                System.out.println(deque.size());
            }
            else if (order.contains("pop_front")) {
                if (deque.isEmpty()) {
                    System.out.println(-1);
                }
                else {
                    System.out.println(deque.pollFirst());
                }
            }
            else if (order.contains("pop_back")) {
                if (deque.isEmpty()) {
                    System.out.println(-1);
                }
                else {
                    System.out.println(deque.pollLast());
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