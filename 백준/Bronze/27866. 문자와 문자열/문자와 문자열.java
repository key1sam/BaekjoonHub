import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        int num = Integer.parseInt(br.readLine());
        char[] wordArray = word.toCharArray();
        System.out.print(wordArray[num-1]);
    }
}