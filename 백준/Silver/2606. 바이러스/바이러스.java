import java.lang.reflect.Array;
import java.util.*;
import java.io.*;

public class Main {

    public static boolean[] visited;
    public static ArrayList<ArrayList<Integer>> graph;

    public static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int num = Integer.parseInt(br.readLine());
        int edge = Integer.parseInt(br.readLine());
        visited = new boolean[num+1];
        graph = new ArrayList<>();

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

        dfs(1);
        System.out.print(answer);

    }

    public static void dfs(int start) {
        visited[start] = true;
        ArrayList<Integer> nowNode = graph.get(start);
        for (int i = 0; i < nowNode.size(); i++) {
            if (visited[nowNode.get(i)] == false) { // 아직 방문하지 않았다면 방문하기
                answer++;
                dfs(nowNode.get(i));
            }
        }
    }

}