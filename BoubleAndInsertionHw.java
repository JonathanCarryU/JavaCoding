// Jonathan Lee
// CS 143

import java.util.*;

public class BoubleAndInsertionHw {
   public static void main(String args[]) {
      Random rand = new Random();
      int arr1[] = new int[100];
      int arr2[] = new int[100];
      int arr3[] = new int[100000];
      int arr4[] = new int[100000];
      
      for(int i = 0; i < arr1.length; i++) {
         int random = rand.nextInt(arr1.length + 1);
         arr1[i] = random;
      }
      for(int i = 0; i < arr2.length; i++) {
         int random = rand.nextInt(arr2.length + 1);
         arr2[i] = random;
      }
      for(int i = 0; i < arr3.length; i++) {
         int random = rand.nextInt(arr3.length + 1);
         arr3[i] = random;
      }
      for(int i = 0; i < arr4.length; i++) {
         int random = rand.nextInt(arr4.length + 1);
         arr4[i] = random;
      }
      
      System.out.println("Start time: " + System.currentTimeMillis());
      bubbleSort(arr1, arr1.length);
      printArray(arr1, arr1.length);
      System.out.println("Finish time: " + System.currentTimeMillis());
      System.out.println();
      System.out.println("Start time: " + System.currentTimeMillis());
      insertionSort(arr2, arr2.length);
      printArray(arr2, arr2.length);
      System.out.println("Finish time: " + System.currentTimeMillis());
      System.out.println();
      System.out.println("Start time: " + System.currentTimeMillis());
      bubbleSort(arr3, arr3.length);
      printArray(arr3, arr3.length);
      System.out.println("Finish time: " + System.currentTimeMillis());
      System.out.println();
      System.out.println("Start time: " + System.currentTimeMillis());
      insertionSort(arr4, arr4.length); 
      printArray(arr4, arr4.length);
      System.out.println("Finish time: " + System.currentTimeMillis());
      
      
   }
   
   public static void bubbleSort(int arr[], int n) {
      int i, j, temp; 
      boolean swapped; 
      for (i = 0; i < n - 1; i++){ 
         swapped = false; 
         for (j = 0; j < n - i - 1; j++){ 
            if (arr[j] > arr[j + 1]){ 
               temp = arr[j]; 
               arr[j] = arr[j + 1]; 
               arr[j + 1] = temp; 
               swapped = true; 
            }
         }
         if (swapped == false) 
             break; 
      }
   }
   
   public static void insertionSort(int arr[], int n){
      for (int i = 1; i < n; ++i) { 
         int key = arr[i]; 
         int j = i - 1; 

         while (j >= 0 && arr[j] > key) { 
             arr[j + 1] = arr[j]; 
             j = j - 1; 
         } 
         arr[j + 1] = key; 
      }
   }
   
   public static void printArray(int arr[], int size){ 
      for (int i = 0; i < size; i++){
         System.out.print(arr[i] + " ");
      } 
      System.out.println(); 

   }
}