/**
 * 223. 矩形面积
 * 给你 二维 平面上两个 由直线构成的 矩形，请你计算并返回两个矩形覆盖的总面积。
 * <p>
 * 每个矩形由其 左下 顶点和 右上 顶点坐标表示：
 * <p>
 * 第一个矩形由其左下顶点 (ax1, ay1) 和右上顶点 (ax2, ay2) 定义。
 * 第二个矩形由其左下顶点 (bx1, by1) 和右上顶点 (bx2, by2) 定义。
 *
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：ax1 = -3, ay1 = 0, ax2 = 3, ay2 = 4, bx1 = 0, by1 = -1, bx2 = 9, by2 = 2
 * 输出：45
 * 示例 2：
 * <p>
 * 输入：ax1 = -2, ay1 = -2, ax2 = 2, ay2 = 2, bx1 = -2, by1 = -2, bx2 = 2, by2 = 2
 * 输出：16
 * <p>
 *
 * @author sunjianrong
 * @date 2021-10-01 21:26
 */
public class Q223矩形面积 {

    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        // 求两个矩形 x轴方向相交的长度
        int x = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1));

        // 求两个矩形 y 轴方向相交的长度
        int y = Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1));

        // 两个矩形的面积和  - 相交的面积
        return (ay2 - ay1) * (ax2 - ax1) + (by2 - by1) * (bx2 - bx1) - (x * y);

    }
}
