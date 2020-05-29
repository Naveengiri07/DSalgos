package dsalgopracticecodes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Graph{
	HashMap<String,Vertex> vertices = new HashMap<>();
	
	public int countVertex() {                 //To get number of vertices
		return vertices.size();
	}
	
	public boolean containsVertex(String vertexName) {         //To check if a vertex is already present or not
		return vertices.containsKey(vertexName);
	}
	
	public void addVertex(String vertexName) {             //To add new Vertex
		Vertex vertex = new Vertex();
		vertices.put(vertexName, vertex);
	}
	
	public int numberOfEdges() {                           //To get the number of edges
		ArrayList<String> keys = new ArrayList<>(vertices.keySet());
		int count = 0;
		for(String key : keys) {
			Vertex vtx = vertices.get(key);
			count+= vtx.neighbours.size();
		}
		return count;
	}
	
	public boolean containsEdge(String firstVertex, String secondVertex){
		Vertex v1 = vertices.get(firstVertex);
		Vertex v2 = vertices.get(secondVertex);
		//check if fist and second vertex exist or not and if second is a neighbor of first
		if(v1==null || v2==null || !v1.neighbours.containsKey(secondVertex)) {
			return false;
		}
		return true;
	}
	
	public void addEdge(String firstVertex, String secondVertex, int cost){
		if(containsEdge(firstVertex,secondVertex)) {          //To check if the edge already exist
			System.out.println("Edge Already Exist!!!");
		}
		else {
			Vertex first = vertices.get(firstVertex);
			Vertex second = vertices.get(secondVertex);
			first.neighbours.put(firstVertex, cost);
			second.neighbours.put(secondVertex, cost);
		}
	}
	
	public void removeVertex(String vertexName){
		Vertex vertex = vertices.get(vertexName);
		ArrayList<String> neighbourNames = new ArrayList<>(vertex.neighbours.keySet());
		for(String key : neighbourNames) {
			Vertex v = vertices.get(key);
			v.neighbours.remove(vertexName);
		}
	}
	
	public void removeEdge(String firstVertex, String secondVertex){
		if(containsEdge(firstVertex, secondVertex)) {
			Vertex first = vertices.get(firstVertex);
			Vertex second = vertices.get(secondVertex);
			first.neighbours.remove(firstVertex);
			second.neighbours.remove(secondVertex);
			
		}
		else {
			System.out.println("Edge does not Exist!!!");
		}
	}
	
	public void print() {
		System.out.println("************************************");
		for(Map.Entry<String , Vertex> v : vertices.entrySet()) {
			System.out.println(v.getKey()+" "+v.getValue().neighbours);
		}
		System.out.println("************************************");
	}
}


class Vertex{
	HashMap<String,Integer> neighbours = new HashMap<>();      //Vertex Name is passes as key(String)
	                                                           //And edge cost is passed as value(Integer)
	
}
public class MyGraph {

	public static void main(String[] args) {
		Graph graph = new Graph();
		graph.addVertex("A");
		graph.addVertex("B");
		graph.addVertex("C");
		graph.addVertex("D");
		graph.addVertex("E");
		graph.addVertex("F");
		graph.addVertex("G");
		graph.addEdge("A","B",2);
		graph.addEdge("A","D",3);
		graph.addEdge("B","C",7);
		graph.addEdge("D","E",2);
		graph.addEdge("F","G",1);
		graph.print();
		System.out.println("Is A present? "+graph.containsVertex("A"));
		System.out.println("Is there an edge between G and H? "+graph.containsEdge("G", "H"));
		System.out.println("Number of vertexes: "+graph.countVertex());
		System.out.println("Number of edges: "+graph.numberOfEdges());
		
		

	}

}
