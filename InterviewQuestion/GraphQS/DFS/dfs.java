
public class graphdfs {
	public final int maxsize = 20;
	public int cursize;
	public Vertex[] vertexarray;
	public int[][] adjmat;
	public Stack thestack;
	public Queue theQueue;
	
	public graphdfs(){
		cursize = 0;
		vertexarray = new Vertex[maxsize];
		adjmat = new int[maxsize][maxsize];
		for(int i = 0; i < maxsize; i++){
			for(int j = 0 ; j < maxsize; j++){
				adjmat[i][j] = 0;
			}
		}
		thestack = new Stack();
		theQueue = new Queue();
	}
	//// =================== MAIN functions for adding the vertex and adding the edge to the list and array ====================
	public void addVertex(char Vert){
		Vertex v = new Vertex(Vert);
		vertexarray[cursize++] = v;
	}
	
	public void displayvertex(int v){
		System.out.print(vertexarray[v].label);
	}
	
	public void insertedge(int row, int col){
		adjmat[row][col] = 1;
		adjmat[col][row] = 1;
	}
	//// ======================================================================
	
	
	// basically dfs is a separate method that uses a different array to push and pop the graph vertices according their
	// their availability in the graph. Since it is a depth first search so it first needs to travek to the depth o
	public void dfs(){
		vertexarray[0].wasVisited = true;
		displayvertex(0);
		thestack.push(0);
		while(!thestack.isEmpty()){
			int v = getadjacentVertex(thestack.peek());
			if(v == -1 ){
				thestack.pop();
			}else{
				vertexarray[v].wasVisited = true;
				displayvertex(v);
				thestack.push(v);
			}			
		}
		
		for(int i = 0; i < cursize; i++){
			vertexarray[i].wasVisited = false;
		}
	}
	
	public int getadjacentVertex(int v){
		for(int i = 0 ; i < cursize; i++){
			if(adjmat[v][i] == 1 && vertexarray[i].wasVisited == false){
				return i;
			}
		}

		return -1;
	}
	
	public void display(){
		for(int i = 0; i < cursize; i++){
			for(int j = 0; j < cursize; j++){
				System.out.print(adjmat[i][j]);
			}
			System.out.println(" ");
		}
	}
	

	
	
	public static void main(String[] args){
		graphdfs gp = new graphdfs();
		gp.addVertex('A');
		gp.addVertex('B');
		gp.addVertex('C');
		gp.addVertex('D');
		gp.addVertex('E');
		
		gp.insertedge(0, 1);
		gp.insertedge(1, 2);
		gp.insertedge(0, 3);
		gp.insertedge(3, 4);
		//gp.display();
		//gp.dfs();
		gp.bfs();
	}
}
