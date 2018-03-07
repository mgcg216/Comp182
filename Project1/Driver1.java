/*
 * MichaelGerrard
 */
/*Michael Guerrero
* June 11, 2015
* Comp 182
* Project 1
* This project can look into a 2d array and manipulate and analyze
*/
import java.util.Scanner;
import java.io.*;
import java.util.*;
public class Driver1 {

private int rows, cols;
private int[][] array;
public Driver1(){
    
}
    public static void main(String[] args) {//this part only runs the other methods
        System.out.println("Welcome to Project 0.");
            Scanner scan = new Scanner(System.in);
            Driver1 d = new Driver1();
            d.readFile();
            String cmds = scan.nextLine();
            while(!cmds.equals("quits")){
            d.commands(cmds);
            cmds = scan.nextLine();
            }
            
    }
    public void readFile(){ //read file program taken from the professor
      boolean worked;
      String fileNameIn, fileNameOut;
      Scanner in = new Scanner(System.in);
      Scanner fin = null;
      PrintWriter fout = null;



      /* Asks for file to read 
       * Retries until given a file that exists
       */
      worked = false;
      while (!worked) {
         try {
            System.out.println("Enter input file name.");
            fileNameIn = in.nextLine();
            fin = new Scanner(new File(fileNameIn));
            worked = true;
         }
         catch (FileNotFoundException e) {
            System.out.println("No such file. Try again.");
         }
      }
     

      rows = fin.nextInt();
      cols = fin.nextInt();
      
      array = new int[rows][cols]; //my code using for loops to created a 2d array
      for(int i=0; i < rows; i++)
          for(int j =0; j < cols; j++)
              array[i][j] = fin.nextInt();
     

     fin.close();
    }
    
    public void printToFile(){
      String fileNameOut;
      Scanner in = new Scanner(System.in);
      PrintWriter fout = null;
       /* Asks for file to write
       * Retries until can create file
       */

      boolean worked = false;
      while (!worked) {
         try {
            System.out.println("Enter output file name.");
            fileNameOut = in.next();
            fout = new PrintWriter(new File(fileNameOut));
            worked = true;
            
         }
         catch (FileNotFoundException e) {
            System.out.println("Couldn't create file. Try again.");
         }
      }
        for(int i=0; i < rows; i++){ 
          for(int j =0; j < cols; j++){
            fout.print(array[i][j] + " "); 
          }
          fout.println();
        }  
        fout.close();
    }
    
    public void commands(String cmds){ //this splits the strings into an array
        String[] brokenUp = cmds.split(" ");//and use that array to determine the
                                            //the commands needed
        
        switch(brokenUp[0]){
            case "help":
                System.out.println("show array");
                System.out.println("which rows sorted");
                System.out.println("which cols sorted");
                System.out.println("increase row i by n");
                System.out.println("increase col j by n");
                System.out.println("quit");
                break;
            case "show":
                showArray();
                break;
            case "which":
                if(brokenUp[1].equals("rows"))
                    checkSortRow();
                else if(brokenUp[1].equals("cols"))
                    checkSortCols();
                break;
            case "increase": //increase row i by n
                if(brokenUp[1].equals("row"))
                    addRows(Integer.parseInt(brokenUp[2]), Integer.parseInt(brokenUp[4]));
                else if(brokenUp[1].equals("col"))
                    addCols(Integer.parseInt(brokenUp[2]), Integer.parseInt(brokenUp[4])); 
                break;
            case "quit":
                printToFile();
                System.exit(0);
                break;
            
        }
    }
    public void showArray(){ //simply printing out the array
        for(int i=0; i < rows; i++){ 
          for(int j =0; j < cols; j++){
            System.out.print(array[i][j] + " "); 
          }
          System.out.println();
        }  
    }
    public void checkSortRow(){ // goes through a row checking if the next item 
        for (int rw = 0; rw < rows; rw++){ //is bigger than the current
        boolean sorted = true;
        for(int i = 0; i < cols - 1; i++){
           if(array[rw][i] - array[rw][i+1] > 0){
               sorted = false;
             } 
           
        }
        if(sorted)
        System.out.println(rw);
        }
    }
    
        public void checkSortCols(){ //same as above except for collums
        for (int cl = 0; cl < cols; cl++){
        boolean sorted = true;
        for(int i = 0; i < rows - 1; i++){
           if(array[i][cl] - array[i +1][cl] > 0){
               sorted = false;
             } 
           
        }
        if(sorted)
        System.out.println(cl);
        }
    }
    

    public void addRows(int rw, int add){ //simply adding rows by a single int
        for (int i =0; i < cols ; i++){
            array[rw][i] = array[rw][i] + add;
        }

    }
    
    public void addCols(int cols, int add){//same as above with cols
        for (int j = 0; j< rows; j++){
            array[j][cols] = array[j][cols] + add;
        }
    }
}
