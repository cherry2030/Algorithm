package daily_coding.solution21_30;

import daily_coding.solution1_10.Solution;

import java.util.ArrayList;

public class Solution26 {
    public static ArrayList<String> dfs(tree node) {
        ArrayList<String> result = new ArrayList<>();
        result.add(node.value);

        ArrayList<tree> children = node.getChildrenNode();
        if(children!=null){
            for(int i=0;i<children.size();i++){
                ArrayList<String> dfsList = dfs(children.get(i));
                result.addAll(dfsList);
            }
        }

        return result;
    }

    public static class tree {
        private String value;
        private ArrayList<tree> children;

        public tree(String data) {
            this.value = data;
            this.children = null;
        }

        public tree addChildNode(tree node) {
            if(children == null) children = new ArrayList<>();
            children.add(node);
            return children.get(children.size() - 1);
        }

        public String getValue() {      //현재 노드의 데이터를 반환
            return value;
        }

        public ArrayList<tree> getChildrenNode() {
            return children;
        }
    }

    public static void main(String[] args) {
        Solution26.tree root = new Solution26.tree("1");
        Solution26.tree rootChild1 = root.addChildNode(new Solution26.tree("2"));
        Solution26.tree rootChild2 = root.addChildNode(new Solution26.tree("3"));
        Solution26.tree leaf1 = rootChild1.addChildNode(new Solution26.tree("4"));
        Solution26.tree leaf2 = rootChild1.addChildNode(new Solution26.tree("5"));
        ArrayList<String> output = dfs(root);
        System.out.println(output); // --> ["1", "2", "4", "5", "3"]

        leaf1.addChildNode(new Solution26.tree("6"));
        rootChild2.addChildNode(new Solution26.tree("7"));
        output = dfs(root);
        System.out.println(output); // --> ["1", "2", "4", "6", "5", "3", "7"]
    }
}