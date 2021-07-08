public class QuestionNode {
    private String text;
    public boolean isAnwser;

    public QuestionNode yes;
    public QuestionNode no;

    public QuestionNode(String text, boolean isAnwser) {
        this.text = text;
        this.isAnwser = isAnwser;
    }

    public String toString() { return text; }
}
