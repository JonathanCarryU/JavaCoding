import java.util.*;
import java.io.*;

public class Program9{
   
   public static void main(String[] args) throws FileNotFoundException {    
       
       Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();       
       Scanner in = new Scanner(new FileReader("BS_Nums4.txt"));
       
       int i = 0;
       while(in.hasNextInt()) {
         ht.put(i, in.nextInt());
         i++;
       }
       
       for(int j = 0; j < i; j++) {
         System.out.print(ht.get(j) + " ");
       }
       System.out.println();
       
       System.out.print(ht);
   }
   
}