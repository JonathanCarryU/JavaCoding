import java.io.*;
import java.util.*;

public class Recrusion {
   public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a word > ");
      String phrase = input.nextLine();
      System.out.println("this is the word >> " + phrase);
      Scanner in = new Scanner(phrase);
      while(in.hasNextLine()) {
         String word = in.next();
         int len = word.length();
         System.out.print(" ");
         recrusion(len, word);
      }
   }
   
   public static void recrusion(int len, String word) {
      if(len <= 0) {
         System.out.print("");
      }
      else {
         System.out.print(word.charAt(len - 1));
         recrusion(len - 1, word);
      }
   }
}