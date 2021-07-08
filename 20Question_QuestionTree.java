public class QuestionTree {
    private QuestionNode root;

    public QuestionTree() {
        root = new QuestionNode("OVERALL ROOT", false);
    }

    public void add(QuestionNode node) {
        if (root.yes == null) {
            root.yes = node;
            return;
        }
        
        addHelper(node, root.yes);
    }

    private void addHelper(QuestionNode node, QuestionNode current) {
        if (current.yes == null) {
            current.yes = node;
        }

        if (!current.yes.isAnwser) {
            addHelper(node, current.yes);
        } 

        if (current.no == null) {
            current.no = node;
        }

        if (!current.no.isAnwser) {
            addHelper(node, current.no);
        }
    }

    public QuestionNode getRoot() { return root; }
}
