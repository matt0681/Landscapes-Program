// 5/7/2019

package Drivers;

import Board.BoardTypeGenerator;
import Board.Board;
import Board.BoardTypes;
import Graphics.Cursor;

public class BoardTester {

    public static void main(String[] args) {

        int boardSize = 3;
        
        Cursor cursor = new Cursor(0, 0, boardSize);
        
        BoardTypeGenerator boardType = new BoardTypeGenerator(BoardTypes.GENERIC3X3WITHWATER, boardSize);
        
        Board board = new Board(boardType.getVertices(), boardType.getEdges());
        
        int currentCursorPosition = cursor.getCurrentBoardPos();
        System.out.println("Current cursor position: " + currentCursorPosition);
        System.out.println("Tile at current cursor position: " + board.getTile(currentCursorPosition));
    }
}
