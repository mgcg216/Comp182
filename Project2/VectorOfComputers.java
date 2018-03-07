/*
 * 
 * MichaelGerrard
 */
public class VectorOfComputers {
    private Computer[] theComputers;
    private int size; 
    private int capacity;
    
    public VectorOfComputers(){
        size = 0;
        capacity = 10;
        theComputers = new Computer[capacity];
    }
    
    public Computer find(int conNumber){
        for(int i =0; i < size ; i++){
            if (theComputers[i].getConnectionNumber()== conNumber)
                return theComputers[i];
        }
        return null;
    }
    
    public void insert(Computer c){
        Computer[] tmp;
        if(size == capacity){
            tmp = new Computer[capacity *2];
            capacity*=2;
            for(int i = 0; i < size; i++){
                tmp[i] = theComputers[i];
            }
            theComputers = tmp;
        }
        theComputers[size] = c;
        size++;
    }
    
    public boolean delete(int conNumber){
        
        int where = -1;
        for(int i = 0; i < size; i++){
            if(theComputers[i].getConnectionNumber() == conNumber ){
                where = i;
            }
            
            }
        if(where == -1){
                return false;
            }
            else{
                for(int i = where; i < size -1; i++){
                    theComputers[i] = theComputers[i+1];
                }
                size --;
        }
        if(size <= capacity / 3){
            Computer[] tmp = new Computer[capacity / 2];
            for(int i =0; i < size ; i++){
                tmp[i] = theComputers[i];
            }
            capacity /= 2;
            theComputers = tmp;
        }
        return true;
    }
    
    public void showArray(){
        System.out.println("Vector");
        for(int i = 0; i < size; i++){
            System.out.println(theComputers[i].toString());
        }
    }
}


