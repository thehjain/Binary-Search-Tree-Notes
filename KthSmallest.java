//Here we have given binary search tree and we have to
//find the kth smallest element in it.

//One way is to do inorder travesal and find the kth
//element in it.

//Efficient approach is to use Morris Traversal.

// Assume that the root is having ‘lCount’ nodes in
// its left subtree. If K = lCount + 1, root is K-th node.
//  If K < lCount + 1, we will continue our search (recursion)
//   for the Kth smallest element in the left subtree of root.
//    If K > lCount + 1, we continue our search in
// the right subtree for the (K – lCount – 1)-th
// smallest element


Node kthSmallest(Node node, int k) {
	if (node == null)
		return null;
	int count = node.lcount + 1;
	if (count == k)
		return node;
	if (count > k)
		return kthSmallest(node.left, k);
	return kthSmallest(node.right, k - count);
}


//Problem is available on geeksforgeeks