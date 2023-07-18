import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> uniqueWords = new HashSet<>();
        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            uniqueWords.add(br.readLine());
        }

        // 문자열 길이대로 정렬하고, 길이가 같은 경우 사전 순으로 정렬
        List<String> sortedList = new ArrayList<>(uniqueWords);
        sortedList.sort(Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder()));

        // 결과 출력
        for (String word : sortedList) {
            System.out.println(word);
        }
    }
}
