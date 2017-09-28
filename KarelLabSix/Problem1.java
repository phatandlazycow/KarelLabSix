
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem1 extends Robot
{
    int[] rows = new int[9];
    int rowNumber = 0;
    int [] trueRows = new int [9];
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
        public void sortBeepers() {
    move();
    turnLeft();
        while(frontIsClear()){
        move();
    }
    turnLeft();
        for (int i = 8; i>0; i --){
        moveToRow();
        clearRow();
    }
    sortRows();
   }        
       public void turnRight(){
           turnLeft();
           turnLeft();
           turnLeft();
    }
    public void clearRow(){        
        turnLeft();
        int beeperRow=0;
        while(nextToABeeper()){
            beeperRow+=1;
            pickBeeper();
            move();
        }
        rows[rowNumber]=beeperRow;
        rowNumber+=1;
        turnAround();
        moveToGround();
    }
    public void turnAround(){
    turnLeft();
    turnLeft();
    }
    public void moveToGround(){
     while(frontIsClear()){
        move();
        }
     turnLeft();
    }
    public void sortRows(){
            for (int a = 1; a<7; a++){
                int greater = 0;
                for (int b = 1; b<7; b++){
                    if (rows[a]>= rows[b]){
                    greater +=1;                   
                }
                }
                trueRows [greater] = a;
            }
    }
    public void moveToRow(){
            while(!nextToABeeper()){
                move();           
    }}

}

