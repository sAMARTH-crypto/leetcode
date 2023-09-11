class ListNode{
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

//pseudo code
    //naive approach
 void removeNodes(ListNode head){
        if(head==null) return; //null-base case

     ListNode current; //starting node
     current = head;
     while(current!=null){
         ListNode runner;//runner node will traverse the LinkedList
         runner = current;
         while(runner.next.val>current.val){
             current = current.next;
             break;
         }
         runner = runner.next;
         if(runner.next==nul) {
             break;
         }
     } return current;

}

// Optimized approach
void removeNodesOp(ListNode head){
        if(head==null) return;

    Stack<ListNode> stack = new Stack<>();
    ListNode current = head;

    /*this loop is checking if current value is greater than the value at the top of stack
     if it's true than pop that value and push the current value to stack and move current to next value
     after traversing the whole list we will have a stack with values in descending order*/
    while(current!=null){
        while(!stack.isEmpty() && current.val>stack.peek().val){
            stack.pop();
        }
        stack.push(current);
        current=current.next;
    }
    head = null;
    while (!stack.isEmpty()){
        ListNode node = stack.pop();
        node.next = head;
        head = node;
    }
    return head;
}


}
