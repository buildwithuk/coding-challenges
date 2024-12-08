import java.util.ArrayList;
import java.util.List;

public class TreeNodes {

    private int nodeValue;

    
    public int getNodeValue() {
        return nodeValue;
    }

    public void setNodeValue(int nodeValue) {
        this.nodeValue = nodeValue;
    }

    public List<TreeNodes> getNodesOfTheTree() {
        return nodesOfTheTree;
    }

    public void setNodesOfTheTree(List<TreeNodes> nodesOfTheTree) {
        this.nodesOfTheTree = nodesOfTheTree;
    }

    private List<TreeNodes> nodesOfTheTree;

    public TreeNodes(int nodeValue) {

        nodesOfTheTree = new ArrayList<>();
        this.nodeValue = nodeValue;

    }

    @Override
    public String toString() {
        return "TreeNodes [nodeValue=" + nodeValue + ", nodesOfTheTree=" + nodesOfTheTree + "]";
    }

    
}
