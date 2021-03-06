package offer;

import java.util.Stack;

/**
 * 剑指 Offer 09. 用两个栈实现队列
 * <p>
 * 用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )
 * <p>
 * 示例 1：
 * <p>
 * 输入：
 * ["CQueue","appendTail","deleteHead","deleteHead"]
 * [[],[3],[],[]]
 * 输出：[null,null,3,-1]
 *
 * @author sunjianrong
 * @date 2021-07-19 12:11
 */
public class Q09用两个栈实现队列 {

    // 栈1用来入队   栈2用来获取元素
    Stack<Integer> stack1;
    Stack<Integer> stack2;


    /**
     * Your CQueue object will be instantiated and called as such:
     * CQueue obj = new CQueue();
     * obj.appendTail(value);
     * int param_2 = obj.deleteHead();
     */
    public Q09用两个栈实现队列() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {

        // 栈2非空就直接用栈2
        if (!stack2.isEmpty()) {
            return stack2.pop();
        }

        // 栈1为空说明空元素了
        if (stack1.isEmpty()) {
            return -1;
        }

        // 把栈1的元素复制到栈2上
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        return stack2.pop();
    }
}
