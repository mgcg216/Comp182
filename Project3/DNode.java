/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MichaelGerrard
 */
public class DNode {
    private Dog cmp;
        private DNode next;
        private DNode prev;
        
        public DNode(Dog d){
            cmp = d;
            next = null;
            prev = null;
        }
        
        public Dog getDog(){
            return cmp;
        }
        
        public DNode getNext(){
            return next;
        }
       
        
        public void setNext(DNode nd){
            next = nd;
        }
        
        public DNode getPrev(){
            return prev;
        }
        
        public void setPrev(DNode nd){
            prev = nd;
        }
}
