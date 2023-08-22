import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int[] stair = new int[num];
        int[] dp = new int[num];

        for (int i = 0; i < num; i++) {
            int now = Integer.parseInt(br.readLine());
            stair[i] = now;
        }

        if (num == 1) {
            System.out.print(stair[0]);
        } else if (num == 2) {
            System.out.print(Math.max(stair[1], stair[0] + stair[1]));
        } else {
            dp[0] = stair[0];
            dp[1] = Math.max(stair[1], stair[0] + stair[1]);
            dp[2] = Math.max(stair[0] + stair[2], stair[1] + stair[2]);

            for (int i = 3; i < num; i++) {
                dp[i] = Math.max(dp[i - 2] + stair[i], dp[i - 3] + stair[i - 1] + stair[i]);
            }

            System.out.print(dp[num - 1]);
        }
    }
}
