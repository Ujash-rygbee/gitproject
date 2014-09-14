package question4;

public class node
  {
   int depth;
   node leftnode;
   node rightnode;
   
   
   

public int getDepth() {
	return depth;
}
public void setDepth(int depth) {
	this.depth = depth;
}
public node getLeftnode() {
	return leftnode;
}
public void setLeftnode(node leftnode) {
	this.leftnode = leftnode;
	leftnode.depth=this.depth+1;
}
public node getRightnode() {
	return rightnode;
	
}
public void setRightnode(node rightnode) {
	this.rightnode = rightnode;
	rightnode.depth=this.depth+1;
}
      
 	
}
