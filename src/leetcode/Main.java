package leetcode;

import tools.FullPrint;

import java.util.*;

/**
 * Created by shiqifeng on 2017/3/27.
 * Mail byhieg@gmail.com
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
 }
public class Main {
    int count = 0;
    public int findBottomLeftValue(TreeNode root) {
        Map<Integer,Integer> maps = new HashMap<>();
        Map<Integer, Integer> LeftMaps = new HashMap<>();
        preOrder(maps,root,0,LeftMaps);
        int max = maps.get(root.val);
        int result = 0;
        List<Integer> lists = new ArrayList<>();
        Iterator it = maps.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<Integer,Integer> entry = (Map.Entry<Integer,Integer>)it.next();
            if(max <= entry.getValue()){
                max = entry.getValue();
            }
        }
        it = maps.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer,Integer> entry = (Map.Entry<Integer,Integer>)it.next();
            if (entry.getValue() == max) {
                lists.add(entry.getKey());

            }
        }
        int min = LeftMaps.get(lists.get(0));
        result = lists.get(0);
        for (int i = 0 ; i < lists.size();i++) {
            if (min > LeftMaps.get(lists.get(i))) {
                result = lists.get(i);
            }
        }
        return result;
    }

    public void preOrder(Map<Integer,Integer> maps, TreeNode root,int depth,Map<Integer,Integer> lmaps){
        if(root!= null){
            maps.put(root.val,depth);
            lmaps.put(root.val,count);
            count++;
            preOrder(maps,root.left,depth + 1,lmaps);
            preOrder(maps,root.right,depth + 1,lmaps);
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        TreeNode[] treeNode = new TreeNode[8];
        treeNode[1] = new TreeNode(10);
        treeNode[2] = new TreeNode(5);
        treeNode[3] = new TreeNode(15);
        treeNode[4] = new TreeNode(6);
        treeNode[5] = new TreeNode(20);

        treeNode[1].left = treeNode[2];
        treeNode[1].right = treeNode[3];
        treeNode[3].left = treeNode[4];
        treeNode[3].right = treeNode[5];
//        treeNode[1] = new TreeNode(2);
//        treeNode[2] = new TreeNode(1);
//        treeNode[3] = new TreeNode(3);
//        treeNode[1].left = treeNode[2];
//        treeNode[1].right = treeNode[3];
        FullPrint.printResult(main.findBottomLeftValue(treeNode[1]));

    }
}
