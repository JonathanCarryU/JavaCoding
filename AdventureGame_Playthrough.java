import java.util.*;

public class Playthrough {
    private LinkedList<PageNode> choices = new LinkedList<>();
    private PageTree book;

    public Playthrough(PageTree book) {
        this.book = book;
    }

    public void playGame() { 
        playGame("1");
    }

    public void playGame(String option) { 
        truncateChoices(Integer.parseInt(option));
        Scanner console = new Scanner(System.in);
        PageNode current = book.getNode(Integer.parseInt(option));

        while (!current.getIsEnding()) {
            choices.add(current);
            List<Integer> options = new ArrayList<>();
            for (PageNode child : current.getChildren()) {
                options.add(child.getPageNumber());
            }
            Collections.sort(options);

            System.out.println(current.getText());

            String ans = "bad data";
            do {
                do {
                    System.out.print("Choose an option: ");
                    for (int i = 0; i < options.size(); i++) {
                        System.out.print(options.get(i));
                         if (i != options.size() - 1) {
                            System.out.print(", ");
                        }
                    }
                    System.out.println();
                    System.out.print("> ");
                    ans = console.next();
                } while (!isNum(ans));
            } while (!options.contains(Integer.parseInt(ans)));

            int userChoice = Integer.parseInt(ans);
            current = book.getNode(userChoice);
        }
        System.out.println(current.getText());
        choices.add(current);
    }

    public void truncateChoices(int pageNumber) { 
        if (choices.size() > 0) {
            int index = choices.size() - 1;
            for (int i = 0; i < choices.size(); i++) {
                if (choices.get(i).getPageNumber() == pageNumber) {
                    index = i;
                }
            }

            for (int i = index; i < choices.size(); i++) {
                choices.remove(i);
                i--;
            }
        }
    }

    public LinkedList<PageNode> getChoices() { return choices; }

    private static boolean isNum(String str) {
        for(int i = 0; i < str.length(); i++){
            int chr = str.charAt(i);
            if(chr < 48 || chr > 57)
                return false;
        }
        return true;
    }

}
