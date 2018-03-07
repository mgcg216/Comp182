/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MichaelGerrard
 */
public class VectorOfBeverage implements Proj5Interface{
    private int capacity, size;
    private Beverage[] theDrinks;
    
    public VectorOfBeverage(){
        size = 0;
        capacity = 100;
        theDrinks = new Beverage[capacity];
    }
// The purpose of these 3 methods should be obvious
public void insert(Beverage b){ //take from project 2
        Beverage[] tmp;
        if(size == capacity){ //if i dont have room i will make more room
            tmp = new Beverage[capacity *2];
            capacity*=2;
            for(int i = 0; i < size; i++){
                tmp[i] = theDrinks[i];
            }
            theDrinks = tmp;
        }
        theDrinks[size] = b;
        size++;
}
public boolean delete(int key){ //taken from project 2
        int where = -1;
        for(int i = 0; i < size; i++){//searching for the item to delete
            if(theDrinks[i].getRating() == key ){
                where = i;
            }
            
            }
        if(where == -1){//if item can't be found return false
                return false;
            }
            else{//deletes the item and reduces size
                for(int i = where; i < size -1; i++){
                    theDrinks[i] = theDrinks[i+1];
                }
                size --;
        }
        if(size <= capacity / 3){ //shrinks the capacity if needed
            Beverage[] tmp = new Beverage[capacity / 2];
            for(int i =0; i < size ; i++){
                tmp[i] = theDrinks[i];
            }
            capacity /= 2;
            theDrinks = tmp;
        }
        return true;
}
public Beverage find(int key){ //simply goes through the items to find a key
         for(int i =0; i < size ; i++){
            if (theDrinks[i].getRating()== key)
                return theDrinks[i];
        }
        return null;   
}
// Sorts the vector by name
public void insertionSort(){
    String spot;//saves a spot for when we move itmes
    for(int i = 0; i < size-1; i++){
        spot = theDrinks[i].getName();
        int j = i;
        while(j>0 && theDrinks[j-1].getName().compareTo(spot)<0 ){//the sort
            theDrinks[j] = theDrinks[j-1];
            j--;
        }
        theDrinks[j].setName(spot);//putting back our place holder
    }
    
}
// Sorts the vector by rating
public void mergeSort(){
    	mergeSort(0, size -1);
}
private void mergeSort(int begin, int end){
    if( end - begin > 0){
		mergeSort(begin, (begin + end) / 2); //sorts first half
		mergeSort((begin + end) / 2 + 1, end); //sorts second half
		mergeTheHalves(begin, end); //puts the parts together
	}
}

private void mergeTheHalves(int begin, int end){//deterimes where the parts should be merged
    Beverage[] tmp = new Beverage[end - begin +1];//pretty much sorting
    int a = begin; int b = (begin + end)/2 +1;//a and b are goingthrough the halfs
    for(int i = 0; i <= (end - begin);i++){//and sorting the items
        if(a<=(begin + end)/2 && b <=end){
            if(theDrinks[a].getRating()<theDrinks[b].getRating()){
                tmp[i] = theDrinks[a];
                a++;
            }
            else{
                tmp[i] = theDrinks[b];
                b++;
            }
        }
        else if (a>(begin +end)/2 ){
            tmp[i]= theDrinks[b];
            b++;
        }
        else if (b>end){
            tmp[i]= theDrinks[a];
            a++;
            
        }
    }
    for(int i = 0; i <= (end-begin); i++){ //puts the items back into Drinks{}
        theDrinks[i]=tmp[i];
    }
}
// Sorts the vector by calories
public void bucketSort(){
   
}
// Prints out all items in th
    
    
    
}
