package offer;

import java.util.ArrayList;
import java.util.List;

/**
 * 剑指 Offer 17. 打印从1到最大的n位数
 * 输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999。
 * <p>
 * 示例 1:
 * <p>
 * 输入: n = 1
 * 输出: [1,2,3,4,5,6,7,8,9]
 * <p>
 * <p>
 * 说明：
 * <p>
 * 用返回一个整数列表来代替打印
 * n 为正整数
 *
 * @author sunjianrong
 * @date 2021/7/26 下午9:36
 */
public class Q17打印从1到最大的n位数 {

    public int[] printNumbers(int n) {
        int maxV = (int) (Math.pow(10, 3) - 1);

        int[] ints = new int[maxV];
        for (int i = 0; i < maxV; i++) {
            ints[i] = i;
        }

        return ints;
    }


    public static void main(String[] args) {
        System.out.println(Math.pow(10, 3));
    }

}
