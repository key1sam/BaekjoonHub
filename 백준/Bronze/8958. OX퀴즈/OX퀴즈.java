import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test_case = Integer.valueOf(br.readLine());
        String[] str = new String[test_case];
        
        for (int i = 0; i < test_case; i++) {
            str[i] = br.readLine();
        }
        
        for (int i = 0; i < test_case; i++) {
            int cnt = 0;
            int sum = 0;
            
            for(int j = 0; j < str[i].length(); j++) {
                if (str[i].charAt(j) == 'O') {
                    cnt ++;
                } 
                else {
                    cnt = 0;
                }
                sum += cnt;
            }
            System.out.println(sum);
        } 
    }
}