import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 851. 喧闹和富有
 * 有一组 n 个人作为实验对象，从 0 到 n - 1 编号，其中每个人都有不同数目的钱，以及不同程度的安静值（quietness）。为了方便起见，我们将编号为x的人简称为 "personx"。
 * <p>
 * 给你一个数组 richer ，其中 richer[i] = [ai, bi] 表示 personai比 personbi更有钱。另给你一个整数数组 quiet ，其中quiet[i] 是 person i 的安静值。richer 中所给出的数据 逻辑自恰（也就是说，在 person x 比 person y 更有钱的同时，不会出现 person y 比 person x 更有钱的情况 ）。
 * <p>
 * 现在，返回一个整数数组 answer 作为答案，其中answer[x] = y的前提是，在所有拥有的钱肯定不少于personx的人中，persony是最安静的人（也就是安静值quiet[y]最小的人）。
 * <p>
 *
 * <p>
 * 示例 1：
 * <p>
 * 输入：richer = [[1,0],[2,1],[3,1],[3,7],[4,3],[5,3],[6,3]], quiet = [3,2,5,4,6,1,7,0]
 * 输出：[5,5,2,5,4,5,6,7]
 * 解释：
 * answer[0] = 5，
 * person 5 比 person 3 有更多的钱，person 3 比 person 1 有更多的钱，person 1 比 person 0 有更多的钱。
 * 唯一较为安静（有较低的安静值 quiet[x]）的人是 person 7，
 * 但是目前还不清楚他是否比 person 0 更有钱。
 * answer[7] = 7，
 * 在所有拥有的钱肯定不少于 person 7 的人中（这可能包括 person 3，4，5，6 以及 7），
 * 最安静（有较低安静值 quiet[x]）的人是 person 7。
 * 其他的答案也可以用类似的推理来解释。
 * <p>
 *
 * @author sunjianrong
 * @date 2021-12-15 9:34
 */
public class Q851喧闹和富有 {

    public int[] loudAndRich(int[][] richer, int[] quiet) {
        final int length = quiet.length;
        List<Integer>[] g = new List[length];
        for (int i = 0; i < length; i++) {
            g[i] = new ArrayList<>();
        }

        for (int[] r : richer) {
            g[r[1]].add(r[0]);
        }
        int[] ans = new int[length];
        Arrays.fill(ans, -1);

        for (int i = 0; i < length; i++) {
            dfs(i, quiet, g, ans);
        }
        return ans;
    }


    private void dfs(int x, int[] quiet, List<Integer>[] g, int[] ans) {
        if (ans[x] != -1) {
            return;
        }

        ans[x] = x;
        for (int y : g[x]) {
            dfs(y, quiet, g, ans);
            if (quiet[ans[y]] < quiet[ans[x]]) {
                ans[x] = ans[y];
            }
        }
    }
}
