import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        double num1 = Double.parseDouble(st.nextToken());
        double num2 = Double.parseDouble(st.nextToken());
        
        System.out.print(num1/num2);
    }
}