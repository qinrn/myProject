package train.arithmetic.leetcode.demo;

public class L0101 {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(0);
		
		boolean ok = isSymmetric(root);
		
	}

	private static boolean isSymmetric(TreeNode root) {
		
		return isMirror(root,root);
		
	}

	private static boolean isMirror(TreeNode left, TreeNode right) {
		if(left == null && right == null ) {
			return true;
		}
		
		if(left == null || right == null ) {
			return false;
		}
		
		return isMirror(left.left,right.right) && isMirror(left.right, right.left) && (left.val == right.val);
		
	}

}


class TreeNode {
	  int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
}