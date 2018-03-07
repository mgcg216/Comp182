/*
 * @author MichaelGerrard
 */
public class Dog {
    private String name;
    private String breed;
    private int tagNumber;
    
    public Dog(String nm, String bd, int tg){
        name = nm;
        breed = bd;
        tagNumber = tg;
    }
    
    public String toString(){
        return name + breed + tagNumber;
    }
    
    public void getName(String nm){
        name = nm;
    }
    
    public String setName(){
        return name;
    }
    
    public void getBreed(String bd){
        breed = bd;
    }
    
    public String setBreed(){
        return breed;
    }
    
    public int getTagNumber(){
        return tagNumber;
    }
    
    public void setTagNumber(int tg){
        tagNumber = tg;
    }
    
}

