import java.util.Set;

public class PageNode {
    private int pageNumber;
    private String text;
    private boolean isEnding;
    private Set<PageNode> children;

    public PageNode(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public PageNode(int pageNumber, String text, boolean isEnding, Set<PageNode> children) {
        this.pageNumber = pageNumber;
        this.text = text;
        this.isEnding = isEnding;
        this.children = children;
    }

    public int getPageNumber() { return pageNumber; }
    public Set<PageNode> getChildren() { return children; }
    public boolean getIsEnding() { return isEnding; }
    public String getText() { return text; }

    public void setChildren(Set<PageNode> children) {
        this.children = children;
    }
}
