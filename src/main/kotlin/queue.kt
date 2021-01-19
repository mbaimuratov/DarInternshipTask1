import java.util.*

class MyQueue() {

    /** Initialize your data structure here. */
    var s1: Stack<Int> = Stack() //new
    var s2: Stack<Int> = Stack() //old

    /** Push element x to the back of queue. */
    fun push(x: Int) {
        s1.push(x)
    }

    /** Removes the element from in front of queue and returns that element. */
    fun pop(): Int {
        transfer()
        return s2.pop()
    }

    private fun transfer() {
        if (s2.isEmpty()) {
            while (s1.isNotEmpty()) {
                s2.push(s1.pop())
            }
        }
    }

    /** Get the front element. */
    fun peek(): Int {
        transfer()
        return s2.peek()
    }

    /** Returns whether the queue is empty. */
    fun empty(): Boolean {
        return s1.isEmpty() && s2.isEmpty()
    }

}

/**
 * Your MyQueue object will be instantiated and called as such:
 * var obj = MyQueue()
 * obj.push(x)
 * var param_2 = obj.pop()
 * var param_3 = obj.peek()
 * var param_4 = obj.empty()
 */