import java.util.*;
import java.io.*;

public class Main {
    public static PriorityQueue<Integer> maxHeap;
    public static void main(String[] args) throws IOException {
        maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        for (int i  = 0; i < num; i++) {
            int now = Integer.parseInt(br.readLine());
            if (now == 0) {
                if (maxHeap.isEmpty()) {
                    System.out.println(0);
                }
                else {
                    System.out.println(maxHeap.remove());
                }
            }
            else {
                maxHeap.add(now);
            }
        }
    }
}