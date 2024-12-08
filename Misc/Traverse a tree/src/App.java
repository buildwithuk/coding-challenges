import java.util.ArrayList;
import java.util.List;

public class App {

    public static List<TreeNodes> traverseTheNodesOfTheTreeBreadthWise(List<TreeNodes> nodes) {

        if (nodes == null || nodes.isEmpty())
            return new ArrayList<>();

        List<TreeNodes> furtherChildren = new ArrayList<>();
        
        for (TreeNodes treeNodes : nodes) {

            // Print the node of the tree
            System.out.println(treeNodes.getNodeValue());

            furtherChildren.addAll(treeNodes.getNodesOfTheTree());

        }

        return traverseTheNodesOfTheTreeBreadthWise(furtherChildren);
        
    }

    public static void traverseTheNodesOfTheTreeDepthWise(TreeNodes t) {

        // Print the node of the tree
        System.out.println(t.getNodeValue());

        // Check if the tree has further nodes;
        if (t.getNodesOfTheTree() == null || t.getNodesOfTheTree().isEmpty())
            return;

        // Iterate over the nodes of the tree
        // Print all the children of the 
        for (TreeNodes children : t.getNodesOfTheTree()) {

            traverseTheNodesOfTheTreeDepthWise(children);
        }

    }

    public static void main(String[] args) {

        /**
         * 
         *          1
         *         / \ \
         *        2   3 4
         *       / \
         *      5   6
         *           \
         *            7
         */

        TreeNodes t1 = new TreeNodes(1);
        TreeNodes t2 = new TreeNodes(2);
        TreeNodes t3 = new TreeNodes(3);
        TreeNodes t4 = new TreeNodes(4);
        TreeNodes t5 = new TreeNodes(5);
        TreeNodes t6 = new TreeNodes(6);
        TreeNodes t7 = new TreeNodes(7);

        t1.getNodesOfTheTree().add(t2);
        t1.getNodesOfTheTree().add(t3);
        t1.getNodesOfTheTree().add(t4);

        t6.getNodesOfTheTree().add(t7);
        t2.getNodesOfTheTree().add(t5);
        t4.getNodesOfTheTree().add(t6);

        System.out.println("Printing the nodes of the tree depth wise");
        traverseTheNodesOfTheTreeDepthWise(t1);

        System.out.println("Printing the nodes of the tree breadth wise");
        List<TreeNodes> treeNodes = new ArrayList<>();
        treeNodes.add(t1);
        traverseTheNodesOfTheTreeBreadthWise(treeNodes);

    }
}
