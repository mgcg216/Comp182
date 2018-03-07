/* John Noga COMP182 Lab Exam 2 
 * Michael Gerrard Guerrero
 */

import java.util.*;

public class LinkedListOfInts {
   Node head;


/* FROM HERE - FROM HERE - FROM HERE - FROM HERE - FROM HERE */

   public void squareAllValues() {
       for(Node nd = head; nd!=null; nd = nd.getNext()){
           nd.setValue(nd.getValue()*nd.getValue());
       }
   }

   public boolean allEven() {
       boolean answer = false;
       for(Node nd = head; nd!=null; nd = nd.getNext()){
           if(nd.getValue()%2==0){
               answer = true;
           }
       }
       return answer;
   }

   public void reverseList() {
       int size = 0;
       for(Node nd = head; nd!=null; nd = nd.getNext()){
           size++;
       }
       int[] arr = new int[size];
       int i = 0;
       int[] arr2 = new int[size];
       for(Node nd = head; nd!=null; nd = nd.getNext()){
           arr[i] = nd.getValue();
           i++;
       }
       int k =0;
       for(int j= size; j > 0;j--){
           arr2[k] = arr[j];
           
       }
       head.setValue(arr2[0]); 
       for(int l = 0; l< size; l++){
           myList.delete(arr2[l]);
       }
       for(int m = 0; m< size; m++){
           myList.insert(arr2[m]);
       }
   }

   /* You can use the yourMainMethod method to do any testing you'd
      like to do (none is also allowed). It will be automatically
      called when you run the class without any command line
      parameters.
    */
   public static void yourMainMethod() {
      /*
      LinkedListOfInts myList = new LinkedListOfInts();
      myList.insert(3); myList.insert(12); myList.insert(-2);
      myList.insert(7); myList.insert(-3); myList.insert(2);
      myList.insert(4);
      System.out.println(myList);
      myList.squareAllValues();
      System.out.println(myList);
      System.out.println(myList.allEven());
      myList.reverseList();
      System.out.println(myList);
      */
   }


/* TO HERE - TO HERE - TO HERE - TO HERE - TO HERE - TO HERE */


   public LinkedListOfInts() {
      head = null;
   }

   public void insert(int n) {
      Node nd = new Node(n);
      nd.setNext(head); 
      head = nd;
   }

   public String toString() {
      String str = "[";
      Node n = head;
      while (n != null) {
         str += n.getValue() + " ";
         n = n.getNext();
      }
      str += "]";
      return str;
   }

   public static void main(String[] args) {
      LinkedListOfInts theList;
      int n, number,trials = 10;

      if (args.length==0)
         yourMainMethod();
      else {
         n = Integer.parseInt(args[0]);
         Random r = new Random(n);
         for (int i=0; i<trials; i++) {
            theList = new LinkedListOfInts();
            number = r.nextInt(10);
            for (int j=0; j<number; j++) 
               theList.insert(r.nextInt(i+5) - i*j);
            System.out.println(theList);
            System.out.println(theList.allEven());
            theList.squareAllValues();
            System.out.println(theList);
            theList.reverseList();
            System.out.println(theList+"\n");
         }
      }
   }
}

class Node {
   private int value;
   private Node next, prev;

   public Node(int v) {
      value = v; 
      next = null;
   }
   public int  getValue() {
      return value;
   }
   public Node getNext() {
      return next;
   }
   public void setNext(Node nd) {
      next = nd;
   }
   public void setValue(int v) {
      value = v;
   }
}
