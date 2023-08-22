import java.util.*;
import java.io.*;

public class Main {

    static PriorityQueue<Integer> minHeap;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        minHeap = new PriorityQueue<>();

        for (int i = 0; i < num; i++) {
            int now = Integer.parseInt(br.readLine());
            if (now == 0) {
                if (minHeap.isEmpty()) {
                    System.out.println(0);
                }
                else {
                    int value = minHeap.remove();
                    System.out.println(value);
                }
            }
            else {
                minHeap.offer(now);
            }
        }

    }
}