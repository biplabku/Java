// @author- Biplab Das
// 
public class Graph {
	public int maxsize = 20;
	public Vertex[] vertices;
	public int[][] adjmat;
	public int currSize = 0;
	
	
	public Graph(){
		adjmat = new int[maxsize][maxsize];
		currSize = -1;
		vertices = new Vertex[maxsize];
		for(int i = 0; i < maxsize; i++){
			for(int j = 0; j < maxsize; j++){
				adjmat[i][j] = 0;
			}
		}
	}
	
	
	
	public void insertNode(char Vert){
		currSize++;
		Vertex V = new Vertex(Vert);
		vertices[currSize] = V;
	}
	
	// since its a directed graph hence there will only be one path between two nodes. Not 2 way traffic between the node
	public void insertadjGraph(int row, int col){
		adjmat[row][col] = 1;			// since the edge would be connected to 2 vertex hence 2 times
		//adjmat[y][x] = 1;			// the value 1 is assigned to 2 different locations;
	}
	
	
	// if we need to check whether there is a path that exists between 2 vertices
	public boolean checkRoute(char fvertex, char nvertex){
		// get the index of the input character and then check its neighbours in the adjacent matrix.
		// if its 1 then that means  that the route or the path exists.
		// so the program should be simple- only the fact is we need to check only that particular array in the adjacent matrix
		int indexrow = 0;
		int indexcol = 0;
		for(int i = 0; i < 4; i++){
			if(fvertex == vertices[i].label){
				indexrow = i;
				if(checkAdjacent(indexrow, indexcol)){
					return true;
				}
			}
		}
		return false;
		// after the index we need to only check that particular row for any "1s"
	}
	public boolean checkAdjacent(int indexR, int indexC ){
		if(adjmat[indexR][indexC]  == 1){
			return true;
		}
		return false;
	}
	
	
	
	public static void main(String[] args){
		// insert the nodes to build a graph
		Graph gp = new Graph();
		gp.insertNode('A');
		gp.insertNode('B');
		gp.insertNode('C');
		gp.insertNode('D');
		
		gp.insertadjGraph(0, 1);
		gp.insertadjGraph(1, 2);
		gp.insertadjGraph(2, 0);
		gp.insertadjGraph(3, 2);
		
		System.out.println(gp.checkRoute('B', 'A'));
		
	}
}
