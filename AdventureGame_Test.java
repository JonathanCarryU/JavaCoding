import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner fileScan = new Scanner(new File("../resource/book1.csv"));

        while (fileScan.hasNextLine()) {
            String line = fileScan.nextLine();
            String[] data = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");

            for (String element : data) {
                System.out.print(element);
                System.out.print("可爱的分割线");
            }
            System.out.println();
        }
    }
}
