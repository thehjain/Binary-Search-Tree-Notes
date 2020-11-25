//Here we have to check if given binary tree
//is bst or not.

//Property of BST is simply left subtree nodes
//are less than root and righ subtree nodes
//are greater than root node.

boolean isBST(Node root) {
	// code here.
	return checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
}
boolean checkBST(Node node, int left, int right) {
	if (node == null)
		return true;
	if (node.data >= right || node.data <= left)
		return false;
	return checkBST(node.left, left, node.data) && checkBST(node.right, node.data, right);
}


//Problem is available on geeksforgeeks