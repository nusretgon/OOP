package week4;

public class Node {

	public Node LeftNode;
	public int name;
	
	Node(int name)		// We are creating two constructor because of first node
	{
		this.name=name;
		this.LeftNode=null;
	}
	Node(Node LeftNode,int name)
	{
		this.LeftNode=LeftNode;
		this.name=name;
	}
	public String getPath()
	{
		if(LeftNode==null)
			return name+"";
		return LeftNode.getPath()+"/"+name;		//  recursive call
	}											
}
