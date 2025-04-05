// class MinStack {
//     Stack<Integer> main;
//     Stack<Integer> min;
//     public MinStack() {
//         main=new Stack<>();
//         min=new Stack<>();
        
//     }
    
//     public void push(int val) {
//         main.push(val);
//         if(min.empty() || min.peek() >= val) {
//             min.push(val);
//         }
        
//     }
    
//     public void pop() {
//         if(!main.empty()){
//  // in Java, == compares object references for objects like Integer,
//  // not their actual values.
// //This works for small integers due to Java's internal Integer caching 
// //(from -128 to 127), 
// //but will fail for larger or non-cached numbers.
//         if (main.peek().equals(min.peek())) {
//              min.pop();
//             }
//         main.pop();

//         }

        
//     }
    
//     public int top() {
//         if(!main.empty()){
//             return main.peek();
//         }else{
//             return -1;
//         }


        
//     }
    
//     public int getMin() {
//         if(min.isEmpty()){
//             return -1;

//         }else{
//             return min.peek();
//         }
        
        
//     }
// }







//more optimal approce using only one stack

class MinStack {
    Stack<Integer> main;
    int min = Integer.MAX_VALUE;

    public MinStack() {
        main = new Stack<>();
    }

    public void push(int val) {
        if (val <= min) {
            main.push(min);  // store previous min
            min = val;
        }
        main.push(val);  // push the actual value
    }

    public void pop() {
        int popped = main.pop();
        if (popped == min) {
            min = main.pop();  // restore previous min
        }
    }

    public int top() {
        return main.isEmpty() ? -1 : main.peek();
    }

    public int getMin() {
        return min;
    }
}


/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
