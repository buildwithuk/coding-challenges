public class Node {

    public int node;
    public Node leftNode;
    public int getNode() {
        return node;
    }

    public void setNode(int node) {
        this.node = node;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }

    public Node rightNode;

    public Node(int node) {
        this.node = node;
    }

    @Override
    public String toString() {
        return "Node [node=" + node + ", leftNode=" + leftNode + ", rightNode=" + rightNode + "]";
    }

    

    
}
