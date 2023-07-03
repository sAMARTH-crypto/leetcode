class Solution {
	public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        
        return Math.max(leftDepth, rightDepth) + 1;
    }


  
    int solMaxDepth(TreeNode root) {
	
	
		
		if (root == null)
			return 0;
		Queue<TreeNode> node = new LinkedList<>();
		
		node.add(root);
		int noOfLvl = 0;
		
		while(!node.isEmpty()) {
			noOfLvl++;
			int sizeNode = node.size();
			
			for(int i = 0; i<sizeNode; i++) {
				
				TreeNode popNode = node.poll();
				
				if(popNode.left != null)
					node.add(popNode.left);
				if(popNode.right != null)
					node.add(popNode.right);
				
			}
		}
		
		return noOfLvl;		
	}
}
