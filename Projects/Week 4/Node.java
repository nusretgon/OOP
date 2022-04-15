package week5;

public class Node {

	public Node LeftNode;
	public int name;
	
	Node(int name)		// We are creating this constructor for the first element
	{
		this.name=name;
		this.LeftNode=null;
	}
	Node(Node LeftNode,int name)	// We define normal constructor.
	{
		this.LeftNode=LeftNode;
		this.name=name;
	}
	public String getPath()
	{
		if(LeftNode==null)
			return name+"";
		return LeftNode.getPath()+"/"+name; //  recursive call
	}											
}
