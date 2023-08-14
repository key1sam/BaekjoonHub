import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        List<Integer> sequence = josephus(N, K);
        printJosephusSequence(sequence);
    }

    static List<Integer> josephus(int N, int K) {
        List<Integer> sequence = new ArrayList<>();
        List<Integer> people = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            people.add(i);
        }

        int idx = 0; // 현재 사람들 리스트에서의 인덱스
        while (!people.isEmpty()) {
            idx = (idx + K - 1) % people.size(); // K번째 사람의 인덱스 계산
            sequence.add(people.remove(idx)); // K번째 사람을 제거하고 순열에 추가
        }

        return sequence;
    }

    static void printJosephusSequence(List<Integer> sequence) {
        System.out.print("<");
        for (int i = 0; i < sequence.size(); i++) {
            System.out.print(sequence.get(i));
            if (i < sequence.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(">");
    }
}
