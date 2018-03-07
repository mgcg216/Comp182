/*
 * MichaelGerrard
 */
public class Computer {
    private String userName;
    private String ipAddress;
    private int connectionNumber;
    
    public Computer(String un, String ia, int cn){
        userName = un;
        ipAddress = ia;
        connectionNumber = cn;
    }
    
    public String toString(){
        return userName + ":"+ ipAddress +":" +connectionNumber;
}
    
    public void getUserName(String u){
        userName = u;
    }
    
    public String setUserName(){
        return userName;
    }
    
    public void getIpAddress(String i){
        ipAddress = i;
    }
    
    public String setIpAddress(){
        return ipAddress;
    }
    
    public void setConnectionNumber(int c){
        connectionNumber = c;
    }
    
    public int getConnectionNumber(){
        return connectionNumber;
    }
}
