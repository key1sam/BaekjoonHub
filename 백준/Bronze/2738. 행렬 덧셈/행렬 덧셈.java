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
        int[][] arr2 = new int[N][M];
        int[][] ans = new int[N][M];
      

        for (int i = 0; i < N; i++) {
         StringTokenizer st2 = new StringTokenizer(br.readLine());
          for (int j = 0; j < M; j++) {
            arr1[i][j] = Integer.parseInt(st2.nextToken());
          } 
        }

       for (int i = 0; i < N; i++) {
         StringTokenizer st3 = new StringTokenizer(br.readLine());
          for (int j = 0; j < M; j++) {
            arr2[i][j] = Integer.parseInt(st3.nextToken());
          } 
        }

        for (int i = 0; i < N; i++) {
          for (int j = 0; j < M; j++) {
            ans[i][j] = arr1[i][j] + arr2[i][j];
          }
        }

        for (int i = 0; i < N; i++) {
          for (int j = 0; j < M; j++) {
            System.out.print(String.valueOf(ans[i][j]) + " ");
          }
          System.out.println();   
    }
 }
}