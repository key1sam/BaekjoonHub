import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int count = 666;

        TreeSet<Integer> treeset = new TreeSet<>();
        while (treeset.size() <= 10000) {
            String number = Integer.toString(count);
            if (number.contains("666")) {
                treeset.add(Integer.parseInt(number));
            }
            count ++;
        }
        Object[] arr = treeset.toArray();
        System.out.print(arr[num-1]);
    }
}
