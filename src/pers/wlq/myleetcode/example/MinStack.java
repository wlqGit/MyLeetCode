package pers.wlq.myleetcode.example;

import java.util.Stack;

/**
 * Created by wulaiquan on 16/3/21.
 */
public class MinStack {
    Stack<Integer> stk = new Stack<Integer>();
    Stack<Integer> min = new Stack<Integer>();

    public void push(int x) {
        stk.push(x);
        if (min.isEmpty() || x <= min.peek()) {
            min.push(x);
        }
    }

    public void pop() {
        int x = stk.pop();
        if (!min.isEmpty() && min.peek() == x) {
            min.pop();
        }
    }

    public int top() {
        if (!stk.isEmpty()) {
            return stk.peek();
        } else {
            return 0;
        }
    }

    public int getMin() {
        if (!min.isEmpty()) {
            return min.peek();
        } else {
            return 0;
        }
    }
}

