/*
 * MichaelGerrard
 */
public class LinkedList {
    private Node head;
    private int size;
    public LinkedList(){
        head = null;
        size = 0;
    }
    
        public void insertAtFront(Dog d){
            Node nd = new Node(d);
            nd.setNext(head);
            head = nd;
            
            size++;
        }
        
        public void insertAtEnd(Dog d){
            Node nd = new Node(d);
            Node n = head;
            if(head!=null){
                while(n.getNext()!=null){
                        n= n.getNext();
                }
            n.setNext(nd);
            }
            else{
                head = nd;
            }
             size++;
        }
        
        public Dog find(int tag){
            Dog result = null;
            for(Node nd=head; nd!=null; nd=nd.getNext()){
                if(nd.getDog().getTagNumber()==tag){
                    result = nd.getDog();
                }
            }
            return result;
        }
        
        public boolean delete(int tag){
            boolean exists = false;
            Node prev = null;
            for (Node nd = head; nd != null; prev = nd, nd = nd.getNext()){
                if(nd.getDog().getTagNumber()==tag){
                    if(prev==null){
                        head = head.getNext();
                    }
                    else
                        prev.setNext(nd.getNext());
                }
            }
            size --;
            return exists;

        }
        
        public void showAll(){
        System.out.println("Linked List");
            for(Node nd=head; nd!=null; nd=nd.getNext()){
                System.out.println(nd.getDog().toString());
            }
   
        }
        
        public void showBeginAndEnd(){
        System.out.println("Linked List");
            int show = 2;
            Node nd = head;
            if(size > show * 2){  
                for(int i = 0; i <  show; i++){
                    System.out.println(nd.getDog().toString());
                    nd.getNext();
                }
                while(nd.getNext().getNext()!=null){
                            nd= nd.getNext();
                }
                for(int i = 0; i <  show; i++){
                    System.out.println(nd.getDog().toString());
                    nd.getNext();
                }
            }
            else{
                for(int k = 0; k < size; k++ ){
                    System.out.println(nd.getDog().toString());
                    nd.getNext();
                }
            }
        }
    }
    
    

