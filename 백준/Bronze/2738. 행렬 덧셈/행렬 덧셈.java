import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
      
        int N = Integer.valueOf(st.nextToken());
        int M = Integer.valueOf(st.nextToken());
        
        int[][] arr1 = new int[N][M];

        for (int i = 0; i < N; i++) {
          st = new StringTokenizer(br.readLine());
          for (int j = 0; j < M; j++) {
            arr1[i][j] = Integer.parseInt(st.nextToken());
          } 
        }
        
        for (int i = 0;  i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                int b = arr1[i][j] + Integer.parseInt(st.nextToken());
                sb.append(b).append(" ");
            }
            sb.append("\n");
        }
      System.out.println(sb);
  }
}