/* John Noga COMP182 Lab Exam 2 
 * Fall 2014
 */

import java.util.*;

public class PracticeLabExam2 {
   Node head, tail;


/* FROM HERE - FROM HERE - FROM HERE - FROM HERE - FROM HERE */

   public int sumOfFirstAndLast() {
       int result;
       if (head == null){
           result =-99999;
       }
       else{
               result = head.getValue() + tail.getValue();
       }
       return result;
   }

   public int findLargest() {
       int large = -99999;
       for(Node nd = head; nd!=null; nd = nd.getNext()){
           if(nd.getValue() > large){
               large = nd.getValue();
           }
       }
       return large;
   }

   public void removeFirstAndLast() {
       if ( head == null || head == tail || head.getNext() == tail){
           head = tail= null;
       } 
       else{
           head= head.getNext();
           head.setPrev(null);
           tail = tail.getPrev();
           tail.setNext(null);
       }
   }

   /* You can use the yourMainMethod method to do any testing you'd
      like to do (none is also allowed). It will be automatically
      called when you run the class without any command line
      parameters.
    */
   public static void yourMainMethod() {
      /*
      DoublyLinkedListOfInts yourList = new DoublyLinkedListOfInts();
      yourList.insert(3);
      yourList.insert(12);
      yourList.insert(-2);
      yourList.insert(7);
      yourList.insert(-3);
      yourList.insert(2);
      yourList.insert(4);
      System.out.println(yourList);
      System.out.println(yourList.sumOfFirstAndLast());
      System.out.println(yourList.findLargest());
      yourList.removeFirstAndLast();
      System.out.println(yourList);
      */
   }


/* TO HERE - TO HERE - TO HERE - TO HERE - TO HERE - TO HERE */


   public DoublyLinkedListOfInts() {
      head = tail = null;
   }

   public void insert(int n) {
      Node nd = new Node(n);
      if (head == null) 
         head = tail = nd; 
      else {
         nd.setNext(head); 
         head.setPrev(nd);
         head = nd;
      }
   }

   public String toString() {
      String str = "[";
      Node n = head;
      while (n != null) {
         str += n.getValue() + " ";
         n = n.getNext();
      }
      str += "][";
      n = tail;
      while (n != null) {
         str += n.getValue() + " ";
         n = n.getPrev();
      }
      str += "]";
      return str;
   }

   public static void main(String[] args) {
      DoublyLinkedListOfInts theList;
      int n, number,trials = 10;

      if (args.length==0)
         yourMainMethod();
      else {
         n = Integer.parseInt(args[0]);
         Random r = new Random(n);
         for (int i=0; i<trials; i++) {
            theList = new DoublyLinkedListOfInts();
            number = r.nextInt(10);
            for (int j=0; j<number; j++) 
               theList.insert(r.nextInt(i/2+5));
            System.out.println(theList);
            System.out.println(theList.sumOfFirstAndLast());
            System.out.println(theList.findLargest());
            theList.removeFirstAndLast();
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
      next = prev = null;
   }
   public int getValue() {
      return value;
   }
   public Node getNext() {
      return next;
   }
   public Node getPrev() {
      return prev;
   }
   public void setNext(Node nd) {
      next = nd;
   }
   public void setPrev(Node nd) {
      prev = nd;
   }
   public void setValue(int v) {
      value = v;
   }
}
