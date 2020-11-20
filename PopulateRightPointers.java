//Here we have binary search tree and we have populate right
//pointers or we have connect nodes at same level


// Input Tree
//        A
//       / \
//      B   C
//     / \   \
//    D   E   F

// Output Tree
//        A--->NULL
//       / \
//      B-->C-->NULL
//     / \   \
//    D-->E-->F-->NULL


//Approach is to use queue and do breadth first traversal

public Node connect(Node root) {
	if (root == null)
		return root;
	Queue<Node> q1 = new LinkedList<>();
	q1.add(root);
	q1.add(null);
	while (!q1.isEmpty()) {
		Node temp = q1.poll();
		if (temp != null) {
			temp.next = q1.peek();
			if (temp.left != null)
				q1.add(temp.left);
			if (temp.right != null)
				q1.add(temp.right);
		} else if (!q1.isEmpty())
			q1.add(null);
	}
	return root;
}



//Problem is available on leetcode