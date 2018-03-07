/*
 * MichaelGerrard
 */
public class LLOfComputers {
    private Node head;
    public LLOfComputers(){
        head = null;
    }
    
        public void insert(Computer c){
            Node nd = new Node(c);
            nd.setNext(head);
            head = nd;
        }
        
        public Computer find(int cnn){
            Computer result = null;
            for(Node nd=head; nd!=null; nd=nd.getNext()){
                if(nd.getComputer().getConnectionNumber()==cnn){
                    result = nd.getComputer();
                }
            }
            return result;
        }
        
        public boolean delete(int cnn){
            boolean exists = false;
            Node prev = null;
            for (Node nd = head; nd != null; prev = nd, nd = nd.getNext()){
                if(nd.getComputer().getConnectionNumber()==cnn){
                    if(prev==null){
                        head = head.getNext();
                    }
                    else
                        prev.setNext(nd.getNext());
                }
            }
            return exists;
        }
        
        public void showList(){
        System.out.println("Linked List");
            for(Node nd=head; nd!=null; nd=nd.getNext()){
                System.out.println(nd.getComputer().toString());
            }
   
        }
    }
    
    

