import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.valueOf(st.nextToken());
        int N = Integer.valueOf(st.nextToken());

        int arr[] = new int[M+1];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine()); // st를 재사용하기 위해 new StringTokenizer(br.readLine())수행. 이 전의 st는 가비지컬렉터에 의해 메모리가 회수된다.
            int start = Integer.valueOf(st.nextToken());
            int end = Integer.valueOf(st.nextToken());
            int num = Integer.valueOf(st.nextToken());

            for (int j = start; j <= end; j++) {
                arr[j] = num;
            }
        }

        for (int i = 1; i < M+1; i++) {
            System.out.print(arr[i]);
            System.out.print(' ');
        }

        }
    }