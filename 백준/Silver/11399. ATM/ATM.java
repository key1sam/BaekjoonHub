import java.util.*;
import java.io.*;

public class Main {
    public static PriorityQueue<Integer> minHeap;
    public static int[] sumArray;
    public static int answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        sumArray = new int[num];
        minHeap = new PriorityQueue<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < num; i++) {
            minHeap.add(Integer.parseInt(st.nextToken())); // minHeap으로 정렬 수행
        }

        sumArray[0] = minHeap.poll();
        for (int i = 1; i < num; i++) { // 부분합 배열을 생성한 후, 각 부분합을 더해낸다.
            sumArray[i] = sumArray[i - 1] + minHeap.poll();
            answer += sumArray[i];
        }
        System.out.print(sumArray[0] + answer);
    }
}