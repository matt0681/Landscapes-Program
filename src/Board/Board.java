// 5/2/2019

package Board;

import Layers.Layer;
import Tiles.*;


public class Board {
    
    private Tile[] vertices;
    private int[][] edges;
    private Layer<Tile> layer;

    
    public Board(Tile[] vertices, int[][] edges) {
        this.vertices = vertices;
        this.edges = edges;
        
        layer = new Layer<>(this.vertices, this.edges);
    }
    
    
    
    public Tile getTile(int index){
        return layer.getVertex(index);
    }
    
    public Tile getTile(double weight){
        for(Tile vertex : vertices) {
            if(vertex.getWeight() == weight){
                return vertex;
            }
        }
        return null;
    }
    
    public Layer getLayer() {
        return this.layer;
    }

    public Tile[] getVertices() {
        return vertices;
    }

    public int[][] getEdges() {
        return edges;
    }
}
