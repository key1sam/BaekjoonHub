import java.util.*;
import java.io.*;

public class Main {

    static int[] stair;
    static int[] dp; // i칸까지 올라갈 때 최대값을 저장해놓음
    static ArrayList<Integer> arr = new ArrayList<>(); // 정답 후보들 담을 예정

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int result = 0;
        int start = 0;
        stair = new int[num];
        dp = new int[num];

        // 계단 초기화
        for (int i = 0; i < num; i++) {
            int now = Integer.parseInt(br.readLine());
            stair[i] = now;
        }

        // dp[0], dp[1], dp[2] 초기화
        // num이 1보다 작은 경우 dp[1]과 dp[2]를 계산할 수 없다!
        dp[0] = stair[0]; // 계단이 한칸인 경우
        if (num == 2) { // 계단이 두칸인 경우
            dp[1] = Math.max(stair[1], stair[0] + stair[1]);
            System.out.print(dp[1]);
        }
        else if (num == 3) { // 계단이 세칸인 경우
            dp[1] = Math.max(stair[1], stair[0] + stair[1]);
            dp[2] = Math.max(stair[0] + stair[2], stair[1] + stair[2]);
            System.out.print(dp[2]);
        }
        else {
            for (int i = 3; i < num; i++) { // 나머지 dp초기화
                dp[1] = Math.max(stair[1], stair[0] + stair[1]); // 계단이 두칸인 경우
                dp[2] = Math.max(stair[0] + stair[2], stair[1] + stair[2]);
                dp[i] = Math.max(dp[i - 2] + stair[i], dp[i - 3] + stair[i - 1] + stair[i]);
            }
            System.out.print(dp[num-1]);
        }
    }
}