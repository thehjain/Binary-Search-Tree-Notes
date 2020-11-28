//Here we have given binary tree and we have to find
//the largest Binary search tree in it.

//Basic approach is to start from root node and check
//for every node considering it root that it is bst or
//not.


//Efficient approach is to do bottom up approach as
//we check for left subtree and right subtree and
//for parent node we can check isBST in O(1).
//as every subtree will pass information to its parent.


class Info {
	int size = 0;
	int min = Integer.MAX_VALUE;
	int max = Integer.MIN_VALUE;
	int ans = 0;
	boolean isBST = false;
	Info(int size, int min, int max, int ans, boolean isBST) {
		this.size = size;
		this.min = min;
		this.max = max;
		this.ans = ans;
		this.isBST = isBST;
	}
	Info() {}
}

static int largestBst(Node root) {
	// Write your code here
	if (root == null)
		return 0;
	return largestBST(root).ans;
}
static Info largestBST(Node root) {
	if (root == null)
		return new Info(0, Integer.MAX_VALUE, Integer.MIN_VALUE,
		                0, true);
	if (root.left == null && root.right == null) {
		return new Info(1, root.data, root.data, 1, true);
	}
	Info l = largestBST(root.left);
	Info r = largestBST(root.right);

	Info res = new Info();
	res.size = 1 + l.size + r.size;
	if (l.isBST && r.isBST && l.max < root.data && r.min > root.data) {
		res.min = Math.min(l.min, Math.min(r.min, root.data));
		res.max = Math.max(r.max, Math.max(l.max, root.data));
		res.ans = res.size;
		res.isBST = true;
		return res;
	}
	res.ans = Math.max(l.ans, r.ans);
	res.isBST = false;
	return res;
}



//Problem is available on geeksforgeeks