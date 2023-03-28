import java.util.*;
import java.io.*;

public class Main {

    public static int N;
    public static int[] arr;

    public static int[] operator;

    public static int max = Integer.MIN_VALUE;	// 최댓값
    public static int min = Integer.MAX_VALUE;	// 최솟값
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        operator = new int[4];

        StringTokenizer st = new StringTokenizer(br.readLine()); // 숫자 입력
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.valueOf(st.nextToken());
        }

        st = new StringTokenizer(br.readLine()); // 연산자 개수 입력
        for (int i = 0; i < 4; i++) {
            operator[i] = Integer.valueOf(st.nextToken());
        }

        dfs(arr[0], 1);
        sb.append(max).append('\n').append(min);
        System.out.print(sb);

    }

    public static void dfs(int now, int depth) {
        if (depth == N) {
            max = Math.max(max, now);
            min = Math.min(min, now);
            return;
        }

        for (int i = 0; i < 4; i++) {
            // 연산자 개수가 1개 이상인 경우
            if (operator[i] > 0) {
                // 해당 연산자를 1 감소시킨다.
                operator[i]--;

                // 처음에 연산자 하나 지정해주고, 그것을 깊이탐색으로 갔다온 후, 연산자 개수를 복구하여 첫번째 연산자를 다른 걸로 계산한다.
                switch (i) {
                    case 0:	dfs(now + arr[depth], depth + 1);	break;
                    case 1:	dfs(now - arr[depth], depth + 1);	break;
                    case 2:	dfs(now * arr[depth], depth + 1);	break;
                    case 3:	dfs(now / arr[depth], depth + 1);	break;
                }
                // ※ 재귀호출이 종료되면 다시 해당 연산자 개수를 복구한다.
                operator[i]++;
            }
        }
    }
}

