package LeetCodes;

import java.util.LinkedList;
import java.util.List;

public class AllPathsFromSourcetoTargetSol {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {


        List<List<Integer>> ttt = new LinkedList<List<Integer>>();
        return ttt;
    }


    public List<List<Integer>> allPathsSourceTarget_Sample(int[][] graph) {
        List<List<Integer>> res = new LinkedList<>();
        List<Integer> path = new LinkedList<>();

        path.add(0);
        dfsSearch(graph, 0, res, path);

        return res;
    }

    private void dfsSearch(int[][] graph, int node, List<List<Integer>> res, List<Integer> path) {
        if (node == graph.length - 1) {
            res.add(new LinkedList<Integer>(path));
            return;
        }

        for (int nextNode : graph[node]) {
            path.add(nextNode);
            dfsSearch(graph, nextNode, res, path);
            path.remove(path.size() - 1);
        }
    }

}
