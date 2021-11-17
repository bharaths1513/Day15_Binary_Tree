package Day15_Binary_tree;

public class binaryTree {
	binaryTreeNode root;

	binaryTreeNode addRecursive(binaryTreeNode current, int value) {
		if (current == null) {
			return new binaryTreeNode(value);
		}

		if (value < current.value) {
			current.left = addRecursive(current.left, value);
		} else if (value > current.value) {
			current.right = addRecursive(current.right, value);
		} else {
			// value already exists
			return current;
		}

		return current;
	}

	// Adding node with help of the root Node

	public void add(int value) {
		root = addRecursive(root, value);
	}

	public static void main(String[] args) {
		binaryTree bt = new binaryTree();
		bt.add(1);
		bt.add(4);
		bt.add(12);
		System.out.println(bt.toString());
	}
}
