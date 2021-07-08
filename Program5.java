import java.io.*;
import java.util.*;

public class Program5{

   public static void main(String args[]) throws FileNotFoundException{
   
      Scanner nums1 = new Scanner(new File("BS_Nums1.txt"));
      Scanner nums2 = new Scanner(new File("BS_Nums2.txt"));
      
      int arr1[] = new int[100];
      int arr2[] = new int[10];
      
      for(int i = 0; i < 100; i++) {
         arr1[i] = nums1.nextInt();
      }
      
      for(int i = 0; i < 10; i++) {
         arr2[i] = nums2.nextInt();
      }
      
      bubbleSort(arr1, 100);
      
      for(int i = 0; i < 10; i++){
         for(int j = 0; j < 100; j++){
            if(arr2[i] == arr1[j]){
               System.out.println(arr2[i] + " is found.");
            }
         }
      }
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

}