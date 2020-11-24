//here we have to simply search given node in binary
//search tree.


boolean search(Node root, int val) {
	if (root == null) return false;
	if (root.data == val)
		return true;
	if (root.data > val)
		search(root.left, val);
	else
		search(root.right, val);
}


//Problem is available on leetcode