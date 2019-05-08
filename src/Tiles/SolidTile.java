// Matthew Lad
// 5/2/2019

package Tiles;


public class SolidTile implements Tile{

    private final int type;
    private double weight;
    private boolean isWet;
    
    
    public SolidTile(){
        this.type = Tile.SOLID;
        this.weight = Math.random()*100;
        this.isWet = false;
    }
    
    
    public boolean isIsWet() {
        return isWet;
    }
    
    @Override
    public int getType() {
        return this.type;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public void changeWeight(double delta) {
        this.weight += delta;
    }

    @Override
    public int compareTo(Object o) {
        Tile tile = (Tile) o;
        if(this.getType() != tile.getType()){
            return 0;
        } else {
            if(this.getWeight() == tile.getWeight()){
                return 2;
            } else if(this.getWeight() < tile.getWeight()){
                return 1;
            } else {
                return 3;
            }
        }
    }
    
    @Override
    public boolean equals(Object o){
        Tile tile = (Tile) o;
        if(this.getType() == tile.getType() &&
                this.getWeight() == tile.getWeight()){
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public String toString(){
        return "(Solid) - " + Math.floor(this.weight * 10000) / 10000;
    }
}
