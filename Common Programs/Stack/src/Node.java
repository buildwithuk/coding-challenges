public class Node<T> {
    
    public T value;
    public Node<T> nextNode;
    public T getValue() {
        return value;
    }

    public Node(T value) {
        this.value = value;
    }


    public void setValue(T value) {
        this.value = value;
    }
    public Node<T> getNextNode() {
        return nextNode;
    }
    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }
    
}
