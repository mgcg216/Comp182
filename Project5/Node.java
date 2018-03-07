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