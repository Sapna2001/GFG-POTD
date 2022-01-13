/*
Given an integer K and a queue of integers, we need to reverse the order of the first K elements of the queue, leaving the other elements in the same relative order.

Only following standard operations are allowed on queue.

- enqueue(x) : Add an item x to rear of queue
- dequeue() : Remove an item from front of queue
- size() : Returns number of elements in queue.
- front() : Finds front item.

Link: https://practice.geeksforgeeks.org/problems/reverse-first-k-elements-of-queue/1
*/

class GfG {
    // Function to reverse first k elements of a queue.
    public Queue<Integer> modifyQueue(Queue<Integer> queue, int k) {
        // add code here.
        Stack<Integer> stack = new Stack<Integer>();
        
        for(int i = 0 ; i < k ; i++) {
            Integer element = queue.peek();
            stack.push(element);
            queue.remove();
        }
        
        while(!stack.isEmpty()) {
            Integer element = stack.peek();
            queue.add(element);
            stack.pop();
        }
        
        for(int i = 0; i < queue.size() - k ; i++) {
            Integer element = queue.peek();
            queue.remove();   
            queue.add(element);
        }
        
        return queue;
    }
}

/*
Time Complexity: O(n + k)
Space Complexity: O(n)
*/

