import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ParseFile {
    public static PageTree parseFile(String filePath) throws FileNotFoundException {
        Scanner fileScan = new Scanner(new File(filePath));
        int page = 0;

        Map<Integer, PageNode> allNodes = new HashMap<>();
        while (fileScan.hasNextLine()) {
            String text = "";
            String line = fileScan.nextLine();
            String[] data = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");

            Set<PageNode> children = new HashSet<>();
            for (String element : data) {
                if (isNum(element)) {
                    children.add(new PageNode(Integer.parseInt(element)));
                }
                if (element.startsWith("\"")) {
                    text = element;
                }
            }

            page++;
            allNodes.put(page, new PageNode(page, text, data[0].equals("ENDING"), children));
        }

        for (PageNode node : allNodes.values()) {
            Set<PageNode> newChildren = new HashSet<>();
            for (PageNode child : node.getChildren()) {
                newChildren.add(allNodes.get(child.getPageNumber()));
            }
            node.setChildren(newChildren);
        }

        return new PageTree(allNodes.get(1));
    }

    private static boolean isNum(String str) {
        for (int i = 0; i < str.length(); i++){
            if (!Character.isDigit(str.charAt(i))){
                return false;
            }
        }
        return true;
    }
}
