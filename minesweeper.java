/* sena betul yazicioglu
* yazicioglusenabetul@gmail.com
* This program generates a minesweeper board
*/

import java.util.Random;

public class Minesweeper {

    boolean[][] mineField; // board with mines marked as true
    int rows; // number of rows of the board
    int cols; // number of columns of the board
    int numMines;

    /*
     * Class Constructor
     * 
     * @param int rows Number of rows of the board
     * 
     * @param int cols Number of columns of the board
     * 
     * @param int numMines Number of mines to be placed on the board
     * 
     */
    Minesweeper(int rows, int cols, int numMines) {
        //TODO
        this.rows=rows;
        this.cols=cols;
        this.numMines=numMines;
        mineField=new boolean[rows][cols];
        generateBoard();
        
    }

    /*
     * Generates the mineField
     * 
     * @param int numMines Number of mines to be placed on the mineField
     * 
     * @return boolean[][] Game board with mines placed at random position
     */
    public void generateBoard() {
       //TODO
       Random rand = new Random();

       for(int i=0; i < rows; i++) {
         for(int j=0; j < cols; j++) {
         mineField[i][j]= false;
         }
       }
        
        int randR,randC,count=0;
        while(count!=numMines){
            randR=rand.nextInt(rows);
            randC=rand.nextInt(cols);
            if(mineField[randR][randC]==false){
                mineField[randR][randC]=true;
                count++;
            }
        }
    }
    /*
     * Creates the game
     * 
     * @return int[][] The board with cell values computed
     */
     
     
    public int[][] generateClues() {
        //TODO
        int[][] clues = new int[rows][cols];
        for(int x=0;x<rows;x++){
            for(int y=0;y<cols;y++){
                if(mineField[x][y]!=false)
                clues[x][y]=-1;

                else
                clues[x][y] = countMines(x,y);}
        }

        return clues;
    }

    /*
     * counts the number of adjacent mines to a given cell position
     * 
     * @param int r row position
     * 
     * @param int c column position
     * 
     * @return int number of mines in the surrounding cells
     */
    public int countMines(int r, int c) {
        
        int count = 0;
        //TODO

            if(r!=0 && mineField[r-1][c]!= false)
            count++;

            if(r<rows-1 && mineField[r+1][c]!= false)
            count++;

            if(c!=0 && mineField[r][c-1]!= false)
            count++;

            if(c<cols-1 && mineField[r][c+1]!= false)
            count++;

            if(r!=0 && c!=0 && mineField[r-1][c-1]!= false)
            count++;

            if(r!=0 && c<cols-1 && mineField[r-1][c+1]!= false)
            count++;

            if(r<rows-1 && c!=0 && mineField[r+1][c-1]!=false)
            count++;

            if(r<rows-1 && c<cols-1 && mineField[r+1][c+1]!=false)
            count++;

        
        return count;
    }
        
        

    /*
     * prints the game mine is represented by *
     * 
     * @param int[][] game The game board
     */
    public static void printClues(int[][] clues) {
        //TODO
     }



    public static void main(String[] args) {
        
    }

}
