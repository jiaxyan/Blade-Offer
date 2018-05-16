package tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.right = new TreeNode(2);
		root.right.left = new TreeNode(3);
		
		Solution94 s94 = new Solution94();
		List<Integer> inorder = s94.inorderTraversal(root);
		for (Integer num : inorder) {
			System.out.print(num+"  ");
		}
	}

}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution94 {
	List<Integer> inorderTraversallist = new LinkedList<Integer>();
    public List<Integer> inorderTraversal(TreeNode root) {
    	inorderloop(root);
        return inorderTraversallist;
    }

    public void inorderloop(TreeNode root) {
    	if(root==null)
    		return;
    	
    	Stack<TreeNode> nodes = new Stack<TreeNode>();
    	TreeNode current_root = root;
    	while(current_root!=null || !nodes.isEmpty()) {
    		if(current_root!=null) {
    			nodes.push(current_root);
    			current_root = current_root.left;
    		}
    		else {
    			current_root = nodes.pop();
    			inorderTraversallist.add(current_root.val);
    			current_root = current_root.right;
    		}
    	}
    }
    
    
    //递归方法
    public void inorder(TreeNode root) {
    	if(root==null)
    		return;
    	inorderTraversal(root.left);
    	inorderTraversallist.add(root.val);
    	inorderTraversal(root.right);
    }
    

}