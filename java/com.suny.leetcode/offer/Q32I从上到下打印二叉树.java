package offer;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 剑指 Offer 32 - I. 从上到下打印二叉树
 * 从上到下打印出二叉树的每个节点，同一层的节点按照从左到右的顺序打印。
 * <p>
 *
 * <p>
 * 例如:
 * 给定二叉树:[3,9,20,null,null,15,7],
 * <p>
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * 返回：
 * <p>
 * [3,9,20,15,7]
 * <p>
 *
 * @author sunjianrong
 * @date 2021-07-30 12:20
 */
public class Q32I从上到下打印二叉树 {
    private List<List<Integer>> res = new ArrayList<>();

    public int[] levelOrder(TreeNode root) {
        if (root == null) {
            return new int[0];
        }

        dfs(0, root);
        return res.stream().flatMap(e -> e.stream()).collect(Collectors.toList()).stream().mapToInt(Integer::intValue).toArray();
    }

    private void dfs(int depth, TreeNode root) {
        if (root == null) {
            return;
        }

        if (depth >= res.size()) {
            res.add(new ArrayList<>());
        }

        res.get(depth).add(root.val);
        dfs(depth + 1, root.left);
        dfs(depth + 1, root.right);
    }
}
