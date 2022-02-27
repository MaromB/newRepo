//import java.util.ArrayList;
//import java.util.Iterator;
//
//public class Node1 implements Iterable {
//	
//	private int id;
//	private ArrayList<Edge> edgesAL = new ArrayList<Edge>();
//	private ArrayList<Integer> connecdedID = new ArrayList<Integer>();
//
//	public Node1(int id) {
//		this.id=id;
//	}	
//	
//	public int getID() {
//		return id;
//	}
//	
//	public int getNumOfEdges() {
//		return edgesAL.size();		
//	}
//	
//	public void connect(Edge edge) {
//		edgesAL.add(edge);
//		if(edge.getFrom() == this) 
//			connecdedID.add(edge.getTo().id);
//		else connecdedID.add(edge.getFrom().id);
//		
//	}
//	
//	public String toString() {
//		return  getID()+connecdedID.toString();
//	}
//	
//
//	public interface EdgeIterable {
//		EdgeIterator iterator();
//	}
//
//	
//}
