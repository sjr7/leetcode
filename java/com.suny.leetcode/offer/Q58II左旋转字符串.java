package offer;

/**
 * 剑指 Offer 58 - II. 左旋转字符串
 * <p>
 * 字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。请定义一个函数实现字符串左旋转操作的功能。比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。
 * <p>
 *
 * <p>
 * 示例 1：
 * <p>
 * 输入: s = "abcdefg", k = 2
 * 输出:"cdefgab"
 * <p>
 *
 * @author sunjianrong
 * @date 2021-08-03 12:09
 */
public class Q58II左旋转字符串 {

    public String reverseLeftWords(String s, int n) {
        final String substring = s.substring(0, n);
        return s.substring(n) + substring;
    }

}
