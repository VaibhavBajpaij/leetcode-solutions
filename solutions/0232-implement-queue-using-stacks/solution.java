

// // ALGORITHM:
// // 1. Use two stacks: s1 for maintaining queue order, s2 as a helper stack.
// // 2. On push(x):
// //    - Move all elements from s1 to s2.
// //    - Push new element x into s1.
// //    - Move all elements back from s2 to s1. Now s1's top is the front of the queue.
// // 3. On pop():
// //    - Simply pop from s1 (as it holds the queue in correct order).
// // 4. On peek():
// //    - Return s1.peek() (front of queue).
// // 5. On empty():
// //    - Return if s1 is empty.

// class MyQueue {
//     Stack<Integer> s1;  // Stack to store queue elements
//     Stack<Integer> s2;  // Temporary stack used during push operation

//     public MyQueue() {
//         s1 = new Stack<>();  // Initialize both stacks
//         s2 = new Stack<>();
//     }

//     public void push(int x) {
//         // Move all elements from s1 to s2 to reverse the order
//         while (!s1.empty()) {
//             s2.push(s1.pop());  // Example: s1 = [3,2,1] → s2 = [1,2,3]
//         }

//         // Push the new element into s1
//         s1.push(x);  // Example: pushing 4 → s1 = [4]

//         // Move elements back from s2 to s1 to restore order
//         while (!s2.empty()) {
//             s1.push(s2.pop());  // Now s1 = [3,2,1,4] → top is front of queue
//         }
//     }

//     public int pop() {
//         // If s1 is empty, return -1 (queue is empty)
//         if (s1.empty()) {
//             return -1;
//         } else {
//             return s1.pop();  // Removes and returns front of queue
//         }
//     }

//     public int peek() {
//         // Return front of queue without removing it
//         if (s1.empty()) {
//             return -1;
//         } else {
//             return s1.peek();
//         }
//     }

//     public boolean empty() {
//         // Returns true if queue is empty
//         return s1.empty();
//     }
// }








// ALGORITHM (USING TWO STACKS - Optimized):
// 1. Use two stacks:
//    - 'in' stack for enqueue (push) operations.
//    - 'out' stack for dequeue (pop/peek) operations.
// 2. push(x):
//    - Simply push element x onto the 'in' stack.
// 3. pop():
//    - If 'out' stack is empty:
//        - Transfer all elements from 'in' to 'out' (this reverses order).
//    - Then pop from 'out' stack.
// 4. peek():
//    - Same as pop(), but return top of 'out' without removing it.
// 5. empty():
//    - Return true if both 'in' and 'out' stacks are empty.

class MyQueue {
    Stack<Integer> in;   // Stack to handle input operations (enqueue)
    Stack<Integer> out;  // Stack to handle output operations (dequeue)

    public MyQueue() {
        in = new Stack<>();   // Initialize input stack
        out = new Stack<>();  // Initialize output stack
    }

    // Push element x to the back of queue
    public void push(int x) {
        in.push(x);  // Directly push to 'in' stack
        // Example: push(1), in = [1]; push(2), in = [1, 2]
    }

    // Removes the element from in front of queue and returns that element
    public int pop() {
        if (out.isEmpty()) {
            // Transfer elements from 'in' to 'out' only when 'out' is empty
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }
        // If out is still empty, return -1 (queue is empty)
        return out.isEmpty() ? -1 : out.pop();
    }

    // Get the front element
    public int peek() {
        if (out.isEmpty()) {
            // Transfer only if needed
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }
        // If queue is empty, return -1
        return out.isEmpty() ? -1 : out.peek();
    }

    // Returns whether the queue is empty
    public boolean empty() {
        return in.isEmpty() && out.isEmpty();  // Both stacks must be empty
    }
}


    
   
    
    



/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
