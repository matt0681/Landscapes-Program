// Matthew Lad
// 5/2/2019

package Layers;

import java.util.*;

public class Layer<V> implements Graph<V> {
    
    //class scope variables
    protected List<V> vertices = new ArrayList<>(); // Store vertices

    protected List<List<Edge>> neighbors = new ArrayList<>(); // Adjacency lists
    
    // Construct an empty layer
    public Layer() {
    }

    // Construct a layer from vertices and edges stored in arrays
    public Layer(V[] vertices, int[][] edges) {
        for (int i = 0; i < vertices.length; i++) {
            addVertex(vertices[i]);
        }

        createAdjacencyLists(edges, vertices.length);
    }

    @Override
    // Add a vertex to the layer
    public boolean addVertex(V vertex) {
        if (!vertices.contains(vertex)) {
            vertices.add(vertex);
            neighbors.add(new ArrayList<Edge>());
            return true;
        } else {
            return false;
        }
    }

    // Create adjacency lists for each vertex
    private void createAdjacencyLists(int[][] edges, int numberOfVertices) {
        for (int i = 0; i < edges.length; i++) {
            addEdge(edges[i][0], edges[i][1]);
        }
    }

    @Override
    // Add an edge to the layer
    public boolean addEdge(int u, int v) {
        return addEdge(new Edge(u, v));
    }

    @Override
    // Add an edge to the layer
    public boolean addEdge(Edge e) {
        if (e.u < 0 || e.u > getSize() - 1) {
            throw new IllegalArgumentException("No such index: " + e.u);
        }

        if (e.v < 0 || e.v > getSize() - 1) {
            throw new IllegalArgumentException("No such index: " + e.v);
        }

        if (!neighbors.get(e.u).contains(e)) {
            neighbors.get(e.u).add(e);
            return true;
        } else {
            return false;
        }
    }

    @Override
    // Return the number of vertices in the layer
    public int getSize() {
        return vertices.size();
    }

    @Override
    // Return the vertices in the layer
    public List<V> getVertices() {
        return vertices;
    }

    @Override
    // Return the object for the specified vertex
    public V getVertex(int index) {
        return vertices.get(index);
    }

    @Override
    // Return the index for the specified vertex object
    public int getIndex(V v) {
        return vertices.indexOf(v);
    }

    @Override
    // Return the neighbors of the specified vertex
    public List<Integer> getNeighbors(int index) {
        List<Integer> result = new ArrayList<>();
        for (Edge e : neighbors.get(index)) {
            result.add(e.v);
        }

        return result;
    }

    @Override
    // Return the degree for a specified vertex
    public int getDegree(int index) {
        return neighbors.get(index).size();
    }

    @Override
    // Print the edges
    public void printEdges() {
        for (int u = 0; u < neighbors.size(); u++) {
            System.out.print(getVertex(u) + " (" + u + "): ");
            for (Edge e : neighbors.get(u)) {
                System.out.print("(" + getVertex(e.u) + ", "
                        + getVertex(e.v) + ") ");
            }
            System.out.println();
        }
    }

    @Override
    // Clear the layer
    public void clear() {
        vertices.clear();
        neighbors.clear();
    }

    @Override
    // Remove vertex v and return true if successful
    public boolean remove(V v) {
        return true; // Implementation left as an exercise
    }

    @Override
    // Remove edge (u, v) and return true if successful
    public boolean remove(int u, int v) {
        return true; // Implementation left as an exercise
    }
}
