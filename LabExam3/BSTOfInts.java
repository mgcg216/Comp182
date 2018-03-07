/* COMP182 Lab Exam
 * Michael Guerrero
 */
import java.util.*;

public class BSTOfInts {
   private Node root;


/* FROM HERE - FROM HERE - FROM HERE - FROM HERE - FROM HERE */

   public boolean rootHasTwoChildren() {
       return rootHasTwoChildren(root);
   }
   
   private boolean rootHasTwoChildren(Node nd){
       boolean answer = true;
       if(nd != null){
           if(nd.getLeft()==null || nd.getRight()==null){
               answer = false;
           }
       }
       return answer;
   }

   public int howLargeRange() {
       int small = 0;
       int big = 0;
       int range = big - small;
       Node nd = root;
       for(;nd.getLeft() !=null ;nd.getLeft()){
           
       }
       small = nd.getValue();
      Node nc = root;
       for( ; nc.getRight() != null; nc.getRight()){
       }
       big = nc.getValue();
       return range;
   }
   

   public int sumOfAllValues() {
       return sumOfAllValues(root);
   }
   
   private int sumOfAllValues(Node nd){
       int sum = 0;
       if(nd != null){
           sumOfAllValues(nd.getLeft());
           sum = sum + nd.getValue();
           sumOfAllValues(nd.getRight());
       }
       return sum;        
   }
   
   /* You can use the yourMainMethod method to do any testing you'd
      like to do (none is also allowed). It will be automatically
      called when you run the class without any command line
      parameters.
    */
   private static void yourMainMethod() {
      /*
      BSTOfInts tree = new BSTOfInts();
      tree.insert(50); tree.insert(70); tree.insert(60); tree.insert(80);
      System.out.println(tree.rootHasTwoChildren());
      System.out.println(tree.howLargeRange());
      System.out.println(tree.sumOfAllValues());
      */
   }


/* TO HERE - TO HERE - TO HERE - TO HERE - TO HERE - TO HERE */


   public BSTOfInts() {
      root = null;
   }
   public void insert(int i) {
      Node nn = new Node(i), nd = root;
      boolean done = false;
      if (root == null)
         root = nn;
      else
         while(!done) {
            if (i < nd.getValue() && nd.getLeft() == null) {
               nd.setLeft(nn);
               done = true;
            }
            else if (i < nd.getValue()) 
               nd = nd.getLeft(); 
            else if (nd.getRight() == null) {
               nd.setRight(nn);
               done = true;
            }
            else
               nd = nd.getRight();
         }
   }
   public void printTree(Node nd) {
      if (nd != null) {
         printTree(nd.getLeft());
         printTree(nd.getRight());
         System.out.print(nd.getValue() + " ");
      }
   }

   public static void main(String[] args) {
      if (args.length==0)
         yourMainMethod();
      else 
         myMainMethod(args);
   }

   private static void myMainMethod(String[] args) {
      BSTOfInts theTree = new BSTOfInts();
      int n = Integer.parseInt(args[0]),val;
      Random r = new Random(n);
      for (int i=0; i<2*n; i++) {
         val = r.nextInt(95)+5;
         System.out.print(val + " ");
         theTree.insert(val);
      }
      System.out.println();
      theTree.printTree(theTree.root);
      System.out.println();
      System.out.println(theTree.rootHasTwoChildren());
      System.out.println(theTree.howLargeRange());
      System.out.println(theTree.sumOfAllValues());

   }
}

class Node {
   private int value;
   private Node left, right;

   public Node(int i) {
      value = i;
      left = right = null;
   }
   public int getValue() {
      return value;
   }
   public Node getLeft() {
      return left;
   }
   public Node getRight() {
      return right;
   }
   public void setValue(int v) {
      value = v;
   }
   public void setLeft(Node nd) {
      left = nd;
   }
   public void setRight(Node nd) {
      right = nd;
   }
}
