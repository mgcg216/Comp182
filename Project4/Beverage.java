/*
 * @author MichaelGerrard
 */
public class Beverage {//not much to say just accessors and mutators with no
    private String name;//parameters
    private int rating;
    private int calories;
    
    public Beverage(String nm, int rt, int cl){
        name = nm;
        rating = rt;
        calories = cl;
    }
    
    public String toString(){
        return name + rating + calories;
    }
    
    public String getName(){  
        return name;
    }
    
    public void setName(String nm){
        name = nm;
    }
    
    public int getRating(){
        return rating;
    
    }
    
    public void setRating(int rt){
        rating = rt;
    }
    
    public int getCalories(){
        return calories;
    }
    
    public void setCalories(int cl){
        calories = cl;
    }
    
}

