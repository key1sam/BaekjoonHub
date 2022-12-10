import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        int[] array = new int[31];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
        for (int i = 0; i < 28; i++) {
            int temp = Integer.valueOf(br.readLine());
            array[temp] = 1;
        }
        
        for (int i = 1; i < 31; i++) {
            if (array[i] == 0) {
                System.out.println(i);
            } 
        }
        
    }
}

