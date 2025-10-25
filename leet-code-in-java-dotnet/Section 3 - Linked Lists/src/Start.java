
import implement.linkedlist.LinkedList;
import implement.linkedlist.Node;

public class Start {

	public static void main(String[] args) {
		
		// Now initialize a list with loop
		Node<Integer> node1 = new Node<Integer>(1);
		Node<Integer> node2 = new Node<Integer>(2);
		Node<Integer> node3 = new Node<Integer>(3);
		Node<Integer> node4 = new Node<Integer>(4);
		
		node1.setNextNode(node2);
		node2.setNextNode(node3);
		node3.setNextNode(node4);
		node4.setNextNode(node1);
		
		LinkedList<Integer> loopedLinkedList = new LinkedList<Integer>();
		loopedLinkedList.setHead(node1);
		
		System.out.println(loopedLinkedList.hasLoop());
	

		System.out.println("----------- Printing List -----------");
		Node<String> headNode = new Node<>("Umair");
		LinkedList<String> studentNamesList = new LinkedList<String>(headNode);

		System.out.println("Length of the list: " + studentNamesList.getLength());
		System.out.println("Head node: " + studentNamesList.getHead());
		System.out.println("Tail node: " + studentNamesList.getTail());

		studentNamesList.printList();

		System.out.println("----------- Appending List -----------");
		LinkedList<String> emptyList = new LinkedList<>();

		// Create a node to append;
		emptyList.append("First student");
		emptyList.append("Second student");
		emptyList.append("Third student");

		emptyList.printList();

		System.out.println("----------- Popping List -----------");
		// Pop the first element
		System.out.println(emptyList.pop());
		System.out.println(emptyList.pop());

		System.out.println("----------- Pop List -----------");
		LinkedList<Integer> marksList = new LinkedList<>();

		// When the lsit if empty
		System.out.println(marksList.pop());

		// Add only one node
		marksList.append(1);
		System.out.println(marksList.pop());

		System.out.println("----------- Prepending List -----------");

		// Tests for the prepend
		LinkedList<String> billList = new LinkedList<String>();

		billList.prepend("First bill");
		billList.prepend("Second List bill");
		billList.prepend("Third List bill");
		billList.prepend("Fourth List bill");

		billList.printList();

		System.out.println("----------- Pop First -----------");

		LinkedList<Float> currencyLinkedList = new LinkedList<>();
		currencyLinkedList.append(1F);
		currencyLinkedList.append(2F);
		currencyLinkedList.printList();
		currencyLinkedList.popFirst();

		currencyLinkedList.printList();

		System.out.println("----------- Get and set value Method -----------");

		LinkedList<Double> savingsList = new LinkedList<>();
		try {
			savingsList.get(2);
		} catch (IndexOutOfBoundsException exception) {
			System.out.println(exception.getMessage());
		}

		savingsList.append(1.3);
		savingsList.append(Double.valueOf(3));
		savingsList.append(Double.valueOf(8));

		savingsList.printList();

		System.out.println(savingsList.get(0));
		System.out.println(savingsList.get(1));
		System.out.println(savingsList.get(2));

		// Update the value of the list
		System.out.println(savingsList.setValue(0, 0.1));
		System.out.println(savingsList.setValue(1, 33.3));
		System.out.println("Value of the node at the index is " + savingsList.get(0));
		System.out.println("Value of the node at the index is " + savingsList.get(1));
		System.out.println("\n\n ---------------------------- \n\n");
	
		savingsList.printList();

		System.out.println("\n\n----------- Insert Method -----------");
		System.out.println("Result of insertion: " + savingsList.insert(1, 0.5));		
		savingsList.printList();
		
		System.out.println("Result of insertion: " + savingsList.insert(6, 0.5));
		savingsList.printList();
		
		
		System.out.println("\n\n----------- Remove Method -----------");
		savingsList.remove(1);
		
		savingsList.printList();
		
		savingsList.remove(0);
		savingsList.printList();
		
		
		savingsList.remove(savingsList.getLength() - 1);
		
		savingsList.printList();
		
		System.out.println("\n\n----------- Reverse List Method -----------");
		
		
		LinkedList<String> citiesList = new LinkedList<>();
		
		citiesList.append("Karachi");
		citiesList.append("Munich");
		
		System.out.println("** BEFORE **");
		citiesList.printList();
		System.out.println("** AFTER **");
		
		citiesList.reverseList();
		

		citiesList.printList();
		
		citiesList.append("Tokyo");
		citiesList.printList();

		System.out.println("\n\n----------- Reverse List Method -----------");
		
		citiesList.append("New York");
		
		System.out.println("\n\n----------- Find middle node -----------");
		citiesList.printList();
		System.out.println(citiesList.getMiddleNode());
		
		System.out.println("\n\n----------- Has Loop -----------");
		
		System.out.println(citiesList.hasLoop());
		System.out.println(savingsList.hasLoop());
		System.out.println(currencyLinkedList.hasLoop());
		System.out.println(billList.hasLoop());
		
		System.out.println("\n\n----------- Find the Kth Node -----------");
		

		Node<Integer> numbersNode1 = new Node<Integer>(1);
		Node<Integer> numbersNode2 = new Node<Integer>(2);
		Node<Integer> numbersNode3 = new Node<Integer>(3);
		Node<Integer> numbersNode4 = new Node<Integer>(4);
		Node<Integer> numbersNode5 = new Node<Integer>(5);
		Node<Integer> numbersNode6 = new Node<Integer>(6);
		Node<Integer> numbersNode7 = new Node<Integer>(7);
		
		numbersNode1.setNextNode(numbersNode2);
		numbersNode2.setNextNode(numbersNode3);
		numbersNode3.setNextNode(numbersNode4);
		numbersNode4.setNextNode(numbersNode5);
		numbersNode5.setNextNode(numbersNode6);
		numbersNode6.setNextNode(numbersNode7);
		
		LinkedList<Integer> numberList = new LinkedList<Integer>(numbersNode1);
		
		numberList.printList();
		System.out.println(numberList.getKthNode(19));

		System.out.println("\n\n----------- Find and remove the duplicates -----------");
		
		Node<Integer> dup1 = new Node<>(1);
		
		LinkedList<Integer> duplicateList = new  LinkedList<Integer>(dup1);
		
		duplicateList.removeDuplicates();
		
		
		duplicateList.append(2);

		duplicateList.removeDuplicates();
		
		
		Node<Integer> anotherDup1 = new Node<Integer>(1);
		Node<Integer> anotherDup2 = new Node<Integer>(2);
		Node<Integer> anotherDup3 = new Node<Integer>(2);
		Node<Integer> anotherDup4 = new Node<Integer>(4);
		Node<Integer> anotherDup5 = new Node<Integer>(5);
		Node<Integer> anotherDup6 = new Node<Integer>(5);
		Node<Integer> anotherDup7 = new Node<Integer>(7);
		
		
		anotherDup1.setNextNode(anotherDup2);
		anotherDup2.setNextNode(anotherDup3);
		anotherDup3.setNextNode(anotherDup4);
		anotherDup4.setNextNode(anotherDup5);
		anotherDup5.setNextNode(anotherDup6);
		anotherDup6.setNextNode(anotherDup7);
		
		LinkedList<Integer> anotherDuplicateList = new LinkedList<>(anotherDup1);
		
		anotherDuplicateList.removeDuplicates();
		
		anotherDuplicateList.printList();
		
		
		
		
		
	}

}
