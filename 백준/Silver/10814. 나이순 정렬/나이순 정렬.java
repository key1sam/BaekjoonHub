import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int num = Integer.parseInt(br.readLine());

        ArrayList<Member> members = new ArrayList<>();

        // ArrayList에 입력받은 값 초기화해주기
        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            members.add(new Member(i, age, name));
        }

        // 퀵 소트를 이용하여 나이순으로 회원 정렬
        quickSort(members, 0, num - 1);

        // 출력하기
        for (Member member : members) {
            System.out.println(member.getAge() + " " + member.getName());
        }
    }

    // 퀵 소트 구현
    public static void quickSort(ArrayList<Member> members, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(members, left, right);
            quickSort(members, left, pivotIndex - 1);
            quickSort(members, pivotIndex + 1, right);
        }
    }

    public static int partition(ArrayList<Member> members, int left, int right) {
        Member pivotMember = members.get(right);
        int pivotAge = pivotMember.getAge();
        int i = left - 1;

        for (int j = left; j < right; j++) {
            if (members.get(j).getAge() < pivotAge ||
                    (members.get(j).getAge() == pivotAge && members.get(j).getIndex() < pivotMember.getIndex())) {
                i++;
                swap(members, i, j);
            }
        }

        swap(members, i + 1, right);
        return i + 1;
    }

    public static void swap(ArrayList<Member> members, int i, int j) {
        Member temp = members.get(i);
        members.set(i, members.get(j));
        members.set(j, temp);
    }
}

class Member {
    private int index;
    private int age;
    private String name;

    public Member(int index, int age, String name) {
        this.index = index;
        this.age = age;
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
