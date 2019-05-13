// 5/7/2019

package Graphics;

public class Cursor {
    
    private int x;
    private int y;
    private final int boardSize;
    

    public Cursor(int xPos, int yPos, int boardSize) {
        this.x = xPos;
        this.y = yPos;
        this.boardSize = boardSize;
    }
    
    
    
    public void moveCursorUp() {
        if(y > 0){
            this.y--;
        }
    }

    public void moveCursorDown() {
        if(y < boardSize){
            this.y++;
        }
    }
    
    public void moveCursorLeft() {
        if(x > 0){
            this.x--;
        }
    }
    
    public void moveCursorRight() {
        if(x < boardSize){
            this.x++;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    public int getCurrentBoardPos(){
        int[][] arr = new int[boardSize][boardSize];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = count;
                count++;
            }
        }
        return arr[x][y];
    }
}
