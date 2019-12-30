package LeetCodes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AllPathsFromSourcetoTargetSol {

    public void ImplementFunction(){
        int[][] Graph = {{1,2},{3},{3},{}};
        List<List<Integer>> result = allPathsSourceTarget(Graph);
    }
    private List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> CurPath = new ArrayList<>();
        CurPath.add(0);
        SearchPath(graph, 0, result,CurPath);
        return result;
    }

    private void SearchPath(int[][] graph, int NodeNum, List<List<Integer>>res, List<Integer> CurPath){
        if (graph.length -1== NodeNum){
            res.add(new ArrayList<>(CurPath));
            return;
        }
        for (int Edge : graph[NodeNum]){
            CurPath.add(Edge);
            SearchPath(graph,Edge,res,CurPath);
            CurPath.remove(CurPath.size()-1);
        }
//        return ;
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
            res.add(new LinkedList<>(path));
            return;
        }

        for (int nextNode : graph[node]) {
            path.add(nextNode);
            dfsSearch(graph, nextNode, res, path);
            path.remove(path.size() - 1);
        }
    }
}
