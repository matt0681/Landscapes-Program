// 5/7/2019

package Board;

import Tiles.LiquidTile;
import Tiles.SolidTile;
import Tiles.Tile;

public class BoardTypeGenerator {
    
    private Tile[] vertices;
    private int[][] edges;
    private int type;
    private int boardSize;

    public BoardTypeGenerator(int type, int boardSize) {
        this.type = type;
        this.boardSize = boardSize;
        
        createVertices();
        createEdges();
    }

    
    private void createVertices() {
        switch(type){
            case 0:
                Tile[] vertices0 = {
                    new SolidTile(), new LiquidTile(), new SolidTile(), // 0 1 2
                    new SolidTile(), new LiquidTile(), new SolidTile(), // 3 4 5
                    new SolidTile(), new LiquidTile(), new SolidTile() // 6 7 8
                };
                this.vertices = vertices0;
                break;
            case 1:
                Tile[] vertices1 = {
                    new SolidTile(), new SolidTile(), new SolidTile(), // 0 1 2
                    new SolidTile(), new SolidTile(), new SolidTile(), // 3 4 5
                    new SolidTile(), new SolidTile(), new SolidTile() // 6 7 8
                };
                this.vertices = vertices1;
                break;
        }
    }

    private void createEdges() {
        int[][] edges = {
            {0, 1}, {0, 3},
            {1, 0}, {1, 2}, {1, 4},
            {2, 1}, {2, 5},
            {3, 0}, {3, 4}, {3, 6},
            {4, 1}, {4, 3}, {4, 5}, {4, 7},
            {5, 2}, {5, 4}, {5, 8},
            {6, 3}, {6, 7},
            {7, 6}, {7, 4}, {7, 8},
            {8, 5}, {8, 7}
        };
        this.edges = edges;
    }
    
    public Tile[] getVertices() {
        return vertices;
    }

    public int[][] getEdges() {
        return edges;
    }

    public int getType() {
        return type;
    }

    public int getBoardSize() {
        return boardSize;
    }
}
