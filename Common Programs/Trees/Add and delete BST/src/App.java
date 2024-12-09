public class App {

    public static Node insertNode(Node root, int n) {

        if (root == null) {
            root = new Node(n);

        } else if (n < root.node) {
            root.leftNode = insertNode(root.getLeftNode(), n);

        } else if (n > root.node) {
            root.rightNode = insertNode(root.rightNode, n);
        }

        return root;
    }
    public static void main(String[] args) {
        
        Node rootNode = new Node(5);
        insertNode(rootNode, 5);


        insertNode(rootNode, 3);
        insertNode(rootNode, 5);
        insertNode(rootNode, 2);
        insertNode(rootNode, 10);
    }
    
}
