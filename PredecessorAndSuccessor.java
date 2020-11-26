//Here we have given binary search tree and a key
//we have to find it's predecessor and successor


//Approach is to simply find the key in binary search
//tree and for predecessor check if left substree is not
//null and return right most node and similarly do it for
//successor.

public static void findPreSuc(Node root, Res p, Res s, int key) {
	// add your code here
	if (root == null)
		return;
	if (root.data == key) {
		if (root.left != null) {
			p.pre = root.left;
			while (p.pre.right != null)
				p.pre = p.pre.right;
		}
		if (root.right != null) {
			s.succ = root.right;
			while (s.succ.left != null)
				s.succ = s.succ.left;
		}
	} else if (root.data < key) {
		p.pre = root;
		findPreSuc(root.right, p, s, key);
	} else {
		s.succ = root;
		findPreSuc(root.left, p, s, key);
	}
}


//Problem is available on geeksforgeeks