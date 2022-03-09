/*
Implement a Queue using 2 stacks s1 and s2 .
A Query Q is of 2 Types
(i) 1 x (a query of this type means  pushing 'x' into the queue)
(ii) 2   (a query of this type means to pop element from queue and print the poped element)

Link: https://practice.geeksforgeeks.org/problems/queue-using-two-stacks/1#
*/

class StackQueue
{
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    //Function to push an element in queue by using 2 stacks.
    void Push(int x)
    {
	   // Your code here
	   s1.push(x);
    }
	
    
    //Function to pop an element from queue by using 2 stacks.
    int Pop()
    {
	   // Your code here
	   if(s1.isEmpty()) {
	       return -1;
	   }
	   
	   while(s1.size() != 1) {
	       int val = s1.pop();
	       s2.push(val);
	   }
	   
	   int result = s1.pop();
	   
	   while(!s2.isEmpty()) {
	       int val = s2.pop();
	       s1.push(val);
	   }
	   
	   return result;
    }
}

/*
Time Complexity for push: O(1)
Time Complexity for pop: O(N)
Space Complexity: O(1)
*/
