
import implement.linkedlist.LinkedList;
import implement.linkedlist.Node;

public class Start {

	public static void main(String[] args) {

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
		
		citiesList.printList();
		System.out.println(citiesList.getMiddleNode());
		
	}

}
