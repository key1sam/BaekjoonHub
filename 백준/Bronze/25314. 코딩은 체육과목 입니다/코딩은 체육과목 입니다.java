import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.valueOf(br.readLine());
        int quotient = 0;
        if (num % 4 == 0) {
          quotient = num / 4;
        }
        else {
          quotient = (num / 4) + 1;
        }
        for(int i = 0; i < quotient; i++) {
          sb.append("long ");
        }
        sb.append("int");
        System.out.println(sb);  
    }
}