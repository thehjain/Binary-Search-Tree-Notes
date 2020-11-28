//Here we have to serialze and deserialize binary tree

static int index = 0;

public void serialize(Node root, ArrayList<Integer> A) {
	if (root == null) {
		A.add(-1);
		return;
	}
	A.add(root.data);
	serialize(root.left, A);
	serialize(root.right, A);
	index = 0;
}

public Node deSerialize(ArrayList<Integer> A) {
	if (index == A.size() || A.get(index) == -1) {
		index++;
		return null;
	}
	Node root = new Node(A.get(index));
	index++;
	root.left = deSerialize(A);
	root.right = deSerialize(A);
	return root;
}


//Problem is available on geeksforgeeks