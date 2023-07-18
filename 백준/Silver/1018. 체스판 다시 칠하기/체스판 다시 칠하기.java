import java.io.*;
import java.util.*;

public class Main {

    public static HashSet<Integer> answer = new HashSet<>();
    public static char black = 'B';
    public static char white = 'W';

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 보드 초기화
        char[][] arr = new char[N][M];
        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            char[] tmp = input.toCharArray();
            for (int j = 0; j < M; j++) {
                arr[i][j] = tmp[j];
            }
        }

        // 탐색 시작
        for (int i = 0; i <= M - 8; i++) { // x의 시작점
            for (int j = 0; j <= N - 8; j++) {  // y의 시작점
                if (arr[j][i] == 'B') { // 해당 시작점이 B로 시작할 때, "BWBWBWBW"와 "WBWBWBWB" 값을 가져온 후 비교하고자함. 여기에서 j, i의 위치를 헷갈려서 문제 오류가 발생함!
                    bCheck(i, j, arr);
                    wCheck(i, j, arr);
                } else { // 해당 시작점이 W로 시작할 때
                    bCheck(i, j, arr);
                    wCheck(i, j, arr);
                }

            }
        }
        // HashSet에서 최소 값을 출력하기!
       System.out.print(Collections.min(answer));
    }

    public static void bCheck(int start_col, int start_row, char[][] Board) { // 시작이 Black일 때, 변경해야하는 횟수 리턴

        int change = 0; // W,B로 바뀌어야되는 횟수

        for (int i = start_row; i < start_row + 8; i++) { // y좌표를 선택
            for (int j = start_col; j < start_col + 8; j++) { // x좌표 선택
                if (i % 2 == 0) {   // i가 0,2,4,6 일 때는 "BWBWBWBW" 여야함
                    if (j % 2 == 0) { // j가 0,2,4,6 일 때는 "B"문자가 나와야함
                        // 지금 B문자가 나와야하는데, W인 경우 바뀌어야하므로 change 카운터 증가!
                        if (Board[i][j] == white) {
                            change++;
                        }
                    }
                    else { // j가 1,3,5,7인 경우에는 "W"문자가 나와야하는데 B문자가 나올경우 바뀌어야하므로 change 카운터 증가
                        if (Board[i][j] == black) {
                            change++;
                        }
                    }
                }
                else { // 해당 행 i가 1,3,5,7인 경우 "WBWBWBWB"가 나와야함
                    if (j % 2 == 0) { // j가 0,2,4,6 일 때는 "W"문자가 나와야함
                        if (Board[i][j] == black) {
                            change++;
                        }
                    }
                    else { // j가 1,3,5,7인 경우 "B"문자가 나와야함
                        if (Board[i][j] == white) {
                            change++;
                        }
                    }
                }
            }
        }
        // Hashset에 change 값을 추가하기
        answer.add(change);
    }

    public static void wCheck(int start_col, int start_row, char[][] Board) { // 시작이 White일 때, 변경해야하는 횟수 리턴

        int change = 0; // W,B로 바뀌어야되는 횟수

        for (int i = start_row; i < start_row + 8; i++) { // y좌표를 선택
            for (int j = start_col; j < start_col + 8; j++) { // x좌표 선택
                if (i % 2 == 0) {   // i가 0,2,4,6 일 때는 "WBWBWBWB" 여야함
                    if (j % 2 == 0) { // j가 0,2,4,6 일 때는 "W"문자가 나와야함
                        // 지금 W문자가 나와야하는데, B인 경우 바뀌어야하므로 change 카운터 증가!
                        if (Board[i][j] == black) {
                            change++;
                        }
                    }
                    else { // j가 1,3,5,7인 경우에는 "B"문자가 나와야하는데 W문자가 나올경우 바뀌어야하므로 change 카운터 증가
                        if (Board[i][j] == white) {
                            change++;
                        }
                    }
                }
                else { // 해당 행 i가 1,3,5,7인 경우 "BWBWBWBW"가 나와야함
                    if (j % 2 == 0) { // j가 0,2,4,6 일 때는 "B"문자가 나와야함
                        if (Board[i][j] == white) {
                            change++;
                        }
                    }
                    else { // j가 1,3,5,7인 경우 "W"문자가 나와야함
                        if (Board[i][j] == black) {
                            change++;
                        }
                    }
                }
            }
        }
        //HashSet에 change 값 추가하기
        answer.add(change);
    }
}