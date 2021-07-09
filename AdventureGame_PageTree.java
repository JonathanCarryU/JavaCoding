import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class PageTree {
    private PageNode root;

    public PageTree(PageNode root) {
        this.root = root;
    }

    public PageNode getNode(int pageNumber) {
        Stack<PageNode> s = new Stack<>();
        PageNode record = null;
        s.push(root);

        while (!s.isEmpty()) {
            PageNode current = s.pop();
            if (current.getPageNumber() == pageNumber) {
                record = current;
                s.clear();
            } else {
                for (PageNode node : current.getChildren()) {
                    s.push(node);
                }
            }
        }
        return record;
    } 

    public List<PageNode> cheat(int desiredEnding) {
        LinkedList<PageNode> way = new LinkedList<>();
        way.add(root);
        return cheatHelper(root, way, desiredEnding);
    }

    public List<PageNode> cheatHelper(PageNode root, List<PageNode> path, int ending){
        if(root != null) {
            if(root.getPageNumber() == ending){
                return  path;
            }
            else {
                List<PageNode> newList = new ArrayList<>();
                for (PageNode element : path) {
                    newList.add(element);
                }
                for (PageNode child : root.getChildren()
                     ) {
                    newList.add(child);
                    List<PageNode> result = cheatHelper(child, newList, ending);
                    if(result != null) {
                        return result;
                    }
                    else{
                        newList.remove(child);
                    }


                }
            }
        }
        return null;
    }

    public PageNode getRoot() { return root; }
}
