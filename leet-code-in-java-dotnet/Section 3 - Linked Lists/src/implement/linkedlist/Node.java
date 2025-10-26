package implement.linkedlist;

public class Node<T> {

	private T value; 
	private Node<T> nextNode;
	
	@Override
	public String toString() {
		
		return value.toString();
	}
	
	public Node(T value, Node<T> nextNode) {
		
		this.setValue(value);
		this.setNextNode(nextNode);
	}
	

	public Node(T value) {
		
		this.setValue(value);
	}

	public Node<T> getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node<T> nextNode) {
		this.nextNode = nextNode;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
}
