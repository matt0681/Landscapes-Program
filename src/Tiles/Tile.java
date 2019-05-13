// 5/2/2019

package Tiles;


public interface Tile {

    public final int SOLID = 0;
    public final int LIQUID = 1;

    
    public int getType();
    
    public double getWeight();
    
    public void changeWeight(double delta);
    
    
    // 0 is returned if the tile types are not the same
    // 1 is returned if tile weight is less than "o"
    // 2 is returned if tile weight is equal to "o"
    // 3 is returned is tile weight is greater than "o"
    public int compareTo(Object o);

    public String toString();
    
    public boolean equals(Object o);
}
