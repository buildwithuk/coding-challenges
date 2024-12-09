public class Node<T> {
    
    private T nodeValue; 
    public T getNodeValue() {
        return nodeValue;
    }

    public void setNodeValue(T nodeValue) {
        this.nodeValue = nodeValue;
    }

    private Node<T> nextNode;

    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

    public Node() {

    }

    public Node(T nodeValue) {
        this.nodeValue = nodeValue;
    }


    public Node(T nodeValue, Node<T> nextNode) {
        this.nodeValue = nodeValue;
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "Node [nodeValue=" + nodeValue + ", nextNode=" + nextNode + "]";
    }

}
