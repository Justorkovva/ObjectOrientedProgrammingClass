package Class11;

class Ex2_Node <T extends Comparable<T>> {
	private Ex2_Node<T> leftNode, rightNode;
	private T value;

	public Ex2_Node(T i) {
		leftNode = null; 
		rightNode = null;
		value = i;
	}
	
	public boolean contains(T v) {
		if (v.compareTo(value) == 0) { return true; }
		if (v.compareTo(value) < 0) {
			if (leftNode == null) {
				return false;
			} else {
				return leftNode.contains(v);
			}
		} else {
			if (rightNode == null) {
				return false;
			} else {
				return rightNode.contains(v);
			}
		}
	}

	public void insert(T v) {
		if (v.compareTo(value) == 0) { return; } // the node is already there
		if (v.compareTo(value) < 0) {
			if (leftNode == null) {
				leftNode = new Ex2_Node<T>(v);
			} else { leftNode.insert(v); }
		} else {
			if (rightNode == null) {
				rightNode = new Ex2_Node<T>(v);
			} else { rightNode.insert(v); }
		}
	}
	
	public void showAllElements() {
		if(leftNode != null)
			leftNode.showAllElements();
		System.out.println(value);
		if(rightNode != null)
			rightNode.showAllElements();
	}
}
