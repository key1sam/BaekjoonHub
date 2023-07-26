import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();

        // Queue 자료구조로 1~N까지의 숫자를 추가
        for (int i = 1; i <= num; i++) {
            queue.offer(i);
        }
        while(queue.size() != 1) {
            queue.remove();
            queue.offer(queue.poll());
        }
        System.out.print(queue.poll());
    }
}