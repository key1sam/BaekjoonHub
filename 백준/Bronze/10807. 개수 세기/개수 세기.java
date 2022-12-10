import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.valueOf(br.readLine());
        int[] array = new int[size];
        int count = 0;
        
         StringTokenizer st = new StringTokenizer(br.readLine());
        
        for(int i = 0; i < size; i++) {
            array[i] = Integer.valueOf(st.nextToken());
        }
        
        int find = Integer.valueOf(br.readLine());
        
        for (int i = 0; i < size; i++) {
            if (array[i] == find) {
                count ++;
            }
        }
        System.out.print(count);
        br.close();
    }
}