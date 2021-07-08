import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class QuestionGame {
    private QuestionTree tree;

    public QuestionGame() {
        tree = new QuestionTree();
    }

    public void phareFile(String filePath) throws FileNotFoundException {
        Scanner fileScan = new Scanner(new File(filePath));

        while (fileScan.hasNextLine()) {
            String line = fileScan.nextLine();
            String[] datas = line.split("\t");
            QuestionNode node = new QuestionNode(datas[1], datas[0].charAt(0) == 'A');
            tree.add(node);
        }
    }

    public void play() {
        System.out.println("Please think of something for me to guess.");

        Scanner console = new Scanner(System.in);

        QuestionNode current = tree.getRoot().yes;
        while (!current.isAnwser) {
            System.out.print(current);
            System.out.println(" y/n");
            System.out.print("> ");
            
            char ansChar = '?';
            do {
                String ans = console.nextLine();
                ansChar = ans.charAt(0);
            } while (ansChar != 'y' && ansChar != 'n');
            
            if (ansChar == 'y') {
                current = current.yes;
            } else {
                current = current.no;
            }
        }

        System.out.println(current);
    }

    public static void main(String[] args) throws FileNotFoundException {
        QuestionGame game = new QuestionGame();

        game.phareFile("D:/Personal/Shoreline/CS 143-E/CS 143/CS 143/20Questions/resource/questions1.txt");
        game.play();
    }
}