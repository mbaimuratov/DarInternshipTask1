import java.util.*


class MyStack() {

    /** Initialize your data structure here. */

    var q1: Queue<Int> = LinkedList()
    var q2: Queue<Int> = LinkedList()

    /** Push element x onto stack. */
    fun push(x: Int) {
        q2.add(x)

        while (q1.isNotEmpty()) {
            q2.add(q1.remove())
        }

        q1 = q2
        q2 = LinkedList()
    }

    /** Removes the element on top of the stack and returns that element. */
    fun pop(): Int {
        return q1.remove()
    }

    /** Get the top element. */
    fun top(): Int {
        return q1.peek()
    }

    /** Returns whether the stack is empty. */
    fun empty(): Boolean {
        return q1.isEmpty()
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * var obj = MyStack()
 * obj.push(x)
 * var param_2 = obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.empty()
 */