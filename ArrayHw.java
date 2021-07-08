// Jonathan Lee
// CS 143

import java.util.*;
import java.util.Random;

public class ArrayHw {
   
   public static void main(String args[]) {
      Random rand = new Random();
      int min = Integer.MAX_VALUE;
      int max = Integer.MIN_VALUE;
      int total = 0;
      
      int[] arr = new int[10];
      for(int i = 0; i < arr.length; i++) {
         int random = rand.nextInt(100);
         arr[i] = random;
      }
      System.out.println(Arrays.toString(arr));
      
      for(int i = 0; i < arr.length; i++) {
         min = Math.min(min, arr[i]);
      }
      System.out.println("The min value of the array is " + min);
      
      for(int i = 0; i < arr.length; i++) {
         max = Math.max(max, arr[i]);
      }
      System.out.println("The max value of the array is " + max);
      
      for(int i = 0; i < arr.length; i++) {
         total += arr[i];
      }
      double average = (double)total / arr.length;
      System.out.print("The average is " + average);
   }
}