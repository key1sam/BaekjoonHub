// 최대공약수 * 최소공배수 = 두 자연수의 곱
// 최소공배수 = 두 자연수의 곱 / 최대 공약수

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> answer = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tCase = Integer.parseInt(br.readLine());

        for (int i = 0;  i < tCase; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());

            int gcd = GCD(num1, num2);
            answer.add((num1*num2)/gcd);
        }

        for (int i = 0; i < answer.size(); i++) {
            System.out.println(answer.get(i));
        }
        
    }

    public static int GCD(int num1, int num2) {
        if (num1 % num2 == 0) {
            return num2;
        }
        return GCD(num2, num1 % num2);
    }
}



