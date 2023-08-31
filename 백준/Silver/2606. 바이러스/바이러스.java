import java.sql.Array;
import java.util.*;
import java.io.*;

public class Main {

    public static boolean[] visited;
    public static ArrayList<ArrayList<Integer>> graph;
    public static ArrayDeque<ArrayList<Integer>> deque;

    public static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int num = Integer.parseInt(br.readLine());
        int edge = Integer.parseInt(br.readLine());
        visited = new boolean[num+1];
        graph = new ArrayList<>();
        deque = new ArrayDeque<>();

        for (int i = 0; i < num+1; i++) { // 노드 생성
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < edge; i++) { // 연결되어 있는 노드 초기화
            st = new StringTokenizer(br.readLine());
            int node = Integer.parseInt(st.nextToken());
            int connectNode = Integer.parseInt(st.nextToken());
            graph.get(node).add(connectNode);
            graph.get(connectNode).add(node);
        }

        bfs(1);
        System.out.print(answer);

    }

    public static void bfs(int start) {
        visited[start] = true;
        deque.add(graph.get(start));
        while (deque.size() > 0) {
            ArrayList<Integer> nowNode = deque.poll();
            for (int i = 0; i < nowNode.size(); i++) {
                if (visited[nowNode.get(i)] == false) {
                    deque.add(graph.get(nowNode.get(i)));
                    visited[nowNode.get(i)] = true;
                    answer ++;
                }
            }
        }
    }

}