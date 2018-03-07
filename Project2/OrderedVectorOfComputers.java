/*
 * 
 * @author MichaelGerrard
 */
public class OrderedVectorOfComputers {
    private Computer[] theComputers;
    private int size; 
    private int capacity;
    
    public OrderedVectorOfComputers(){
        size = 0;
        capacity = 10;
        theComputers = new Computer[capacity];
    }
    
    public Computer find(int conNumber){
        int smll = 0;
        int lrg = size-1;
        int avg;
        while(smll <= lrg){
        avg = (smll+lrg)/2;
            if(theComputers[avg].getConnectionNumber()>conNumber){
                lrg = avg -1;
            }
            else if(theComputers[avg].getConnectionNumber()<conNumber){
                smll = avg +1;
            }
            else{
                return theComputers[avg];
            }
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
        for(int i = 0; i < size; i++){
            if(c.getConnectionNumber()<theComputers[size-1-i].getConnectionNumber()){
                theComputers[size-i] = theComputers[size-1-i];
            }
            else{
                theComputers[size-i] = c;
                break;
            }
        }
        if(size == 0 || theComputers[0].getConnectionNumber()>c.getConnectionNumber()){
            theComputers[0]=c;
        }
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
        System.out.println("Ordered Vector");
        for(int i = 0; i < size; i++){
            System.out.println(theComputers[i].toString());
        }
    }
    
}


