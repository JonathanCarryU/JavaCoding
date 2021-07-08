import java.io.*;
import java.util.*;

public class CountWord {
  public static void main(String[] args) throws FileNotFoundException {
    HashMap map = new HashMap();  

    Scanner in = new Scanner(new File("MobyDick.txt"));
    while (in.hasNext()) {
      String word = in.next();
      
      if(map.containsKey(word)) {
        Integer count = (Integer)map.get(word);
        map.put(word, (count + 1));
      } 
      else {
        map.put(word, new Integer(1));
      }
    }

    ArrayList arraylist = new ArrayList(map.keySet());
    Collections.sort(arraylist);
    
    for (int i = 0; i < arraylist.size(); i++) {
      String key = (String)arraylist.get(i);
      Integer count = (Integer)map.get(key);
      System.out.println(key + " --> " + count);
    }

  }
}