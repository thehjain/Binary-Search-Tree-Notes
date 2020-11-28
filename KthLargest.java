//Here we have to find the kth largest element in bst


//Basic approach is to do inorder traversal of bst store
//it somewhere and check from the last.

//Efficient approach is to do reverse inorder traversal
//using recursion and keep counting the elements in
//decreasing order and return when it's kth element.

static int count = 0;

static void kthLargest(Node root, int k, int count) {
	if (node == null || count > k)
		return;
	kthLargest(root.right, k, count);
	count++;
	if (count == k) {
		System.out.println("kth largest element is " + root.data);
		return;
	}
	kthLargest(root.left, k, count);
}


//Problem is available on geeksforgeeks