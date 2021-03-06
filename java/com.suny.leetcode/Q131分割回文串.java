import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * 131. 分割回文串
 * <p>
 * 给你一个字符串 s，请你将 s 分割成一些子串，使每个子串都是 回文串 。返回 s 所有可能的分割方案。
 * <p>
 * 回文串 是正着读和反着读都一样的字符串。
 *
 * @author sunjianrong
 * @date 2021/7/12 下午9:57
 */
public class Q131分割回文串 {


    List<List<String>> lists = new ArrayList<>();
    Deque<String> deque = new LinkedList<>();

    public List<List<String>> partition(String s) {
        backTracking(s, 0);
        return lists;
    }


    private void backTracking(String s, int startIndex) {
        // 如果起始位置大于s, 则说明找到了一组切割方案
        if (startIndex >= s.length()) {
            lists.add(new ArrayList<>(deque));
            return;
        }

        for (int i = startIndex; i < s.length(); i++) {
            // 如果是回文则记录
            if (isPalindrome(s, startIndex, i)) {
                String str = s.substring(startIndex, i + 1);
                deque.addLast(str);
            } else {
                continue;
            }

            // 起始位置后移,保证不重复
            backTracking(s, i + 1);
            deque.removeLast();

        }


    }

    private boolean isPalindrome(String s, int startIndex, int end) {
        for (int i = startIndex, j = end; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }

        return true;
    }

}
