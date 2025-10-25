package implement.linkedlist;

public class LinkedList<T> {

	private Node<T> head;
	private Node<T> tail;
	private int length;
	
	public boolean hasLoop() {
		
		boolean hasLoop = false;
		
		Node<T> slowPointerNode = head;
		Node<T> fastPointerNode = head;
		
		while(fastPointerNode != null && fastPointerNode.getNextNode() != null) {
			
			slowPointerNode = slowPointerNode.getNextNode();
			fastPointerNode = fastPointerNode.getNextNode().getNextNode();

			System.out.println("Value of slow node: " + slowPointerNode + " and faster node: " + fastPointerNode);

			if (slowPointerNode == fastPointerNode) {
				hasLoop = true;
				break;
			}
		}
		
		
		
		return hasLoop;
	}
	
	
	/***
	 * Finds the middle node of the list with two pointer approach
	 * This method does not allow finding via list and iterates the list only once
	 * @return
	 */
	public Node<T> getMiddleNode() {
		
		Node<T> middleNode = null;
		Node<T> secondPointerNode = null;
		
		middleNode = this.head;
		secondPointerNode = this.head;
		
		while(secondPointerNode.getNextNode() != null) {

			if (secondPointerNode != null && secondPointerNode.getNextNode() != null) {
				middleNode = secondPointerNode;
				secondPointerNode = secondPointerNode.getNextNode().getNextNode();
				
			} else {
				
				break;
			}
		}
		
		return middleNode;
	}

	public boolean prepend(T value) {

		// Node to prepend
		Node<T> nodeToPrepend = new Node<T>(value);

		if (this.length == 0) {
			this.head = nodeToPrepend;
			this.tail = nodeToPrepend;

		} else {

			Node<T> tempNode = this.head;

			this.head = nodeToPrepend;
			nodeToPrepend.setNextNode(tempNode);
		}

		System.out.println("Length of the list after prepending: " + ++this.length);
		return true;
	}

	public Node<T> popFirst() {

		if (this.length == 0) {
			return null;
		} else {
			Node<T> nodeToPop = null;

			// N1 -> N2 -> N3 -> N4
			nodeToPop = this.head;
			this.head = nodeToPop.getNextNode();

			// The list is empty after removing the node
			if (this.head.getNextNode() == null) {
				this.tail = this.head;
			}

			nodeToPop.setNextNode(null);
			this.length--;

			return nodeToPop;
		}
	}

	public Node<T> pop() {

		// Iterate over the list

		Node<T> currentNode = this.head;
		Node<T> tempNode = this.head;
		Node<T> previousNode = null;

		while (currentNode != null) {

			// This means that this is the tail node
			// N1 -> N2 -> N3 -> N4 -> N5
			if (currentNode.getNextNode() == null) { // We have reached the tail

				// Current node is the tail
				// Previous node is one node behind current node
				tempNode = currentNode;
				// Update the previous node
				if (previousNode != null) {
					previousNode.setNextNode(null);
					this.tail = previousNode;
				} else {
					this.tail = null;
					this.head = null;
				}

				this.length--;
				currentNode = null; // This will break the loop

			} else {

				tempNode = currentNode;
				currentNode = currentNode.getNextNode();
				previousNode = tempNode;

			}
		}

		System.out.println("Length of the list after pop: " + this.length);
		return tempNode;
	}

	public void reverseList() {

		if (this.length == 0) {
			System.out.println("List is empty!");
			return;
		} else if (this.length == 1) {
			System.out.println("Nothing to do");
			return;
		} else {

			Node<T> tempNode = this.head;
			
			this.head = this.tail;
			this.tail = tempNode;
			
			Node<T> afterNode = tempNode.getNextNode();
			
			Node<T> beforeNode = null;
			
			
			// N1 -> N2 -> N3 -> N4
			
			for (int a = 0; a < length; a++) {
				
				afterNode = tempNode.getNextNode();
				tempNode.setNextNode(beforeNode);
				beforeNode = tempNode;
				tempNode = afterNode;
				
			}
			
		}
	}

	public LinkedList(Node<T> node) {

		this.head = node;
		this.setTail(node);
		length = 1;
	}

