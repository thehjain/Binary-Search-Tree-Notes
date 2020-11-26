//Here we have given binary search tree and
//two nodes and we have to find the lowest
//common ancestor of given nodes. It's very
//easy to find LCA in BST as compared to binary
//tree.

Node LCA(Node root, int n1, int n2) {
	// code here.
	if (root == null)
		return null;
	if (root.data == n1 || root.data == n2)
		return root;
	else if (root.data > n1 && root.data > n2)
		return LCA(root.left, n1, n2);
	else if (root.data < n1 && root.data < n2)
		return LCA(root.right, n1, n2);
	else {
		return root;
	}
}



//Problem is available on geeksforgeeks