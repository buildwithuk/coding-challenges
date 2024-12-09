public class App {

    public static int traverseTheBTS(Node root, int n) {

        int index = -1;

        if (root == null)
            return index;

        while (root != null) {

            if (root.getNodeValue() == n) {
                index = 1;
                break;
            }

            if (root.getNodeValue() < n) {
                root = root.getLeftNode();
            } else {
                root = root.getRightNode();
            }

        }

        return index;

    }

    public static void main(String[] args)  {

        /**
         * 10
         * /\
         * 3 12
         * /\ \
         * 1 2 21
         * 
         */

        Node root = new Node(10);

        Node n21 = new Node(3);
        Node n22 = new Node(12);
        Node n31 = new Node(1);
        Node n32 = new Node(2);
        Node n33 = new Node(21);

        root.setLeftNode(n21);
        root.setRightNode(n22);

        n21.setLeftNode(n31);
        n21.setRightNode(n32);

        n22.setLeftNode(n33);

        var index = traverseTheBTS(root, 2);

        System.out.println(index);
    }
}
