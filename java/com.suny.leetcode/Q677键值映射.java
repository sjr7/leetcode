import java.util.HashMap;
import java.util.Map;

/**
 * 677. 键值映射
 * 实现一个 MapSum 类，支持两个方法，insert和sum：
 * <p>
 * MapSum() 初始化 MapSum 对象
 * void insert(String key, int val) 插入 key-val 键值对，字符串表示键 key ，整数表示值 val 。如果键 key 已经存在，那么原来的键值对将被替代成新的键值对。
 * int sum(string prefix) 返回所有以该前缀 prefix 开头的键 key 的值的总和。
 *
 * <p>
 * 示例：
 * <p>
 * 输入：
 * ["MapSum", "insert", "sum", "insert", "sum"]
 * [[], ["apple", 3], ["ap"], ["app", 2], ["ap"]]
 * 输出：
 * [null, null, 3, null, 5]
 * <p>
 * 解释：
 * MapSum mapSum = new MapSum();
 * mapSum.insert("apple", 3);
 * mapSum.sum("ap");           // return 3 (apple = 3)
 * mapSum.insert("app", 2);
 * mapSum.sum("ap");           // return 5 (apple + app = 3 + 2 = 5)
 *
 * <p>
 * 提示：
 * <p>
 * 1 <= key.length, prefix.length <= 50
 * key 和 prefix 仅由小写英文字母组成
 * 1 <= val <= 1000
 * 最多调用 50 次 insert 和 sum
 * <p>
 *
 * @author sunjianrong
 * @date 2021/11/14 下午10:59
 */
public class Q677键值映射 {

    private Map<String, Integer> map;

    /**
     * Initialize your data structure here.
     */
    public Q677键值映射() {
        map = new HashMap<>();
    }

    public void insert(String key, int val) {
        map.put(key, val);

    }

    public int sum(String prefix) {
        int res = 0;
        for (String s : map.keySet()) {
            if (s.startsWith(prefix)) {
                res += map.get(s);
            }
        }
        return res;

    }
}
