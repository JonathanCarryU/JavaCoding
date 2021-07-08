import java.io.*;
import java.util.*;

public class Program7 {
   
   public static void main(String args[]) throws FileNotFoundException{
   
      LinkedList<Integer> list1 = new LinkedList<>();
      LinkedList<Integer> list2 = new LinkedList<>();

      Scanner file1 = new Scanner(new File("BS_Nums1-1.txt"));
      Scanner file2 = new Scanner(new File("BS_Nums2-1.txt"));
      
      while(file1.hasNextInt()){
         int num = file1.nextInt();
         list1.add(num);         
      }
      
      while(file2.hasNextInt()){
         int num = file2.nextInt();
         list2.add(num);         
      }      
      
      System.out.println(list1);
      System.out.println(list2);
      
   }
   
}