	// Empty Constructor
	public LinkedList() {
		this.length = 0;
	}

	public int getLength() {
		return length;
	}

	public Node<T> getHead() {
		return head;
	}

	public void setHead(Node<T> head) {
		this.head = head;
	}

	public Node<T> getTail() {
		return tail;
	}

	public void setTail(Node<T> tail) {
		this.tail = tail;
	}

	public void printList() {

		if (this.length == 0) {
			return;
		}

		Node<T> node = this.head;

		System.out.println("Length of the list: " + length);

		boolean isHead = true;

		while (node != null) {

			System.out.println("--- " + (isHead ? "(Head)" : "") + node.toString() + " ---");
			node = node.getNextNode();
			isHead = false;
		}
	}

	public void append(T value) {

		// Node to append
		Node<T> nodeToAppend = new Node<T>(value);

		// N1 -> N2-> N3 -> N4 -> N5
		// N1 -> N2-> N3 -> N4 -> N5 -> NT

		if (this.head == null) {
			this.head = nodeToAppend;
			this.tail = nodeToAppend;
			this.length = 1;
		} else {

			// Temp node
			Node<T> tempNode = this.tail;
			this.tail = nodeToAppend;
			tempNode.setNextNode(nodeToAppend);

			this.length++;
		}

		System.out.println("Length of the list is " + this.length + " after appending the value " + value.toString());
	}

	public boolean setValue(int index, T value) {

		try {

			// Find the node
			Node<T> node = get(index);
			node.setValue(value);
			return true;
		} catch (IndexOutOfBoundsException ex) {
			System.out.println(ex.getMessage());
			return false;
		}
	}

	public Node<T> get(int index) {

		// Initialize the node that needs to be returned
		Node<T> node = null;

		// Because the list is empty
		if (this.length == 0) {
			throw new IndexOutOfBoundsException("Linked List is empty");
		}

		node = this.head;

		if (index == 0) {
			return node;
		}

		int counter = 1;

		// N1 -> N2 -> N3 -> N4 -> N5
// index  0     1     2

		while (counter <= index) {

			node = node.getNextNode();

			if (node.getNextNode() == null && counter < index) {
				throw new IndexOutOfBoundsException(
						String.format("Value of counter: %d and the index: %d", counter, index));
			}
			counter++;
		}
		return node;

	}

	public Node<T> remove(int index) {

		try {

			Node<T> n;

			if (index == 0) {
				n = popFirst();
			} else if (index == length - 1) {
				n = pop();
			} else {

				// N1 -> N2 -> N3 -> N4 -> N5
				// 0 1 2 3 4
				//
				n = get(index); // Imagine index = 2
				Node<T> nodeAtPreviousIndex = get(index - 1); // Imagine index = 1
				Node<T> tempNode = n.getNextNode();
				nodeAtPreviousIndex.setNextNode(tempNode);
				n.setNextNode(null);
				length--;
			}

			return n;

		} catch (IndexOutOfBoundsException ex) {
			return null;
		}

	}

	public boolean insert(int index, T value) {

		try {

			// We are adding to the head
			if (index == 0) {
				prepend(value);
			} else if (index == length - 1) { // Adding at the tail
				append(value);
			} else {
				// N0 -> N1 -> N2 -> N3 -> N4 (Insert into N3.4)
				// N1.5
				// Get the node at the index
				Node<T> nodeAtIndex = get(index - 1);

				System.out.println("Fetched the node at the index: " + index + " " + nodeAtIndex.getValue());

				// Create the node that needs to be inserted
				Node<T> nodeToInsert = new Node<>(value);

				// Save the next node of the index node
				Node<T> tempNode = nodeAtIndex.getNextNode();

				// Set the next of the node to isnert to the next of the node of the index
				nodeToInsert.setNextNode(tempNode);

				// Set the next node of the current node to the new node to be inserted
				nodeAtIndex.setNextNode(nodeToInsert);

			}

			// Incremennt the length of the list
			this.length++;

			return true;

		} catch (IndexOutOfBoundsException ex) {
			return false;
		}
	}

}
