import java.util.*;
import java.io.*;

public class Midterm2 {

   public static void main(String args[]) throws FileNotFoundException{
      
      LinkedList<String> list1 = new LinkedList<>();
      Scanner file = new Scanner(new File("MidtermData.txt"));
      
      while(file.hasNext()) {
         String word = file.next();
         list1.add(word);
      }
      
      Collections.sort(list1);
      System.out.println(list1);
      
      LinkedList<String> list2 = new LinkedList<>();
      Stack<String> x = new Stack<String>();
      Iterator<String> itr = list1.iterator();
      
      while(itr.hasNext()){
         x.push(itr.next());
      }
      
      while(!x.isEmpty()){
         list2.add(x.pop());
      }  
      
      System.out.print(list2);
   }
}