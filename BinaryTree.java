import java.util.*;
import java.io.*;

class tree {

   Node left, right;
   int data;
   
   void node(int data){
      this.data = data;  
   }
   
   
   
   public void insert(int value){
      if(value < data) {
         if(left == null) {
            left = new Node(value);
         }
         else {
            left.insert(value);
         }
      }
      else {
         right.insert(value);
      }
   }
   
   public String toString() {
      return "" + this.data;
   }   
}

public class BinaryTree {  

   
   public static void main(String args[]) throws FileNotFoundException{
    
      tree map = new tree();
      Scanner file = new Scanner(new File("BS_Nums3.txt"));
      while(file.hasNextInt()){
         int num = file.nextInt();
         map.insert(num);
      }

   }
     
}