public class LinkedList {

    private Node start;

    public Node getStart() {
        return start;
    }

    public void setStart(Node start) {
        this.start = start;
    }

    public LinkedList(Node start) {
        this.start = start;

    }

    public LinkedList() {

    }

    public void traverseLinkedList() {

        if (start == null) {
            System.out.println("The linked list is empty");

        } else {

            while (start != null) {
                System.out.println("Value: " + start.getValue());
                start = start.getNextNode();
            }

        }

    }

    public void deleteNode(int val) {

        if (start == null) {
            return; // Because the liknked List has not be initialized
        }

        if (start.getValue() == val) {

            start = start.getNextNode();
            return;
        }

        Node temp = start;

        // Now we iterate over the complete Linked List
        while (temp.getNextNode() != null && temp.getNextNode().getValue() != val) {

            temp = temp.getNextNode();

        }

        // This means that we have reached the end of the Linked List
        if (temp.getNextNode() != null) {
            temp.setNextNode(temp.getNextNode().getNextNode());
        }
    }

    public void insertInLinkedList(Node n) {

        // Meaning that the linked list has not be initialized
        if (start == null) {
            start = n;
            return;
        }

        Node temp = n;

        while (temp.getNextNode() != null) {
            temp = temp.getNextNode();
        }

        temp.setNextNode(n);

    }

}
