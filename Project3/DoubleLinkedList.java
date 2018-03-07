/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MichaelGerrard
 */
public class DoubleLinkedList {
    private DNode head;
    private DNode tail;
    private int size;
    public DoubleLinkedList(){
        head = null;
        tail = null;
        size = 0;
    }
    
    public void insertAtEnd(Dog d){
        DNode nd = new DNode(d);
        if(tail == null){
            tail = head = nd;
        }    
        else{
            tail.setNext(nd);
            nd.setPrev(tail);
            tail = nd;
        }
        size++;

    }
    
    public void insertAtFront(Dog d){
        DNode nd = new DNode(d);
        if(head == null){
            head = tail = nd;
        }
        else{
            head.setPrev(nd);
            nd.setNext(head);
            head = nd;
        }
        size++;
    }
    
    public Dog find(int tag){
            Dog result = null;
            for(DNode nd=head; nd!=null; nd=nd.getNext()){
                if(nd.getDog().getTagNumber()==tag){
                    result = nd.getDog();
                }
            }
            return result;
    }
    public void delete(int tag){
        for (DNode nd = head; nd !=null ; nd = nd.getNext()){
		if(nd.getDog().getTagNumber() == tag){
                    if(nd != tail){
			nd.getNext().setPrev(nd.getPrev());
                    }
                    else{
                        tail = nd.getPrev();
                    }
                    if(nd !=head){
                        nd.getPrev().setNext(nd.getNext());
                    }
                    else{
                        head = nd.getNext();
                    }    
		}
        }
        size--;
    }
    
    public void showAll(){
        System.out.println("Double Linked List");
            for(DNode nd=head; nd!=null; nd=nd.getNext()){
                System.out.println(nd.getDog().toString());
            }
   
    }
    
    public void showBeginAndEnd(){
        System.out.println("Linked List");
            int show = 2;
            DNode nd = head;
            DNode dn = tail;
            if(size > show * 2){  
                for(int i = 0; i <  show; i++){
                    System.out.println(nd.getDog().toString());
                    nd.getNext();
                }
                for(int i = 0; i <  show; i++){
                    dn.getPrev();
                }
                for(int i = 0; i <  show; i++){
                    System.out.println(nd.getDog().toString());
                    dn.getNext();
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

