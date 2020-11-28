//Here we have given bst and a target sum and we have
//to find the pair which given sum equal to target sum.

//Basic approach is to check ever pair of bst and it will
//give time complexity of O(n^2).

//Another efficient approach is to store the inorder traversal
//of bst in an array or arraylist and from that we can find
//the pair in O(n) and it will give overall time compelexity of
//O(n).

//Approach is using HashSet

public int isPairPresent(Node root, int target) {
	// Write your code here
	HashSet<Integer> set = new HashSet<>();
	return (isPairUtil(set, root, target)) ? 1 : 0;
}
static boolean isPairUtil(HashSet<Integer> set, Node root, int target) {
	if (root == null)
		return false;
	if (isPairUtil(set, root.left, target))
		return true;
	if (set.contains(target - root.data))
		return true;
	else
		set.add(root.data);
	return isPairUtil(set, root.right, target);
}


//Problem is available on geeksforgeeks