/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MichaelGerrard
 */
    public class Node{
        private Dog cmp;
        private Node next;
        
        public Node(Dog d){
            cmp = d;
            next = null;
        }
        
        public Dog getDog(){
            return cmp;
        }
        
        public Node getNext(){
            return next;
        }
        
        public void setNext(Node nd){
            next = nd;
        }
    }
