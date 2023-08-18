import java.util.*;
import java.io.*;

public class Main {

    static int[] dirX = {0,0,-1,1};
    static int[] dirY = {-1,1,0,0};
    static int newX, newY;
    static int N, M, K;
    static int count;

    static int[][] map;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {

        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken()); // 가로
            N = Integer.parseInt(st.nextToken()); // 세로
            K = Integer.parseInt(st.nextToken()); // 배추의 개수

            visited = new boolean[N][M];
            map = new int[N][M]; // map 초기화

            for (int j = 0; j < K; j++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken()); // x좌표
                int y = Integer.parseInt(st.nextToken()); // y좌표
                map[y][x] = 1;
            }

            count = 0;
            for (int height = 0; height < N; height++) {
                for (int width = 0; width < M; width ++) {
                    if (map[height][width] == 1 && visited[height][width] == false) { // 무는 심어져있는데, 방문하지 않은 경우!
                        count++;
                        DFS(width, height); // x좌표, y좌표
                    }
                }
            }
            sb.append(count).append('\n');
        }
        System.out.println(sb);
    }

    public static void DFS(int x, int y) {
        visited[y][x] = true;
        for (int i = 0; i < 4; i++) {
            newY = y + dirY[i];
            newX = x + dirX[i];
            if (rangeCheck() && map[newY][newX] == 1 && visited[newY][newX] == false) { // 상하좌우로 이동 후, 범위를 벗어나지 않고, 무가 심어져있고, 방문하지 않은 경우
                DFS(newX, newY);
                // 이곳에 count++; 을 하여 문제가 발생하였다.
            }
        }
    }

    public static boolean rangeCheck() {
        return (newY < N && newY >= 0 && newX < M && newX >= 0); // 범위를 벗어난 경우 result가 false가 나오게된다.
    }
}