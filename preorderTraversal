public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

class Solution {
    	public List<Integer> preorderTraversal(TreeNode root){
		
		List<Integer> list = new ArrayList();
		Stack <TreeNode> stack = new Stack();
		stack.push(root);
		
		while(!stack.isEmpty()) {
			TreeNode curr = stack.pop();  // which is the root of tree is stored as current
			if(curr!=null) {
			
				list.add(curr.val);    //root is stored at the first index in array
				stack.push(curr.right);   // right leave is push in stack 1st and popped later
				stack.push(curr.left);  // left leave is pushed later and popped first
			}
			
		}
		
		return list;
		
		
	}
}
