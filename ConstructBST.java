//Here we have given keys at random and
//we have to construct binary search tree
//from that keys.

//Here Array given is sorted

public TreeNode sortedArrayToBST(int[] nums) {

	if (nums.length == 0)
		return null;

	return helper(nums, 0, nums.length - 1);
}

TreeNode helper(int[] nums, int low, int high) {
	if (low > high)
		return null;
	int mid = (low + high) / 2;
	TreeNode curr = new TreeNode(nums[mid]);
	curr.left = helper(nums, low, mid - 1);
	curr.right = helper(nums, mid + 1, high);
	return curr;
}


//Problem is present on leetcode


//If we are asked to tell number of all
//unique bst's that can be build with
//given keys then it is nothing but catallan
//number

