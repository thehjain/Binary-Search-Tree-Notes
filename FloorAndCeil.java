//Floor is defined as the greatest value smaller than or equal to
//given key
//Ceil is defines as the smallest value greater than
//or equal to given key.

//We have to find floor and ceil of given bst.


public void floorCeilBSTHelper(Node root,
                               int key) {
	while (root != null) {
		if (root.data == key) {
			ceil = root.data;
			floor = root.data;
			return;
		}

		if (key > root.data) {
			floor = root.data;
			root = root.right;
		} else {
			ceil = root.data;
			root = root.left;
		}
	}
	return;
}

//Problem is available on geeksforgeeks