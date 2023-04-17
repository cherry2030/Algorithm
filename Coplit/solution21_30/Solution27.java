package daily_coding.Coplit.solution21_30;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class Solution27 {
    public static ArrayList<String> bfs(tree node) {
        ArrayList<String> result = new ArrayList<>();
        Deque<tree> deque = new LinkedList<>();
        deque.add(node);

        while(!deque.isEmpty()){
            tree curNode = deque.poll();
            result.add(curNode.getValue());
            ArrayList<tree> childTree = curNode.getChildrenNode();
            if(childTree!=null){
                deque.addAll(childTree);
            }
        }
        return result;
    }

    //아래 클래스의 내용은 수정하지 말아야 합니다.
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
        Solution27.tree root = new Solution27.tree("1");
        Solution27.tree rootChild1 = root.addChildNode(new Solution27.tree("2"));
        Solution27.tree rootChild2 = root.addChildNode(new Solution27.tree("3"));
        Solution27.tree leaf1 = rootChild1.addChildNode(new Solution27.tree("4"));
        Solution27.tree leaf2 = rootChild1.addChildNode(new Solution27.tree("5"));
        ArrayList<String> output = bfs(root);
        System.out.println(output); // --> ["1", "2", "3", "4", "5"]

        leaf1.addChildNode(new Solution27.tree("6"));
        rootChild2.addChildNode(new Solution27.tree("7"));
        output = bfs(root);
        System.out.println(output); // --> ["1", "2", "3", "4", "5", "7", "6"]
    }
}

