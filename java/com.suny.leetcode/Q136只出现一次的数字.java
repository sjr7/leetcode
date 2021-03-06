/**
 * 136. 只出现一次的数字
 * <p>
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * <p>
 * 说明：
 * <p>
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 *
 * @author sunjianrong
 * @date 2021-07-13 12:10
 */
public class Q136只出现一次的数字 {

    public int singleNumber(int[] nums) {
        int answer = nums[0];
        if (nums.length > 1) {
            for (int i = 1; i < nums.length; i++) {
                answer = answer ^ nums[i];
            }
        }

        return answer;

    }
}
