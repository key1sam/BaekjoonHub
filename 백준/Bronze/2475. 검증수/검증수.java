import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        int num3 = Integer.parseInt(st.nextToken());
        int num4 = Integer.parseInt(st.nextToken());
        int num5 = Integer.parseInt(st.nextToken());

        System.out.print(((num1*num1) + (num2*num2) + (num3*num3) + (num4*num4) + (num5*num5))%10);

    }
}