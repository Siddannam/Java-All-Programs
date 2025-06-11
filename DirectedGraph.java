package Basic;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class DirectedGraph {
    private Map<Integer, String> nodes = new HashMap<>();
    private Map<Integer, List<Integer>> adjList = new HashMap<>();
    private Map<Integer, Integer> indegree = new HashMap<>();

    public void addNode(int key, String name) {
        nodes.put(key, name);
        adjList.put(key, new ArrayList<>());
        indegree.put(key, 0);
    }

    public void addEdge(int src, int dest) {
        adjList.get(src).add(dest);
        indegree.put(dest, indegree.get(dest) + 1);
    }

    public void traverseGraph() {
        Queue<Integer> queue = new LinkedList<>();
        for (int node : nodes.keySet()) {
            if (indegree.get(node) == 0) {
                queue.add(node);
            }
        }

        Set<Integer> visited = new HashSet<>();
        while (!queue.isEmpty()) {
            int current = queue.poll();
            if (visited.contains(current)) continue;

            visited.add(current);
            System.out.println(nodes.get(current));

            for (int neighbor : adjList.get(current)) {
                indegree.put(neighbor, indegree.get(neighbor) - 1);
                if (indegree.get(neighbor) == 0) {
                    queue.add(neighbor);
                }
            }
        }

        System.out.println(nodes.size());
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("C:/Users/Lenovo/Desktop/input.txt"));
        DirectedGraph graph = new DirectedGraph();

        int N = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < N; i++) {
            String[] node = scanner.nextLine().split(":");
            graph.addNode(Integer.parseInt(node[0]), node[1]);
        }

        int M = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < M; i++) {
            String[] edge = scanner.nextLine().split(":");
            graph.addEdge(Integer.parseInt(edge[0]), Integer.parseInt(edge[1]));
        }

        graph.traverseGraph();
    }
}
