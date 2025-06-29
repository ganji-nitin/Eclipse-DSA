package heapDS;

public class BinarySearchTree {

	private Node root;
	private int count;
	
	public int size() {
		return count;
	}
	
	public boolean isEmpty() {
		return size()==0;
	}
	
	public void add (int key) {
		if(root == null) {
			root = new Node(key);
			count++;
			return;
		}
		
		Node prev = null;
		Node curr = root;
		while(curr != null) {
		if(key < curr.key) {
			prev = curr;
			curr = curr.left;
		}
		else if(key > curr.key) {
			prev = curr;
			curr = curr.right;
		}
		else
			return;
		}
		if(key < prev.key)prev.left = new Node(key);
		if(key > prev.key )prev.right = new Node(key);
	}
}
