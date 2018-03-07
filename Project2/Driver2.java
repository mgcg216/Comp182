/*Michael Guerrero
* June 17, 2015
* Comp 182
* Project 2
* This project uses C
*/
import java.util.Scanner;
import java.io.*;
import java.util.*;
public class Driver2 {
    
private Computer comp;  
private VectorOfComputers myVOC;
private OrderedVectorOfComputers myOVOC; 
private LLOfComputers myLL;
private Scanner scan;
public Driver2(){
    myVOC = new VectorOfComputers();
    myOVOC = new OrderedVectorOfComputers();
    myLL = new LLOfComputers();
    scan = new Scanner(System.in);
    
}
    public static void main(String[] args) {
        System.out.println("Welcome to Project 2");
        Driver2 d = new Driver2();
        d.commands();
    }
    /* This method will handel the commands for the user
    * The method breaks up the the string into commands that can be 
    */
    public void commands(){
        String[] brokenUp;
        String cmds;
        System.out.println("Next Command");
        cmds = scan.nextLine();
        brokenUp = cmds.split(" ");
        while(!brokenUp[0].equals("quit")){
            switch(brokenUp[0]){
                case "help":
                    handleHelp();
                    break;
                case "add": //add new
                    handleAdd();
                    break;
                case "delete": //delete <connection number>
                    handleDelete(Integer.parseInt(brokenUp[1]));
                    break;
                case "find": //find <connection number>
                    handleFind(Integer.parseInt(brokenUp[1]));
                    break;
                case "show": //show all
                    handleShow();
                    break;
                case "quit":
                    System.exit(0);
                    break;
            }
        System.out.println("Next Command");
        cmds = scan.nextLine();
        brokenUp = cmds.split(" ");
        }
    }
    //Prints out the help commands
    private void handleHelp(){
                    System.out.println("Legal commands");
                    System.out.println("add new");
                    System.out.println("delete <connection number>");
                    System.out.println("find <connection number>");
                    System.out.println("show all");
                    System.out.println("quit");
    }
    //Runs the add comands in thier repected classes
    //I need to adjust for all values of Computer
    private void handleAdd(){
        Computer c;
        String details;
        String[] pcs;
                    System.out.println("List info (user:ip:connection number)\n> ");
                    details = scan.nextLine();
                    pcs = details.split(":");
                    c = new Computer(pcs[0],pcs[1],Integer.parseInt(pcs[2]));
                    myVOC.insert(c);
                    myOVOC.insert(c);
                    myLL.insert(c); 
    }
    //Pretty much just gets the connection numbers and then deletes the object
    private void handleDelete(int conNum){
                    myVOC.delete(conNum);
                    myOVOC.delete(conNum);
                    myLL.delete(conNum);
        
    }
    //Find the object based on the connection number 
    private void handleFind(int conNum){
        Computer c;
                    c = myVOC.find(conNum);
                    System.out.println("Vector \n" + c);
                    c = myOVOC.find(conNum);
                    System.out.println("Ordered Vector \n" + c);
                    c = myLL.find(conNum);
                    System.out.println("Linked List \n" + c);    
    }
    //Display the data structure
    private void handleShow(){
                    myVOC.showArray();
                    myOVOC.showArray();
                    myLL.showList();
    }
    
}
